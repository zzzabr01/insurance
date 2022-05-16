package main.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;


public class Calculate {
	
	/**
	 * 生存保險金計算
	 * @author Connor
	 * @param insuranceAmount 保額
	 * @param multiple 保額倍數
	 * @param deathDate 死亡日期
	 * @param lastSurvivalPaymentDate 前次生存金發放日期
	 * @param nextSurvivalPaymentDate 下次生存發放日期
	 * @return
	 */
	public static BigDecimal survivorInsurance(Double insuranceAmount,Double multiple, Date deathDate,Date lastSurvivalPaymentDate, Date nextSurvivalPaymentDate) {
		
		BigDecimal result;
		BigDecimal insuranceAmountBD =  new BigDecimal(insuranceAmount);
		BigDecimal multipleBD = new BigDecimal(multiple);
		BigDecimal datePeriodA = new BigDecimal(DateUtils.periodOfDay(deathDate, lastSurvivalPaymentDate));
		BigDecimal datePeriodB = new BigDecimal(DateUtils.periodOfDay(nextSurvivalPaymentDate, lastSurvivalPaymentDate));
		result = insuranceAmountBD.multiply(multipleBD).multiply((datePeriodA.divide(datePeriodB,2, RoundingMode.HALF_UP)));
		
		return result;
	}
	
	/**
	 * 未到期保費-身故
	 * @param insuredAmount 身故日當期實繳保費
	 * @param frequency 繳費別 (年繳/半年繳/季繳/月繳)
	 * @param deathDate 身故日
	 * @param nextDeathDateOfYear 身故日次一保單周年日身故日/事故日次一保單周年日事故日
	 * @param currentDeathDateOfYear 身故日當年度保單周年日/事故日當年度保單周年日
	 * @param nextDateShouldPay 身故日次一應繳日或繳費期滿日(主約時)
	 * @param lastDateShouldPay 身故日前一應繳日
	 * @return
	 */
	public static Double unexpiredPremiumWithDeath(
			Double insuredAmount,
			String frequency, 
			Date deathDate, 
			Date nextDeathDateOfYear, 
			Date currentDeathDateOfYear,
			Date nextDateShouldPay,
			Date lastDateShouldPay) {
		Double result = null;
		switch(frequency) {
		case "年繳":
			result = insuredAmount * (DateUtils.periodOfDay(nextDeathDateOfYear, deathDate) / DateUtils.periodOfDay(nextDeathDateOfYear, currentDeathDateOfYear));
			break;
		case "半年繳":
		case "季繳":
		case "月繳":
			result = insuredAmount * (DateUtils.periodOfDay(nextDateShouldPay, deathDate) / (DateUtils.periodOfDay(nextDateShouldPay, lastDateShouldPay)));
			break;
		default:
			break;
		}
		return result;
	}
	
	/**
	 * 未到期保費-事故
	 * @param insuredAmount 事故日當期實繳保費
	 * @param frequency 繳費別 (年繳/半年繳/季繳/月繳)
	 * @param accidentDate 事故日
	 * @param nextAccidentDateOfYear 事故日次一保單周年日事故日
	 * @param currentAccidentDateOfYear 事故日當年度保單周年日
	 * @param nextDateShouldPay 事故日次一應繳日或繳費期滿日(主約時)
	 * @param lastDateShouldPay 事故日前一應繳日)
	 * @return
	 */
	public static Double unexpiredPremiumWithAccident(
			Double insuredAmount,
			String frequency, 
			Date accidentDate, 
			Date nextAccidentDateOfYear, 
			Date currentAccidentDateOfYear,
			Date nextDateShouldPay,
			Date lastDateShouldPay) {
		
		Double result = null;
		switch(frequency) {
		case "年繳":
			result = insuredAmount * (DateUtils.periodOfDay(nextAccidentDateOfYear, accidentDate) / DateUtils.periodOfDay(nextAccidentDateOfYear, currentAccidentDateOfYear));
			break;
		case "半年繳":
		case "季繳":
		case "月繳":
			result = insuredAmount * (DateUtils.periodOfDay(nextDateShouldPay, accidentDate) / (DateUtils.periodOfDay(nextDateShouldPay, lastDateShouldPay)));
			break;
		default:
			break;
		}
		return result;
	}
	
	/**
	 * 
	 * @param condition 給付條件
	 * @param frequency 各繳別之年繳費次數
	 * @param totalCount 至身故發生時總應繳費次數
	 * @param rate 各繳別之表定費率(含次健費率)
	 * @param interest 利率
	 * @param occurrenceDate 發生日
	 * @param lastAnnualDate 最近一次保單週年日
	 * @param lastPaymentDate 最近一次繳費日
	 * @return
	 */
	public static Double amountOfInsuranceAndInterest(String condition, Integer frequency, Integer totalCount, Double rate, Double interest, Date occurrenceDate, Date lastAnnualDate, Date lastPaymentDate) {
		Double result = null;
		switch (condition) {
			case "繳費期間":
				result = rate * totalCount * (1 + DateUtils.periodOfDay(lastPaymentDate, occurrenceDate) / DateUtils.getTotalDayOfYear(occurrenceDate) * interest) 
						+ rate * (totalCount * (totalCount -1) / 2 / frequency * interest);
				break;
			case "繳費期滿":
				result = rate * totalCount * (1 + DateUtils.periodOfDay(lastAnnualDate, occurrenceDate) / DateUtils.getTotalDayOfYear(occurrenceDate) * interest) 
						+ (totalCount * (totalCount + 1) / 2 + totalCount * frequency * Math.abs(DateUtils.getYear(lastAnnualDate) - (DateUtils.getYear(lastPaymentDate) + 1))) * interest / frequency;
				break;
			default:
				break;
		}

		return result;
	}
	
	/**
	 * 躉繳保險費金額加計利息
	 * @param insuredAmountWithSinglePayment 變更契約狀況時之「躉繳保險費」
	 * @param accidentDate 事故日
	 * @param rate 利率
	 * @param currentContractEffectDate 事故當年度契變(15)之生效日
	 * @param nextContractEffectDate 事故下年度契變(15)之生效日
	 * @return
	 */
	public static Double amountOfSinglePaymentAndInterest(Integer insuredAmountWithSinglePayment,Date accidentDate, Double rate,
			Date currentContractEffectDate,Date nextContractEffectDate) {
		long yearBetweenAccidentAndContractEffectDate = DateUtils.periodOfYear(accidentDate, currentContractEffectDate);
		return insuredAmountWithSinglePayment + 
				(insuredAmountWithSinglePayment * yearBetweenAccidentAndContractEffectDate * rate)+
				(insuredAmountWithSinglePayment * rate *
				((DateUtils.periodOfDay(accidentDate, currentContractEffectDate) + 1) / (DateUtils.periodOfDay(nextContractEffectDate, currentContractEffectDate))));
	}
	
	
}

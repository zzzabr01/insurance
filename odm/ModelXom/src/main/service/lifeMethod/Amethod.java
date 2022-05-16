package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;
import main.utils.Calculate;

/**
 * Amethod 的A代表 AA1、CA1、DA1 中間位置的A，其模式為 self * v1
 * 
 * 第一碼的字母分別代表 A: 保額 B: 當年度保額 C: 身故保單價值準備金 D: 事故保單價值準備金 E: 所繳保險費總額 F: 已繳保險費總額 G:
 * 年繳保險費總和 H: 空號 I: 展期保額 J: 躉繳保險費 K: 當年度增額保額 L: 未到期保費 M: 解約金 N:
 * 減額繳清保險金額重新計算之增額後保額 O: 生存保險金 P: 增值回饋分享金 Q: 增額繳清保險金額 R: 住院醫療提前給付日額 S: 主約保額
 * 
 * @author TPI
 *
 */
public class Amethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0;
		BigDecimal finalCalculatingNum;
		
		if("OA1".equals(calculType)){
			return Calculate.survivorInsurance(
					paymentAmountModel.getInsuranceAmount(), 
					paymentAmountModel.getMultiple(), 
					paymentAmountModel.getDateOfDeath(),
					paymentAmountModel.getLastSurvivalPaymentDate(),
					paymentAmountModel.getNextSurvivalPaymentDate());
		}
		else if ("AA".equals(calculType.substring(0, 2))) { // AA1 ~ AA5
			first = paymentAmountModel.getInsuranceAmount();
			v1 = findAAThird(paymentAmountModel, calculType.substring(2));
		} else if ("BA1".equals(calculType)) {
			first = paymentAmountModel.getCurrentYearInsuranceAmt();
			v1 = paymentAmountModel.getMultiple();
		} else if ("CA".equals(calculType.substring(0, 2))) {// CA1 ~ CA2
			first = paymentAmountModel.getPolicyValueAmount();
			v1 = findCAThird(paymentAmountModel, calculType.substring(2));
		} else if ("EA".equals(calculType.substring(0, 2))) {// EA1 ~ EA2
			first = Double.valueOf(paymentAmountModel.getPaidTotalPremiumA());
			v1 = findEAThird(paymentAmountModel, calculType.substring(2));
		} else if ("FA1".equals(calculType)) {
			first = paymentAmountModel.getPaidTotalPremiumB();
			v1 = 1.0;
		} else if ("GA1".equals(calculType)) {
			first = paymentAmountModel.getAnnualTotalInsurancePremium();
			v1 = paymentAmountModel.getYearPremiumsPaidMultiple();
		} else if ("HA1".equals(calculType)) { // 已註銷此公式
			first = 1.0;
			v1 = 1.0;
		} else if ("IA1".equals(calculType)) {
			first = paymentAmountModel.getRolloverInsuranceAmt();
			v1 = 1.0;
		} else if ("JA1".equals(calculType)) {
			first = paymentAmountModel.getSinglePremium();
			v1 = paymentAmountModel.getSinglePremiumMultiple();
		} else if ("KA1".equals(calculType)) {
			double tmp1 = 0.0, tmp2 = 0.0, tmpSum = 0.0;
			tmp1 = paymentAmountModel.getInsuranceAmount();
			tmp2 = paymentAmountModel.getIncreaseValueInsuranceAmt();
			tmpSum = tmp1 + tmp2;
			first = tmpSum; // 當年度增額保額 = 保額+增值保額
			v1 = 1.0;
		} else if ("LA1".equals(calculType)) {
			first = paymentAmountModel.getUnearnedPremium();
			v1 = 1.0;
		} else if ("MA1".equals(calculType)) {
			first = paymentAmountModel.getCashSurrenderValue();
			v1 = 1.0;
		} else if ("NA1".equals(calculType)) {
			first = paymentAmountModel.getReducedPaidAmt();
			v1 = 1.0;
		}else if ("PA1".equals(calculType)) {
			// P:增值回饋分享金
			first = paymentAmountModel.getIncreaseValueAmt();
			v1 = 1.0;
		} else if ("QA1".equals(calculType)) {
			// Q: 增額繳清保險金額
			first = paymentAmountModel.getIncreaseInsuranceForPayOff();
			v1 = 1.0;
		} else if ("RA1".equals(calculType)) {
			// R: 住院醫療提前給付日額
			first = paymentAmountModel.getAccelerationProfitHospitalizationDailyAmount();
			v1 = paymentAmountModel.getInpatientDays();
		} else if ("SA1".equals(calculType)) {
			// 主約保額*{0.01}
			first = paymentAmountModel.getMainInsuranceAmount();
			v1 = 0.01;
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingA(first, v1);
		return finalCalculatingNum;
	}

	private static double findAAThird(LifePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1": // 保額*保額倍數
			result = paymentAmountModel.getMultiple();
			break;

		case "2": // 保額*保單年度數
			result = Double.valueOf(paymentAmountModel.getPolicyYear());
			break;

		case "3": // 保額*身故當時之保單年度
			result = 1.0;
			break;

		case "4": // 保額*繳費年期
			result = Double.valueOf(paymentAmountModel.getPremiumPaymentTerm());
			break;

		case "5": // 保額*(多項失能等級比例加總)
			result = paymentAmountModel.getDisabledPayRatio();
			break;
		default:
			result = 1.0;
		}

		return result;
	}

	private static double findCAThird(LifePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": // 身故保單價值準備金 * 1
			result = 1.0;
			break;

		case "2": // 身故保單價值準備金*保價係數
			result = Double.valueOf(paymentAmountModel.getInsuredCoefficient());
			break;

		}
		return result;
	}

	private static double findEAThird(LifePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": // 所繳保險費總額 * 1
			result = 1.0;
			break;

		case "2": // 所繳保險費總額*{所繳保險費總額(倍數)}
			result = Double.valueOf(paymentAmountModel.getTotalPremiumsPaidMultiple());
			break;

		}
		return result;
	}

}

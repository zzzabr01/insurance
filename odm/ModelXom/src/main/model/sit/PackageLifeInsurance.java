package main.model.sit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.model.LifeInsurance;
import main.utils.DateUtils;

public class PackageLifeInsurance {
	
	private static final SimpleDateFormat DATE_FOTMAT = new SimpleDateFormat("yyyyMMdd");

	public static LifeInsurance fromRequest(String productNo, String accidentReason, Date accidentDate, InsuranceInfo insuranceInfo) throws ParseException {
		LifeInsurance lifeInsurance = new LifeInsurance();
		lifeInsurance.setContractStatus(insuranceInfo.getLIPI_ST());
		lifeInsurance.setDeath(true);
		lifeInsurance.setProductEffectiveDate(DATE_FOTMAT.parse(insuranceInfo.getLIPI_INSU_BEG_DATE()));
		lifeInsurance.setCauseOfAccident(accidentReason);
		lifeInsurance.setProductNo(productNo);
		lifeInsurance.setCaseAccidentDate(accidentDate);
		//前端尚未送來的資訊 先hardcode
		lifeInsurance.setTotallyDisability(true);
		lifeInsurance.setPaymentStatus("期間");
		Date birthDay = DATE_FOTMAT.parse(insuranceInfo.getLIPI_BIRTH());
		Integer actualAge = DateUtils.periodOfYear(birthDay, new Date());
		lifeInsurance.setActualAge(actualAge);
		return lifeInsurance;
	}

}

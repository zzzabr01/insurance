package main.model.sit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.model.LifeInsurance;

public class PackageLifeInsurance {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

	public static LifeInsurance fromRequest(String productNo, String accidentReason, Date accidentDate, InsuranceInfo insuranceInfo) throws ParseException {
		LifeInsurance lifeInsurance = new LifeInsurance();
		lifeInsurance.setContractStatus(insuranceInfo.getLIPI_ST());
		lifeInsurance.setDeath(true);
		lifeInsurance.setProductEffectiveDate(dateFormat.parse(insuranceInfo.getLIPI_INSU_BEG_DATE()));
		lifeInsurance.setCauseOfAccident(accidentReason);
		lifeInsurance.setProductNo(productNo);
		lifeInsurance.setCaseAccidentDate(accidentDate);
		System.out.println(lifeInsurance);
		return lifeInsurance;
	}
}

package main.service.comprehensiveMethod;

import java.math.BigDecimal;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;


public class Dmethod {

    public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType){
        //取 calculType AB1 BB1 CB1...公式中所需要的值
        double first =1, v1 = 1, v2 = 1;
        BigDecimal finalCalculatingNum;
        if("AD".equals(calculType.substring(0,2))){ //AD1 ~ AD2
        	double[] varArr = new double[2];
            first = paymentAmountModel.getInsuranceAmount();
            varArr = findADThird(paymentAmountModel, calculType.substring(2));
            v1 = varArr[0];
            v2 = varArr[1];
        }else if("ID1".equals(calculType)) {
        	first = paymentAmountModel.getAnnualTotalInsurancePremium();
        	v1 = paymentAmountModel.getAnnualTotalPremiumPaidMultiple();
        	v2 = paymentAmountModel.getReceiveTotalSurvivalInsurance();
        } else
            ;
        
        
        finalCalculatingNum = CalculateUtil.finalCalculatingD(first , v1 , v2);
        return finalCalculatingNum;
    }
    

    private static double[] findADThird (ComprehensivePaymentAmountModel paymentAmountModel, String thirdString){
    	double[] results = new double[2];
    	switch (thirdString) {
    	case "1" : // 保額*{保額倍數}-已給付失能保險金
    		results[0] = paymentAmountModel.getMultiple();
    		results[1] = paymentAmountModel.getOneToSixDisabilityPensionAlreadyReceive();
    		break;
    		
    	case "2" : // 保額*失能等級比例-已給付失能保險金
    		results[0] = paymentAmountModel.getDisabledPayRatio();
    		results[1] = paymentAmountModel.getPaidDisabilityInsuranceAmt();
    		break;
    	}
    	
		return results;
    }



}

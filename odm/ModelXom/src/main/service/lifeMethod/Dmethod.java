package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;


public class Dmethod {

    public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType){
        //取 calculType AB1 BB1 CB1...公式中所需要的值
        double first =1, v1 = 1, v2 = 1;
        BigDecimal finalCalculatingNum;
        if("AD".equals(calculType.substring(0,2))){ //AD1 ~ AD2
            first = paymentAmountModel.getInsuranceAmount();
            v1 = findADThird(paymentAmountModel, calculType.substring(2));
            v2 = paymentAmountModel.getPaidDisabilityInsuranceAmt();
        }  else if("ED2".equals(calculType)){ //所繳保險費總額*{所繳保險費總額(倍數)}-已領取生存保險金總額
        	 first = paymentAmountModel.getPaidTotalPremiumA();
        	 v1 = paymentAmountModel.getTotalPremiumsPaidMultiple ();
        	 v2 = paymentAmountModel.getReceiveTotalSurvivalInsurance();
        } else
            ;
        
        
        finalCalculatingNum = CalculateUtil.finalCalculatingD(first , v1 , v2);
        return finalCalculatingNum;
    }
    

    private static double findADThird (LifePaymentAmountModel paymentAmountModel, String thirdString){
    	Double result = 1.0;
    	switch (thirdString) {
    	case "1" : // 保額*{保額倍數}-已給付失能保險金
    		result = Double.valueOf(paymentAmountModel.getMultiple());
    		break;
    		
    	case "2" : // 保額*失能等級比例-已給付失能保險金
    		result = Double.valueOf(paymentAmountModel.getDisabledPayRatio());
    		break;
    	}
    	
		return result;
    }



}

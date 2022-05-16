package main.service.comprehensiveMethod;

import java.math.BigDecimal;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;


public class Wmethod {

    public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType){
        //取 calculType AB1 BB1 CB1...公式中所需要的值
        double first =1, v1 = 1, v2 = 1 , v3=1;
        BigDecimal finalCalculatingNum;
        if("AW1".equals(calculType)){
        	first = paymentAmountModel.getInsuranceAmount();
        	v1 = paymentAmountModel.getMultiple();
        	v2 =  paymentAmountModel.getDisabledPayRatio();
        	v3 = paymentAmountModel.getPaidDisabilityInsuranceAmt();
        }  else
            ;
        
        
        finalCalculatingNum = CalculateUtil.finalCalculatingW(first , v1 , v2, v3);
        return finalCalculatingNum;
    }
    

    

}

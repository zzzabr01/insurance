package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Gmethod {

    public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType){
        //取 calculType AB1 BB1 CB1...公式中所需要的值
        double first =1, v1 = 1, v2 = 1, v3 =1, v4 = 1, v5 = 1, v6 =1;
        BigDecimal finalCalculatingNum;
        if("AG1".equals(calculType)){
            first = paymentAmountModel.getInsuranceAmount();
            v1 = paymentAmountModel.getMultiple(); 
            v2 = paymentAmountModel.getPaymentAnnualRate();
            v3 = paymentAmountModel.getPremiumPaymentTerm();
            v4 = paymentAmountModel.getPaymentExpireRate();
            v5 = paymentAmountModel.getPolicyYear();
            v6 = paymentAmountModel.getPremiumPaymentTerm();
        } else
            ;

        finalCalculatingNum = CalculateUtil.finalCalculatingG(first , v1 , v2, v3, v4, v5, v6);
        return finalCalculatingNum;
        
    }


}

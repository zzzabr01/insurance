package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Nmethod {

    public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType){
        //取 calculType AB1 BB1 CB1...公式中所需要的值
        double first =1, v1 = 1, v2 = 1, v3 =1;
        BigDecimal finalCalculatingNum;
        if("GN1".equals(calculType)){
            first = paymentAmountModel.getAnnualTotalInsurancePremium();
            v1 = 1.06;
            v2 = paymentAmountModel.getInsuranceAmount();
            v3 = 1.0;
        } else
            ;

        finalCalculatingNum = CalculateUtil.finalCalculatingN(first , v1 , v2, v3);
        return finalCalculatingNum;
        
    }


}

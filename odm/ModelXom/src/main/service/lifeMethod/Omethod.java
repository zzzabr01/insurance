package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Omethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType){
        //取 calculType AB1 BB1 CB1...公式中所需要的值
        double first =1, v1 = 1, v2 = 1;
        BigDecimal finalCalculatingNum;
        if("OO1".equals(calculType)){
            first = paymentAmountModel.getSurvivalInsurance();
            v1 = 90.0;
            v2 = paymentAmountModel.getLastReceiveSurvivalInsuranceAge();

        } else
            ;

        finalCalculatingNum = CalculateUtil.finalCalculatingO(first , v1 , v2);
        return finalCalculatingNum;
        
    }

}

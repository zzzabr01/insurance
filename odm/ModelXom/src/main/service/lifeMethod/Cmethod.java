package main.service.lifeMethod;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

import java.math.BigDecimal;

public class Cmethod {

    public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType){
        //取 calculType AB1 BB1 CB1...公式中所需要的值
        double first =1, v1=1;
        BigDecimal finalCalculatingNum;

        if("CC1".equals(calculType)){ //身故保單價值準備金-已給付失能保險金
            first = paymentAmountModel.getPolicyValueAmount();
            v1 = paymentAmountModel.getPaidDisabilityInsuranceAmt();
        } else if("GC1".equals(calculType)){ //年繳保險費總和- 已領生存保險金總和
            first = paymentAmountModel.getAnnualTotalInsurancePremium();
            v1 =  paymentAmountModel.getReceiveTotalSurvivalInsurance();
        } else if("IC1".equals(calculType)){ //展期保額 - 已給付老年住院醫療提前給付保險金
            first = paymentAmountModel.getRolloverInsuranceAmt();
            v1 =  paymentAmountModel.getReceiveAccelerationProfitHospitalizationAmt();
        } else
            ;

        finalCalculatingNum = CalculateUtil.finalCalculatingC(first , v1);
        return finalCalculatingNum;
    }



 



}

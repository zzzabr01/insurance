package main.controller;

	
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import main.model.payment.AdditionalPaymentAmountModel;

public class AdditionalEntrance {

	private static final int CALCULATION_CODE_LENGTH = 3;
	private static final String METHOD_SUFFIX = "method";

    public static BigDecimal receivceFromIBM (AdditionalPaymentAmountModel paymentAmountModel, String calculationType, String calculationCode){

        ArrayList<BigDecimal> collectResult = new ArrayList<>();
        BigDecimal returnNum;
        
      for(int index = 0; index < calculationCode.length(); index += CALCULATION_CODE_LENGTH) {
    	String singleCalculationCode = calculationCode.trim().substring(index, index + CALCULATION_CODE_LENGTH);
    	String methodCode = singleCalculationCode.substring(1,2);
    	String className = methodCode + METHOD_SUFFIX;
    	try {
            Class<?> cls = Class.forName("main.service.additionalMethod."+ className);
            Method m = cls.getDeclaredMethod("totalNum", AdditionalPaymentAmountModel.class, String.class);
            Object a = m.invoke(null, paymentAmountModel , singleCalculationCode);
            returnNum =  (BigDecimal) a;
            collectResult.add(returnNum);
        } catch (ClassNotFoundException|InvocationTargetException|NoSuchMethodException|IllegalAccessException e) {
            e.printStackTrace();
        }
    }
        
        returnNum = Collections.max(collectResult);
        return returnNum;
    }

    public static void main(String... args)
    {
    	AdditionalPaymentAmountModel paymentAmountModel = new AdditionalPaymentAmountModel();
//      paymentAmountModel.setInsuranceAmount(200000.0);
//      paymentAmountModel.setExpenseLoading(3500000.00);
      
//      paymentAmountModel.setIncreaseValueInsuranceAmt(99.0); //AE1
//      paymentAmountModel.setCurrentYearInsuranceAmt(66.0); //BA1
//      paymentAmountModel.setSurvivalAmountOfActualSurvivalDays(10000.25);
//      paymentAmountModel.setAnnualTotalInsurancePremium(55452.5);
//      paymentAmountModel.setInsuredCoefficient(33.33);
//      paymentAmountModel.setInsuranceAmount(200000.0);
//      paymentAmountModel.setExpenseLoading(1200000.0);
      receivceFromIBM(paymentAmountModel, "01", "CA1"); //AA4AE1AI1
    }



}

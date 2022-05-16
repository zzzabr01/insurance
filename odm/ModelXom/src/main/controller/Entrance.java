package main.controller;

	
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import main.model.payment.LifePaymentAmountModel;
import main.model.payment.PaymentAmountModel;

public class Entrance {

	private static final int CALCULATION_CODE_LENGTH = 3;
	private static final String METHOD_SUFFIX = "method";
	private static final String SERVICE_PATH_SUFFIX = "main.service.";
	private static final String CALCULATE_METHOD_NAME = "totalNum";

    public static BigDecimal receivceFromIBM (PaymentAmountModel paymentAmountModel, String calculationType, String calculationCode){

    	 ArrayList<BigDecimal> collectResult = new ArrayList<>();
         BigDecimal returnNum;
        
      for(int index = 0; index < calculationCode.length(); index += CALCULATION_CODE_LENGTH) {
    	String singleCalculationCode = calculationCode.trim().substring(index, index + CALCULATION_CODE_LENGTH);
    	String methodCode = singleCalculationCode.substring(1,2);
    	String className = methodCode + METHOD_SUFFIX;
    	try {
            Class<?> cls = Class.forName(SERVICE_PATH_SUFFIX + paymentAmountModel.obtainPaymentModelName() + className);
            Method m = cls.getDeclaredMethod(CALCULATE_METHOD_NAME, paymentAmountModel.obtainClassType(), String.class);
            Object a = m.invoke(null, paymentAmountModel , singleCalculationCode);
            returnNum = (BigDecimal) a;
            collectResult.add(returnNum);
        } catch (ClassNotFoundException|InvocationTargetException|NoSuchMethodException|IllegalAccessException e) {
            e.printStackTrace();
        }
    }
        
      if(collectResult.size() != 0) {
    	  returnNum = Collections.max(collectResult);
          System.out.println(returnNum);
          return returnNum;
      }
      
      return BigDecimal.ZERO;
    }

    public static void main(String... args) throws ParseException
    {
      LifePaymentAmountModel paymentAmountModel = new LifePaymentAmountModel();
//      paymentAmountModel.setMainInsuranceAmount(0.0);
//      paymentAmountModel.setReceivedMonth(0.0);
//      paymentAmountModel.setAssumedInterestRate(0.0);
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
      Date deathDate = dateFormat.parse("2020/1/1");
      Date lastDate = dateFormat.parse("2019/7/1");
      Date nextDate = dateFormat.parse("2021/7/1");
      paymentAmountModel.setInsuranceAmount(100000.0);
		paymentAmountModel.setMultiple(1.0);
		paymentAmountModel.setDateOfDeath(deathDate);
		paymentAmountModel.setLastSurvivalPaymentDate(lastDate);
		paymentAmountModel.setNextSurvivalPaymentDate(nextDate);
      receivceFromIBM(paymentAmountModel, "01", "AP1"); 
//      PensionInsurance p = new PensionInsurance("", false, "", "", "");
    }



}

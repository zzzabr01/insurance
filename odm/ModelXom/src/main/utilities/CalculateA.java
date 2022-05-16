package main.utilities;


import java.math.BigDecimal;

public class CalculateA {

    public static double a01(double insuranceAmount , double v1){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        sum = insuranceAmountB.multiply(v1B);
        return sum.doubleValue();
    }

    public static Double a02(Double insuranceAmount , double v1 , double v2){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        sum = insuranceAmountB.multiply(v1B).add(v2B);
        return sum.doubleValue();
    }

    public static Double a03(Double insuranceAmount , double v1 , double v2){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        sum = insuranceAmountB.multiply(v1B).subtract(v2B);
        return sum.doubleValue();
    }

    public static Double a04(double insuranceAmount , double v1 , double v2, double v3){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        BigDecimal v3B =   new BigDecimal(Double.toString(v3));
        sum = insuranceAmountB.multiply(((v1B.add(v2B)).multiply(v3B)));
        return sum.doubleValue();
    }



    public static Double a05(double insuranceAmount , double v1 , double v2, double v3, double v4, double v5, double v6){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        BigDecimal v3B =   new BigDecimal(Double.toString(v3));
        BigDecimal v4B =   new BigDecimal(Double.toString(v4));
        BigDecimal v5B =   new BigDecimal(Double.toString(v5));
        BigDecimal v6B =   new BigDecimal(Double.toString(v6));
        sum = insuranceAmountB.multiply(((v1B.add(v2B)).multiply(v3B).add(v4B).multiply((v5B.subtract(v6B)))));
        return sum.doubleValue();
    }


    public static Double a06(double insuranceAmount , double v1 , double v2, double v3){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        BigDecimal v3B =   new BigDecimal(Double.toString(v3));
        sum = insuranceAmountB.multiply(( (v1B.subtract(v2B).multiply(v3B))));
        return sum.doubleValue();
    }

    public static Double a07(double insuranceAmount , double v1 , double v2, double v3){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        BigDecimal v3B =   new BigDecimal(Double.toString(v3));
        sum = insuranceAmountB.multiply(v1B).add(v2B).add(v3B);
        return sum.doubleValue();
    }

    public static Double a08(double insuranceAmount , double v1 , double v2){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        sum = insuranceAmountB.subtract(v1B).add(v2B);
        return sum.doubleValue();
    }


    public static Double a09(double insuranceAmount , double v1 , double v2, double v3){
        BigDecimal sum = new BigDecimal(String.valueOf(0.0));
        BigDecimal insuranceAmountB =  new BigDecimal(Double.toString(insuranceAmount));
        BigDecimal v1B =   new BigDecimal(Double.toString(v1));
        BigDecimal v2B =   new BigDecimal(Double.toString(v2));
        BigDecimal v3B =   new BigDecimal(Double.toString(v3));
        BigDecimal one =   new BigDecimal(String.valueOf(1));
        sum = insuranceAmountB.multiply(v1B.multiply((v2B.subtract(v3B).add(one))));
//        sum = insuranceAmount * v1 * (v2 - v3 + 1);
        return sum.doubleValue();
    }

    public static Double a10(double insuranceAmount , double v1){
        Double sum =0.0;
        sum = insuranceAmount + v1;
        return sum;
    }

    public static void main(String... args)
    {
        Double insuranceAmout = 1.5 , v1=2.0 , v2 = 3.0, v3 = 4.0, v4=5.0, v5 = 10.0, v6= 8.0;
        System.out.println( insuranceAmout *v1 + v2+ v3 );
        System.out.println( a07(insuranceAmout, v1, v2 , v3));
    }


}

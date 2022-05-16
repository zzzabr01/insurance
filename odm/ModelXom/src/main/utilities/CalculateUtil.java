package main.utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateUtil {

	// first * v1
	public static BigDecimal finalCalculatingA(double first, double v1) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		sum = firstBigDecimal.multiply(v1B);
		return sum;
	}

	// first + v1
	public static BigDecimal finalCalculatingB(double first, double v1) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		sum = firstBigDecimal.add(v1B);
		return sum;
	}

	// first - v1
	public static BigDecimal finalCalculatingC(double first, double v1) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		sum = firstBigDecimal.subtract(v1B);
		return sum;
	}

	// first * V1 - V2
	public static BigDecimal finalCalculatingD(double first, double v1, double v2) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		sum = firstBigDecimal.multiply(v1B).subtract(v2B);
		return sum;
	}

	// first * V1 + V2
	public static BigDecimal finalCalculatingE(double first, double v1, double v2) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		sum = firstBigDecimal.multiply(v1B).add(v2B);
		return sum;
	}

	// first * ((v1 + v2) * v3)
	public static BigDecimal finalCalculatingF(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = firstBigDecimal.multiply(((v1B.add(v2B)).multiply(v3B)));
		return sum;
	}

	// first * ((v1 + v2) * v3 + v4 * (v5 - v6))
	public static BigDecimal finalCalculatingG(double first, double v1, double v2, double v3, double v4, double v5,
			double v6) {
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		BigDecimal v4B = new BigDecimal(Double.toString(v4));
		BigDecimal v5B = new BigDecimal(Double.toString(v5));
		BigDecimal v6B = new BigDecimal(Double.toString(v6));
		BigDecimal s1 = v1B.add(v2B).multiply(v3B);
		BigDecimal s2 = v4B.multiply((v5B.subtract(v6B)));
		BigDecimal s3 = s1.add(s2);
		return firstBigDecimal.multiply(s3);
	}

	// first * (v1 - v2) * v3
	public static BigDecimal finalCalculatingH(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = firstBigDecimal.multiply(((v1B.subtract(v2B).multiply(v3B))));
		return sum;
	}

	// first * v1 + v2 + v3
	public static BigDecimal finalCalculatingI(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = firstBigDecimal.multiply(v1B).add(v2B).add(v3B);
		return sum;
	}

	// first - v1 + v2
	public static BigDecimal finalCalculatingJ(double first, double v1, double v2) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		sum = firstBigDecimal.subtract(v1B).add(v2B);
		return sum;
	}

	// first * v1 * (v2 - v3 + 1); 1 = 歲數
	public static BigDecimal finalCalculatingK(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		BigDecimal one = new BigDecimal(String.valueOf(1));
		sum = firstBigDecimal.multiply(v1B.multiply((v2B.subtract(v3B).add(one))));
		return sum;
	}

	// first * v1 * v2 * v3
	public static BigDecimal finalCalculatingL(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = firstBigDecimal.multiply(v1B).multiply(v2B).multiply(v3B);
		return sum;
	}

	// first + v1 + v2
	public static BigDecimal finalCalculatingM(double first, double v1, double v2) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		sum = firstBigDecimal.add(v1B).add(v2B);
		return sum;
	}

	// (first * v1) - (v2 * v3)
	public static BigDecimal finalCalculatingN(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = (firstBigDecimal.multiply(v1B)).subtract((v2B.multiply(v3B)));
		return sum;
	}

	// first * (v1 - v2)
	public static BigDecimal finalCalculatingO(double first, double v1, double v2) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		sum = firstBigDecimal.multiply((v1B).subtract(v2B));
		return sum;
	}

	// first - v1 + v2 +v3
	public static BigDecimal finalCalculatingP(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = firstBigDecimal.subtract(v1B).add(v2B).add(v3B);
		return sum;
	}

	// first * ( v1- v2 +1)
	public static BigDecimal finalCalculatingQ(double first, double v1, double v2) {
		double addOne = 1.0;
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(addOne));
		sum = firstBigDecimal.multiply((v1B).subtract(v2B).add(v3B));
		return sum;
	}

	// first * v1 * (v2 - v3) * ( v4 + v5/ v6)
	public static BigDecimal finalCalculatingR(double first, double v1, double v2, double v3, double v4, double v5,
			double v6) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		BigDecimal v4B = new BigDecimal(Double.toString(v4));
		BigDecimal v5B = new BigDecimal(Double.toString(v5));
		BigDecimal v6B = new BigDecimal(Double.toString(v6));
		sum = firstBigDecimal.multiply(v1B).multiply(v2B.subtract(v3B)).multiply((v4B.add(v5B)).divide(v6B, 2, RoundingMode.HALF_UP));
		return sum;
	}

	// first * V1 * V2
	public static BigDecimal finalCalculatingS(double first, double v1, double v2) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		sum = firstBigDecimal.multiply(v1B).multiply(v2B);
		return sum;
	}

	// (first * V1 - V2) * V3 * V4
	public static BigDecimal finalCalculatingT(double first, double v1, double v2, double v3, double v4) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		BigDecimal v4B = new BigDecimal(Double.toString(v4));
		sum = ((firstBigDecimal.multiply(v1B)).subtract(v2B)).multiply(v3B).multiply(v4B);
		return sum;
	}

	// (first * V1 - V2) * V3 * V4 * V5
	public static BigDecimal finalCalculatingU(double first, double v1, double v2, double v3, double v4, double v5) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		BigDecimal v4B = new BigDecimal(Double.toString(v4));
		BigDecimal v5B = new BigDecimal(Double.toString(v5));
		sum = ((firstBigDecimal.multiply(v1B)).subtract(v2B)).multiply(v3B).multiply(v4B).multiply(v5B);
		return sum;
	}

	// first*V1*V2-v3
	public static BigDecimal finalCalculatingW(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = (firstBigDecimal.multiply(v1B).multiply(v2B)).subtract(v3B);
		return sum;
	}

	// （first* V1 + V2）* V3
	public static BigDecimal finalCalculatingX(double first, double v1, double v2, double v3) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
		BigDecimal v3B = new BigDecimal(Double.toString(v3));
		sum = ((firstBigDecimal.multiply(v1B)).add(v2B)).multiply(v3B);
		return sum;
	}

	// （first * + V1 ) * V2
	public static BigDecimal finalCalculatingY(double first, double v1, double v2) {
		BigDecimal sum = new BigDecimal(String.valueOf(0.0));
		BigDecimal firstBigDecimal = new BigDecimal(Double.toString(first));
		BigDecimal v1B = new BigDecimal(Double.toString(v1));
		BigDecimal v2B = new BigDecimal(Double.toString(v2));
 		sum = (firstBigDecimal.add(v1B)).multiply(v2B) ;
		return sum;
	}
}

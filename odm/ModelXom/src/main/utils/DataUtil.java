package main.utils;

public class DataUtil {

	public static String parseString(String value) {
		if (value == null) {
			return "";
		} else {
			return value;
		}
	}
	
	public static Integer parseInteger(Integer value) {
		if (value == null) {
			return 0;
		} else {
			return value;
		}
	}
}

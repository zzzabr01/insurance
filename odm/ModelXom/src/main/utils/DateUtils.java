package main.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtils {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	
	public static Date parse(String source){
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 取得輸入日期之當天總天數
	 * @param year
	 * @return
	 */
	public static Integer getTotalDayOfYear(Date date) {
		if (null == date)
			return null;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Integer year = cal.get(Calendar.YEAR);
		cal.set(year, Calendar.DECEMBER, 31);
		
		return cal.get(Calendar.DAY_OF_YEAR);
	}
	
	/**
	 * 回傳輸入日期之年分
	 * @param date
	 * @return
	 */
	public static Integer getYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		return cal.get(Calendar.YEAR);
	}
	
	/**
	 * 回傳輸入日期之月份(1 ~ 12)
	 * @param date
	 * @return
	 */
	public static Integer getMonthOfYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		return cal.get(Calendar.MONTH) + 1;
	}
	
	/**
	 * 日期加減
	 * @param calendarUnit
	 * @param count
	 * @param date
	 * @return
	 */
	public static Date dateCalculate(Integer calendarUnit, Integer count, Date date) {
		if (null == calendarUnit || null == count || null == date) 
			return null;
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(calendarUnit, count);
		
		return cal.getTime();
	}
	
	/**
	 * 計算兩日期相隔天數(單位:天)
	 * @param Date first
	 * @param Date second
	 * @return
	 */
	public static long periodOfDay(Date first, Date second) {
		long s = first.getTime() - second.getTime();
        TimeUnit unit = TimeUnit.DAYS;
        long day = unit.convert(s, TimeUnit.MILLISECONDS);
        
        return Math.abs(day);
	}
	
	/**
	 * 兩日期相減的年數
	 * @param Date first
	 * @param Date second
	 * @return
	 */
	public static long periodOfYear(Date first, Date second) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		LocalDate date1 = LocalDate.parse(dateFormat.format(first));
		LocalDate date2 = LocalDate.parse(dateFormat.format(second));
		return ChronoUnit.YEARS.between(date1, date2);
	}
}

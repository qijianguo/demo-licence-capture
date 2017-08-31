package com.learn.springboot.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description: 日期格式化工具类
 * <p>
 * User: Administrator
 * Date: 2017-06-22
 * Time: 16:33
 */
public class DateFormatUtil {

    public static final String ENG_DATE_FROMAT = "EEE, d MMM yyyy HH:mm:ss z";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYY = "yyyy";
    public static final String MM = "MM";
    public static final String DD = "dd";

    /**
     * String类型 + 模板 == String类型
     *
     * @param dataString 字符串类型的日期
     * @param format 格式化模板
     * @return 返回格式化后的字符串
     */
    public static String string2String(String dataString, String format) throws Exception{
        SimpleDateFormat dateFormat = null;
        if(format != null )
            dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dataString);
    }

    /**
     * 格式化日期对象
     *
     * @param date
     * @param format
     * @return
     */
    public static Date date2date(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String str = sdf.format(date);
        try {
            date = sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
        return date;
    }

    /**
     * 时间类型转化为字符串
     *
     * @param date
     * @param formatStr
     * @return
     */
    public static String date2string(Date date, String formatStr) {
        String strDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        strDate = sdf.format(date);
        return strDate;
    }

    /**
     * sql时间对象转换成字符串
     *
     * @param timestamp
     * @param formatStr
     * @return
     */
    public static String timestamp2string(Timestamp timestamp, String formatStr) {
        String strDate = "";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        strDate = sdf.format(timestamp);
        return strDate;
    }

    /**
     * 字符串转换成时间对象
     *
     * @param dateString 字符串类型的时间
     * @param formatStr 格式化模板
     * @return 返回格式化后的日期类型
     */
    public static Date string2date(String dateString, String formatStr) {
        Date formateDate = null;
        DateFormat format = new SimpleDateFormat(formatStr);
        try {
            formateDate = format.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
        return formateDate;
    }

    /**
     * 将Date类型转换为Timestamp类型
     *
     * @param date
     * @return
     */
    public static Timestamp date2timestamp(Date date) {
        if (date == null)
            return null;
        return new Timestamp(date.getTime());
    }

    /**
     * 获取当前年份
     *
     * @return
     */
    public static String getNowYear() {
        SimpleDateFormat sdf = new SimpleDateFormat(YYYY);
        return sdf.format(new Date());
    }

    /**
     * 获取当前月份
     *
     * @return
     */
    public static String getNowMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat(MM);
        return sdf.format(new Date());
    }

    /**
     * 获取当前日
     *
     * @return
     */
    public static String getNowDay(){
        SimpleDateFormat sdf = new SimpleDateFormat(DD);
        return sdf.format(new Date());
    }

    public static Timestamp string2timestamp(String timeStr, String formatStr){
        Date date = string2date(timeStr, formatStr);
        return date2timestamp(date);
    }

    /**
     * 将时间字符串转化时间戳
     *
     * @param timeStr
     * @return
     */
    public static Long string2Long(String timeStr) {
        Date date = string2date(timeStr, YYYY_MM_DD_HH_MM );
        return date.getTime();
    }

    public static void main(String[] args)  throws ParseException {
//        Date date = string2date("2017-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
//        Timestamp timestamp =  date2timestamp(date);
//        String time = date2string(timestamp, "yyyy-MM-dd HH:mm:ss");
//        // System.out.println(timestamp);
//        // System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time));
//        Date date1 = date2date(timestamp, "yyyy-MM-dd HH:mm:ssSSS");
//
//        Date dd = DateFormatUtil.date2timestamp(date1);
//        System.out.println(dd);
        Timestamp timestamp = string2timestamp("2017-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
        System.out.println(timestamp);
    }


}

package com.learn.springboot.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Description: 格式化数字
 * <p>
 * User: Administrator
 * Date: 2017-06-26
 * Time: 18:18
 */
public class NumFormatUtils {

    /**
     * 计算正确率或百分比
     *
     * @param num
     * @param total
     * @param scale 精确几位小数
     * @return
     */
    public static String accuracy(double num, double total, int scale){
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance();
        // 设置精确几位小数
        df.setMaximumFractionDigits(scale);
        // 模式 例如四舍五入
        df.setRoundingMode(RoundingMode.HALF_UP);
        double accuracy_num = num / total * 100;
        return df.format(accuracy_num)+"%";
    }
}

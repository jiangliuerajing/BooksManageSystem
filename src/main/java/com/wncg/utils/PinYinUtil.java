package com.wncg.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**汉字转拼音工具
 * Created by BZhao on 2017/3/12.
 */
public class PinYinUtil {
    /**
     * 获取汉字拼音首字母
     * @param chinese
     * @return
     */
    public static String getAlpha(String chinese){
        String pinyinName = "";
        char[] nameChar = chinese.trim().toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (char namechar : nameChar) {
            if (namechar > 128) {
                try {
                    pinyinName += PinyinHelper.toHanyuPinyinStringArray(
                            namechar, defaultFormat)[0].charAt(0);
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                pinyinName += namechar;
            }
        }
        return pinyinName;
    }

    /**
     * 将字符串中的中文转化为拼音,英文字符不变
     * @param chinese
     * @return
     */
    public static String getPinYin(String chinese){
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        format.setVCharType(HanyuPinyinVCharType.WITH_V);
        String output = "";
        if (chinese != null && chinese.length() > 0 && !"null".equals(chinese)){
            char[] input = chinese.trim().toCharArray();
            try {
                for (char string : input){
                    if (java.lang.Character.toString(string).matches("[\\u4E00-\\u9FA5]+")){
                        String[] temp = PinyinHelper.toHanyuPinyinStringArray(string,format);
                        output += temp[0];
                    }else {
                        output += java.lang.Character.toString(string);
                    }
                }
            }catch (BadHanyuPinyinOutputFormatCombination e){
                e.printStackTrace();
            }
        }else {
            return "*";
        }
        return output;
    }
}

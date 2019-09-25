package com.yc.util;

public class StringUtil {

	/**
	 * 判断是否为空字符串
	 * @param strs
	 * @return true为空，false不为空
	 *
	 */
	public static boolean isNull(String...strs) {
		if(strs==null||strs.length<=0) return true;
		for(String s:strs) {
			if(s==null||"".equals(s)) {
				return true;
			}
		}
		return false;
	}
}

package com.yc.util;

public class StringUtil {

	/**
	 * �ж��Ƿ�Ϊ���ַ���
	 * @param strs
	 * @return trueΪ�գ�false��Ϊ��
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

package com.yutu.util;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class AppCheckIsNull {
	
	public static boolean check(Object params,String passArr) throws IllegalArgumentException, IllegalAccessException{
		
		for (Field f : params.getClass().getDeclaredFields()) {
		    f.setAccessible(true);
		    Type currentType = f.getGenericType();
		    if("int".equals(currentType.toString())){
		    	if("0".equals(f.get(params).toString())){
		    		return false;
		    	}	
		    }
		    if (f.get(params) == null) { //判断字段是否为空，并且对象属性中的基本都会转为对象类型来判断
		    	return false;
		    }
		}
		return true;
		
	}
}

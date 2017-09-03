package com.HTHD_system.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.HTHD_system.pojo.IOSToken;

//ºØ∫œ∞Ô÷˙¿‡
public class CollectionHandle {
public final static String ListToString(List list){
	if (list==null) {
		return null;
	}
	String string=list.toString();
	return string.substring(1,string.length()-1);
	
}

public final static boolean noRepeat(List list){
		HashSet h = new HashSet(list);
	   list.clear();
	   return list.addAll(h);	
}




}

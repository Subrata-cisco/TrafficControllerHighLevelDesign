package com.tm.core;

import java.util.HashMap;
import java.util.Map;

/**
 * General context where you can required info to be used.
 * @author Subrata Saha
 *
 */
public class ApplicationContext {

	private Map<Integer,IcontextItem> context = new HashMap<>();
	public static final Integer TC = 1;
	
	public static IcontextItem getContextItem(Integer i){
		// return from context.
		return null;
	}
	
	public static void setContextItem(Integer i , IcontextItem item){
		// save in context
	}
}

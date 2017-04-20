package com.tm.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tm.exception.TrafficRelatedErrors;
import com.tm.exception.TrafficRelatedException;
/**
 * All related info for a traffic signal e,g Routes,Order etc.
 * @author Subrata Saha
 *
 */
public class RouteDetails {
	
	private Set<Route> routes = new HashSet<>();
	private List<Integer> assignedOrder = new ArrayList<>();
	
	public void setRoutes(Route r,Integer o) throws TrafficRelatedException{
		
		if(assignedOrder.contains(o)){
			throw new TrafficRelatedException(TrafficRelatedErrors.ROUTE_ORDER_ALREADY_ASSIGNED);
		}
		r.setOrder(o);
		routes.add(r); 
	}
	
	public Set<Route> getAllRoutes(){
		// TODO -implement
		return null;
	}

}

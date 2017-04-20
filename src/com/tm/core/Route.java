package com.tm.core;
/**
 * Each individual route.
 * @author Subrata Saha
 *
 */
public class Route {
	
	private int routeID;
	
	private String routeName;
	
	private int routeZone;
	
	private int order;
	
	private int activeTime;
	
	public int getRouteID() {
		return routeID;
	}
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public int getRouteZone() {
		return routeZone;
	}
	public void setRouteZone(int routeZone) {
		this.routeZone = routeZone;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	public int getActiveTime() {
		return activeTime;
	}
	
	public void setActiveTime(int activeTime) {
		this.activeTime = activeTime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + routeID;
		result = prime * result + ((routeName == null) ? 0 : routeName.hashCode());
		result = prime * result + routeZone;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Route other = (Route) obj;
		if (routeID != other.routeID)
			return false;
		if (routeName == null) {
			if (other.routeName != null)
				return false;
		} else if (!routeName.equals(other.routeName))
			return false;
		if (routeZone != other.routeZone)
			return false;
		return true;
	}
	
	
}

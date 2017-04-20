package com.tm.core;

import com.tm.exception.InvalidRouteDataException;
import com.tm.exception.TrafficRelatedException;
/**
 * Each TrafficSignal object though which we can manage set of Routes in that signal.
 * @author Subrata Saha
 *
 */
public interface ITrafficSignal {
	// to find the signal info of any route randomly.
	public SignalInfo getSignalInfo(Route route) throws TrafficRelatedException;
	
	// to find currently green signal Route
    public Route getActiveRoute();
       
    // change the active time for any Route
    public void setActiveTime(Route route);
    
    // assign order of Routes randomly among available Routes
    public ITrafficSignal buildRouteDetails(RouteDetails ro);
    
    // start/restart the traffic signal
    public void startSignalling() throws InvalidRouteDataException,TrafficRelatedException;
}

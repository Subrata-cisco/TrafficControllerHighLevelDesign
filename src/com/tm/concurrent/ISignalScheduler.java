package com.tm.concurrent;

import java.util.Set;

import com.tm.core.Route;
/**
 * The Signal scheduler interface though which individula TrafficSignal 
 * object will manahing Routes status and active time.
 * @author Subrata Saha
 *
 */
public interface ISignalScheduler {
	public void start(Set<Route> routeList);
	public void stop();
}

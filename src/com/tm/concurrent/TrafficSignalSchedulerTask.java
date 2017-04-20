package com.tm.concurrent;

import java.util.Set;

import com.tm.core.Route;

/**
 * The task which will taken by thread scheduler.
 * 
 * @author Subrata Saha
 *
 */
public class TrafficSignalSchedulerTask implements Runnable {
	private Set<Route> routeList;

	public TrafficSignalSchedulerTask(Set<Route> routeList) {

	}

	@Override
	public void run() {
		// find the routes which shall be active now and change the signal info
		// for all of them.

	}

}

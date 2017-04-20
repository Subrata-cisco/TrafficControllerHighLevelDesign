package com.tm.trafficreader;

import com.tm.core.Route;
/**
 * To get sensor data use this api
 * @author Subrata Saha
 *
 */
public interface ISensorClient {
	// this call back will be given to client but not always after configured time.
	// So TrafficData will contain set of Traction
	public void notifySensorResult(Route r, TrafficData td);
}

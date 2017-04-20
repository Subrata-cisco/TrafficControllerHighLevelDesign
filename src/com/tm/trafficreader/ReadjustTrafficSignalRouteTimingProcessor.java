package com.tm.trafficreader;

import com.tm.core.Route;
/**
 * It will re-adjust the active time of each route for a traffic signal upon receiving the data automatically.
 * @author Subrata Saha
 *
 */
public class ReadjustTrafficSignalRouteTimingProcessor implements ISensorDataProcessor,ISensorClient {

	private Route r; 
	private TrafficData td ;
	
	@Override
	public void notifySensorResult(Route r, TrafficData td) {
		// we got the data from sensor for some routes
		process();
	}

	@Override
	public void process() {
		// 1. let us save the data to a data store. later can be used for data analysis and recommendation.
		// 2. Get the TrafficSignal object for the given route and change the active time automatically.
	}

}

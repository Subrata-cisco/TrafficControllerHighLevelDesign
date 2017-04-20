package com.tm;

import com.tm.core.ApplicationContext;
import com.tm.core.Authority;
import com.tm.core.ITrafficController;
import com.tm.core.Route;
import com.tm.core.RouteDetails;
import com.tm.core.TrafficSignal;
import com.tm.exception.TrafficRelatedException;

public class TrafficControllerClient {
	public static void main(String[] args) throws TrafficRelatedException {

		// create the ITrafficController obj
		ITrafficController controller = null;
		ApplicationContext.setContextItem(ApplicationContext.TC,controller); 
		
		// build TrafficSignal objetc
		TrafficSignal ts = new TrafficSignal();
		controller.addTrafficSignal(ts);
		
		// create and populate all route detail.
		Route r1 = new Route();
		Route r2 = new Route();
		
		//create RouteDetails.
		RouteDetails rd = new RouteDetails();
		rd.setRoutes(r1, 1);
		rd.setRoutes(r2, 2);
		
		ts.buildRouteDetails(rd);
		
		//start signalling and system is up
		Authority a = null ; // populate the authority
		
		controller.startAllTrafficSignal(a);
		
	}
}

package com.tm.core;

import com.tm.concurrent.ISignalScheduler;
import com.tm.exception.InvalidRouteDataException;
import com.tm.exception.TrafficRelatedException;
import com.tm.validators.ValidateDetailsConsistancy;
/**
 * The main TrafficSignal object which manages all the Routes, 
 * their active time, signal status, scheduling them to a new timing etc.
 * @author Subrata Saha
 *
 */
public class TrafficSignal implements ITrafficSignal {
	
	private RouteDetails ro;
	
	private ISignalScheduler signalScheduler;

	@Override
	public SignalInfo getSignalInfo(Route route) throws TrafficRelatedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Route getActiveRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActiveTime(Route route) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITrafficSignal buildRouteDetails(RouteDetails ro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startSignalling() throws InvalidRouteDataException {
		// start validating for consistancy.
		new ValidateDetailsConsistancy().validate(ro);
		
		// populate signal info etc which will be decided by this traffic manager and needed for scheduling.
		
		// instantiate signalScheduler from factory or what ever progress design suggest and start..
		signalScheduler.stop();
		
		signalScheduler.start(ro.getAllRoutes());
	}

}

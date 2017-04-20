package com.tm.concurrent;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.tm.core.Route;
/**
 * Schedule the jobs for each Route and change signal status for each job.
 * @author Subrata Saha
 *
 */
public class SignalScheduler implements ISignalScheduler {
	
	ScheduledExecutorService executor = null;
	
	public SignalScheduler(){
		// Have Thread scheduler and schdule the jobs one by one for each Route and change the signal for this Route.
	}

	@Override
	public void start(Set<Route> routeList) {
		// TODO create a task and submit to be run in scheduler.
		TrafficSignalSchedulerTask task = new TrafficSignalSchedulerTask(routeList);
		ScheduledFuture<?> result = executor.scheduleAtFixedRate(task, 2, 5, TimeUnit.SECONDS);

	}

	@Override
	public void stop() {
		// TODO implement

	}

}

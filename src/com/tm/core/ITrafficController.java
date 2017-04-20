package com.tm.core;

/**
 * The main Controller which controls set of Traffic Signal Object
 * @author Subrata Saha
 *
 */
public interface ITrafficController extends IcontextItem {
	
	// api for starting the traffic system
	
	public void addTrafficSignal(TrafficSignal ts);
	public void removeTrafficSignal(TrafficSignal ts);
	public void startAllTrafficSignal(Authority a);
	public void stopAllTrafficSignal(Authority a);
	public void putAllTrafficSignalInNonWorkingHoursMode();
	public void putAllTrafficSignalInWorkingHoursMode();
	
	
	// strat independent process to keep reading sensor data
	public void startSensorDataReading();
	public void stopSensorDataReading();
}

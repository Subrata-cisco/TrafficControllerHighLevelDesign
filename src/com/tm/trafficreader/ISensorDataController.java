package com.tm.trafficreader;
/**
 * The actual controller interface through which we get the sensor data,
 * @author Subrata Saha
 *
 */
public interface ISensorDataController {
	public void init();
	public void registerSensorNotification(ISensorClient client);
	public void deregisterSensorNotification(ISensorClient client);
	public void deInit();
}

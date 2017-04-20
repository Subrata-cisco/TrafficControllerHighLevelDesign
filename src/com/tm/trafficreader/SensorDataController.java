package com.tm.trafficreader;

import java.util.List;

import com.tm.core.Route;
/**
 * Register with actual sensor third party interface to get the data.
 * send the data to registered client.
 * start a thread and keep listening for sensor data and stop when requested.
 * 
 * @author Subrata Saha
 *
 */
public class SensorDataController implements ISensorDataController {
	
	private ISensorAdapter sensorAdaper ;
	private List<ISensorClient> clients;
	
	public SensorDataController(){
		// create object sensorAdaper and then keep listening
		// mock code
		
	}
	
	

	private void sendSensorData(String readData) {
		// go through all registered client and send them the result..
		for(ISensorClient c :clients){
			// parse readData and create Route id and name and create chunck of Traction and notify client.
			Route r = null;
			TrafficData td = null;
			c.notifySensorResult(r, td);
		}
		
	}

	@Override
	public void registerSensorNotification(ISensorClient client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deregisterSensorNotification(ISensorClient client) {
		// TODO Auto-generated method stub

	}



	@Override
	public void init() {
		// start a thread and keep listening for sensor data.
		
	}



	@Override
	public void deInit() {
		// stop the thread and stop listening for sensor data.
		
	}

}

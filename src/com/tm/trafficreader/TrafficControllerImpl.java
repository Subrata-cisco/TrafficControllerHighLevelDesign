package com.tm.trafficreader;

import com.tm.core.Authority;
import com.tm.core.ITrafficController;
import com.tm.core.TrafficSignal;

public class TrafficControllerImpl implements ITrafficController {
	
	private SensorDataController sensorDataController = null;

	@Override
	public void addTrafficSignal(TrafficSignal ts) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTrafficSignal(TrafficSignal ts) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startAllTrafficSignal(Authority a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopAllTrafficSignal(Authority a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void putAllTrafficSignalInNonWorkingHoursMode() {
		// TODO Auto-generated method stub

	}

	@Override
	public void putAllTrafficSignalInWorkingHoursMode() {
		// TODO Auto-generated method stub

	}

	@Override
	public void startSensorDataReading() {
		sensorDataController = new SensorDataController();
		sensorDataController.init();

	}

	@Override
	public void stopSensorDataReading() {
		if(sensorDataController != null){
			sensorDataController.deInit();
			sensorDataController = null;
		}
		
	}

}

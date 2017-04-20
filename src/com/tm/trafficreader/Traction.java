package com.tm.trafficreader;

public class Traction {
	private long timeForTraction ;
	
	private VehicleType vType;
	
	private int speed;
	
	public long getTimeForTraction() {
		return timeForTraction;
	}
	public void setTimeForTraction(long timeForTraction) {
		this.timeForTraction = timeForTraction;
	}
	public VehicleType getvType() {
		return vType;
	}
	public void setvType(VehicleType vType) {
		this.vType = vType;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

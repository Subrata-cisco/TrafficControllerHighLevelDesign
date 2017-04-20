package com.tm.trafficreader;

import java.util.LinkedList;

import com.tm.core.Route;
/**
 * Traffic data for a Route and with details as Traction object
 * @author Subrata Saha
 *
 */
public class TrafficData {
	
	private Route forRoute;
	
	private LinkedList<Traction> transactions = new LinkedList<>();

	private Traction traction; 

	public void addTractio(Traction traction) {
		transactions.add(traction);
	}

}

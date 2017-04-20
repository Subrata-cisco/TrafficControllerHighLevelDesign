package com.tm.trafficreader;
/**
 * Sensor adapter where data is available from actual sensor system.
 * @author Subrata Saha
 *
 */
public interface ISensorAdapter {
  public String readData();
  public boolean isAlive();
}

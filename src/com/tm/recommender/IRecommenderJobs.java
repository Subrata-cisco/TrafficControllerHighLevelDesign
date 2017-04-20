package com.tm.recommender;
/**
 * Read the store for overall health of traffic system from some store and analyze and save them back.
 * @author Subrata Saha
 *
 */
public interface IRecommenderJobs {
   public void readDataStore(String path);
   public void analyseAndSaveData(String path);
}

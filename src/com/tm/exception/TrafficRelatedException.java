package com.tm.exception;

public class TrafficRelatedException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private TrafficRelatedErrors errorCode;
	
	public TrafficRelatedException(TrafficRelatedErrors error) {
        this.errorCode = error;
    }
	
	public TrafficRelatedException(TrafficRelatedErrors error, String message) {
        super(message);
        this.errorCode = error;
    }

    public TrafficRelatedErrors getErrorCode() {
        return errorCode;
    }
  
}

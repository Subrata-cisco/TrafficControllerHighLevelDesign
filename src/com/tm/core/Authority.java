package com.tm.core;
/**
 * Security related, who is authorized etc.
 * @author Subrata Saha
 *
 */
public interface Authority {
	public UserType getUserType();
	public boolean isAuthorized(OperationType ot);
}

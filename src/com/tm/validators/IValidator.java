package com.tm.validators;

import com.tm.exception.InvalidRouteDataException;

public interface IValidator<T> {
	boolean validate(T item) throws InvalidRouteDataException;
}

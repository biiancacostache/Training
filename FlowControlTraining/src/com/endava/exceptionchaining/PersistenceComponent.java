package com.endava.exceptionchaining;

public class PersistenceComponent {
	
	void persist(Object arg) throws PersistenceException {
        throw new PersistenceException("Cannot persist object " + arg.toString());
    }

}
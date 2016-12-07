package org.alArbiyaScreenManagement.service;

import java.util.List;

import org.alArbiyaScreenManagement.model.Unit;

 

public interface UnitService {
 
	public List<Unit> getAllUnitWithCategory(String categoryCode);
 
	public List<Unit> getAllUnits();
	
}

package org.alArbiyaScreenManagement.repository;

import java.util.List;

import org.alArbiyaScreenManagement.model.Unit;

 

public interface UnitRepository {
	 
	public List<Unit> getAllUnitWithCategory(String categoryCode);
	public Unit getUnit(long id);
	public List<Unit> getAllUnits();
}

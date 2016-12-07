package org.alArbiyaScreenManagement.service.impl;

import java.util.List;
  
import org.alArbiyaScreenManagement.model.Unit;
import org.alArbiyaScreenManagement.repository.UnitRepository;
import org.alArbiyaScreenManagement.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitServiceImpl implements UnitService {
	
	@Autowired 
	private UnitRepository unitRepository;
	
	@Override
	public List<Unit> getAllUnitWithCategory(String categoryCode) {
		return unitRepository.getAllUnitWithCategory(categoryCode);
	}
 
	@Override
	public List<Unit> getAllUnits() {
		// TODO Auto-generated method stub
		return unitRepository.getAllUnits();
	}
	
	
}

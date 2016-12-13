package org.alArbiyaScreenManagement.service.impl;

import java.util.List;

import org.alArbiyaScreenManagement.model.HotelInfo;
import org.alArbiyaScreenManagement.repository.HotelInfoRepository;
import org.alArbiyaScreenManagement.service.HotelInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelInfoServiceImpl implements HotelInfoService{
 @Autowired HotelInfoRepository hotelInfoRepository;
	
	@Override
	public List<HotelInfo> getHotelInfo() {
		// TODO Auto-generated method stub
		return hotelInfoRepository.getHotelInfo();
	}

}

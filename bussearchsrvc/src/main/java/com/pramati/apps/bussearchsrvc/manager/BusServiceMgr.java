package com.pramati.apps.bussearchsrvc.manager;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pramati.apps.bussearchsrvc.dao.BusServiceDAO;
import com.pramati.apps.bussearchsrvc.dto.BusServiceDto;
import com.pramati.apps.bussearchsrvc.entity.BusServiceEntity;

@Component
public class BusServiceMgr {
	@Autowired
	private BusServiceDAO busServiceDAO;
	@Autowired
	private ModelMapper modelMapper;
	
	private List<BusServiceDto> convertTDtos(List<BusServiceEntity> busServiceEntities) {
		Type listType = new TypeToken<List<BusServiceDto>>() {
		}.getType();
		return modelMapper.map(busServiceEntities, listType);
	}
	public List<BusServiceDto> getAllBusServices(String from,String to) {
		System.out.println("from:"+from+",to"+to);
		return convertTDtos(busServiceDAO.getAllBusServices(from,to));
	}
}

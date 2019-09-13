package com.pramati.apps.bussearchsrvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramati.apps.bussearchsrvc.dto.BusServiceDto;
import com.pramati.apps.bussearchsrvc.manager.BusServiceMgr;
@Service
public class BusService {
	@Autowired
    BusServiceMgr busServiceMgr;
	public List<BusServiceDto> getAllBusServices(String from,String to) {
		return busServiceMgr.getAllBusServices(from,to);
	}
}

package com.pramati.apps.bussearchsrvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pramati.apps.bussearchsrvc.entity.BusServiceEntity;
import com.pramati.apps.bussearchsrvc.repository.BusServiceRepository;

@Repository
public class BusServiceDAO {
	@Autowired
	private BusServiceRepository busServiceRepository;
	public List<BusServiceEntity> getAllBusServices(String from,String to) {
		return busServiceRepository.findByStartstationAndEndstation(from,to);
	}
}

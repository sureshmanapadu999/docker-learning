package com.pramati.apps.bussearchsrvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.apps.bussearchsrvc.dto.BusServiceDto;
import com.pramati.apps.bussearchsrvc.service.BusService;


@RestController
@RequestMapping("/BusServices")
public class BuServicesRestController {
	@Autowired
	private BusService busService;
	
	@GetMapping(path = "/{from}/{to}", produces = "application/json")
	public List<BusServiceDto> getAllBusServices(@PathVariable String from,@PathVariable String to) {
		return busService.getAllBusServices(from,to);
	}
}

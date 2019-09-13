package com.satya.apps.bussrvcwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.apps.bussrvcwebapp.bean.BusServiceDto;
import com.satya.apps.bussrvcwebapp.manager.SearchManager;

@Service
public class SearchService {
	@Autowired
	private SearchManager searchManager;
	public List<BusServiceDto> searchForBusSrvc(String uri){
		return searchManager.searchForBusSrvc(uri);
	}
}

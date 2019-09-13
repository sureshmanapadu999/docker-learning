package com.satya.apps.bussrvcwebapp.manager;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.satya.apps.bussrvcwebapp.bean.BusServiceDto;

@Component
public class SearchManager {
	@Autowired
	private RestTemplate restTemplate;
	
	public List<BusServiceDto> searchForBusSrvc(String uri) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		String json = result.getBody();
		ObjectMapper mapper = new ObjectMapper();
		List<BusServiceDto> busServices = null;
		try {
			// convert JSON array to List of objects
			busServices = Arrays.asList(mapper.readValue(json, BusServiceDto[].class));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return busServices;
	}
}

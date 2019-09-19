package com.satya.apps.bussrvcwebapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.satya.apps.bussrvcwebapp.bean.BusServiceDto;
import com.satya.apps.bussrvcwebapp.service.SearchService;

@Controller
public class SearchController {
	@Autowired
	private SearchService searchService;
    @Autowired
    private Environment env;
    
	@RequestMapping(path = "/searchsrvc", method = RequestMethod.GET)
	public ModelAndView searchForBusSrvc(HttpServletRequest request) {
		String uri = env.getProperty("uri");
		ModelAndView modelAndView = new ModelAndView("error", "errorDetails", "somethign went wrong");
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		uri=uri+"/"+from+"/"+to;
		List<BusServiceDto> busServices = searchService.searchForBusSrvc(uri);
				modelAndView = new ModelAndView("success", "serviceDetails", busServices);
		return modelAndView;
	}

}

package com.pramati.apps.bootresourceapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramati.apps.bootresourceapp.bean.Resource;
import com.pramati.apps.bootresourceapp.service.ResourceService;

@RestController
@RequestMapping("/Resources")
public class ResourceRestController {
	@Autowired
	private ResourceService resourceService;

	@PostMapping(path = "/", consumes = "application/json")
	public ResponseEntity<Resource> createResource(@RequestBody Resource resource) {
		System.out.println("creating the resource:" + resource);
		String result = resource.toString();
		resourceService.addResource(resource);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = "/", produces = "application/json")
	public List<Resource> getAllResources() {
		return resourceService.getAllResources();
	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public Resource getResource(@PathVariable int id) {
		return resourceService.getResource(id);
	}

	@DeleteMapping(path = "/{id}", produces = "application/json")
	public ResponseEntity<String> deleteResource(@PathVariable int id) {
		resourceService.deleteResource(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(path = "/{id}", consumes = "application/json")
	public ResponseEntity<String> updateResource(@PathVariable int rid, @RequestBody Resource resource) {
		resourceService.updateResource(resource, rid);
		String result = resource.toString();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

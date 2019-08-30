package com.pramati.apps.bootresourceapp.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramati.apps.bootresourceapp.bean.Resource;
import com.pramati.apps.bootresourceapp.repository.ResourceRepository;

@Service
public class ResourceService {
	@Autowired
	ResourceRepository resourceRepository;
	public List<Resource> getAllResources() {
		List<Resource> Resources = new ArrayList<>();
		resourceRepository.findAll().forEach(Resources::add);
		return Resources;
	}

	public Resource getResource(int id) {
		return resourceRepository.findById(id).get();
	}

	public int addResource(Resource resource) {
		resourceRepository.save(resource);
		return resource.getrId();
	}

	public boolean updateResource(Resource Resource, int id) {
		resourceRepository.save(Resource);// save can do both add and udpate
		return true;
	}

	public boolean deleteResource(int id) {
		resourceRepository.deleteById(id);
		return true;
	}
}
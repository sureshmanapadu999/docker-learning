package com.pramati.apps.bootresourceapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pramati.apps.bootresourceapp.entity.ResourceEntity;
import com.pramati.apps.bootresourceapp.repository.ResourceRepository;

@Repository
public class ResourceDAO {
	@Autowired
	ResourceRepository resourceRepository;
	public List<ResourceEntity> getAllResources() {
		List<ResourceEntity> resources = new ArrayList<>();
		resourceRepository.findAll().forEach(resources::add);
		return resources;
	}

	public ResourceEntity getResource(int id) {
		return resourceRepository.findById(id).get();
	}

	public int addResource(ResourceEntity resource) {
		resourceRepository.save(resource);
		return resource.getrId();
	}

	public boolean updateResource(ResourceEntity Resource, int id) {
		resourceRepository.save(Resource);// save can do both add and udpate
		return true;
	}

	public boolean deleteResource(int id) {
		resourceRepository.deleteById(id);
		return true;
	}
}

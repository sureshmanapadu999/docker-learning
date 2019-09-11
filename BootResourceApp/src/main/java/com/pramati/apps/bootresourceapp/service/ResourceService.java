package com.pramati.apps.bootresourceapp.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramati.apps.bootresourceapp.bean.Resource;
import com.pramati.apps.bootresourceapp.entity.ResourceEntity;
import com.pramati.apps.bootresourceapp.repository.ResourceRepository;
import com.pramati.apps.bootresourceapp.service.mgr.ResourceServiceMgr;

@Service
public class ResourceService {
	@Autowired
	ResourceServiceMgr resourceServiceMgr;
	public List<Resource> getAllResources() {
		return resourceServiceMgr.getAllResources();
	}

	public Resource getResource(int id) {
		return resourceServiceMgr.getResource(id);
	}

	public int addResource(Resource resource) {
		return resourceServiceMgr.addResource(resource);
	}

	public boolean updateResource(Resource resource, int id) {
		return resourceServiceMgr.updateResource(resource,id);
	}

	public boolean deleteResource(int id) {
		return resourceServiceMgr.deleteResource(id);
	}
}
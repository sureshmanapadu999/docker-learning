package com.pramati.apps.bootresourceapp.service.mgr;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pramati.apps.bootresourceapp.bean.Resource;
import com.pramati.apps.bootresourceapp.dao.ResourceDAO;
import com.pramati.apps.bootresourceapp.entity.ResourceEntity;
import org.modelmapper.TypeToken;
import java.lang.reflect.Type;
@Component
public class ResourceServiceMgr {

	@Autowired
	private ResourceDAO ressourceDAO;
	@Autowired
	private ModelMapper modelMapper;

	private Resource convertToDto(ResourceEntity resourceEntity) {
		Resource resource = modelMapper.map(resourceEntity, Resource.class);
		return resource;
	}

	private ResourceEntity convertToEntity(Resource resource) {
		ResourceEntity resourceEntity = modelMapper.map(resource, ResourceEntity.class);
		return resourceEntity;
	}

	private List<Resource> convertTDtos(List<ResourceEntity> resourceEntities) {
		Type listType = new TypeToken<List<Resource>>() {
		}.getType();
		return modelMapper.map(resourceEntities, listType);
	}
    /**
	private List<ResourceEntity> convertToEntities(List<Resource> resources) {
		Type listType = new TypeToken<List<ResourceEntity>>() {
		}.getType();
		return modelMapper.map(resources, listType);
	}
	*/

	public List<Resource> getAllResources() {
		return convertTDtos(ressourceDAO.getAllResources());
	}

	public Resource getResource(int id) {
		ResourceEntity resourceEntity = ressourceDAO.getResource(id);
		return convertToDto(resourceEntity);
	}

	public int addResource(Resource resource) {
		return ressourceDAO.addResource(convertToEntity(resource));

	}

	public boolean updateResource(Resource resource, int id) {
		int rId = ressourceDAO.addResource(convertToEntity(resource));
		return rId == id;
	}

	public boolean deleteResource(int id) {
		ressourceDAO.deleteResource(id);
		return true;
	}
}

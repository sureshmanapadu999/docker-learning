package com.pramati.apps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pramati.apps.bootresourceapp.bean.Resource;
import com.pramati.apps.bootresourceapp.entity.ResourceEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootResourceAppApplicationTests {

	@Test
	public void contextLoads() {
	}
	private static ModelMapper modelMapper = new ModelMapper();
	private static Resource convertToDto(ResourceEntity resourceEntity){
		Resource resource = modelMapper.map(resourceEntity, Resource.class);
		return resource;
	}
	private static ResourceEntity convertToEntity(Resource resource) {
		ResourceEntity resourceEntity = modelMapper.map(resource, ResourceEntity.class);
		return resourceEntity;
	}
	public static void main(String[] args) {
		Resource resource=new Resource();
		resource.setrId(23);
		resource.setrName("satya");
		resource.setrRole("QA");
		resource.setrSalary(100);
		resource.setrSkillSet("java");
	    ResourceEntity re = convertToEntity(resource);
	    System.out.println(resource);
	    System.out.println(re);
		
	}

}

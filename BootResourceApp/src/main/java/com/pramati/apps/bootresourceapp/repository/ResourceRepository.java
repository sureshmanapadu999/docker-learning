package com.pramati.apps.bootresourceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pramati.apps.bootresourceapp.bean.Resource;
import com.pramati.apps.bootresourceapp.entity.ResourceEntity;

public interface ResourceRepository extends JpaRepository<ResourceEntity, Integer> {

}

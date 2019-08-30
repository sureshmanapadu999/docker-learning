package com.pramati.apps.bootresourceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pramati.apps.bootresourceapp.bean.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {

}

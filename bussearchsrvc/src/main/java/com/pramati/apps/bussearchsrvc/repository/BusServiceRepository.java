package com.pramati.apps.bussearchsrvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pramati.apps.bussearchsrvc.entity.BusServiceEntity;

public interface BusServiceRepository extends JpaRepository<BusServiceEntity, Integer> {
	/*@Query(value = "SELECT * FROM bus_service_entity t where t.startstation = :start AND t.endstation = :end", nativeQuery = true)
	public List<BusServiceEntity> findByStartstationAndEndstationNative(@Param("start") String start, @Param("end") String end);*/
	public List<BusServiceEntity> findByStartstationAndEndstation(String startstation, String endatation);
}

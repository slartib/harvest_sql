package com.rkd.harvest_sql.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FieldTruckLoadRepository extends JpaRepository<FieldTruckLoad, FieldTruckLoadId>
{
  public List<FieldTruckLoad> findFieldTruckLoadsById_FieldOrderById_LoadNum(String field);
}
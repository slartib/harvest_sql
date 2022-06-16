package com.rkd.harvest_sql.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FieldTruckStateRepository extends JpaRepository<FieldTruckState, FieldTruckStateId>
{
  public List<FieldTruckState> findFieldTruckStatesById_Field(String field);
}
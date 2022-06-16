package com.rkd.harvest_sql.data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FIELD_TRUCK_STATE")
public class FieldTruckState
{
  @EmbeddedId
  private FieldTruckStateId id;

  @Column(name = "CURRENT_STATE", nullable = false, length = 50)
  private String currentState;

  @Column(name = "GROWER", nullable = false, length = 50)
  private String grower;

  public FieldTruckStateId getId()
  {
    return id;
  }

  public void setId(FieldTruckStateId id)
  {
    this.id = id;
  }

  public String getCurrentState()
  {
    return currentState;
  }

  public void setCurrentState(String currentState)
  {
    this.currentState = currentState;
  }

  public String getGrower()
  {
    return grower;
  }

  public void setGrower(String grower)
  {
    this.grower = grower;
  }

}
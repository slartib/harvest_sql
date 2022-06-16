package com.rkd.harvest_sql.data;

import javax.persistence.*;

@Entity
@Table(name = "FIELD_TRUCK")
public class FieldTruck
{
  @EmbeddedId
  private FieldTruckId id;

  @MapsId("truckId")
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "TRUCK_ID", nullable = false)
  private Truck truck;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CURRENT_STATE")
  private State currentState;

  public FieldTruckId getId()
  {
    return id;
  }

  public void setId(FieldTruckId id)
  {
    this.id = id;
  }

  public Truck getTruck()
  {
    return truck;
  }

  public void setTruck(Truck truck)
  {
    this.truck = truck;
  }

  public State getCurrentState()
  {
    return currentState;
  }

  public void setCurrentState(State currentState)
  {
    this.currentState = currentState;
  }

}
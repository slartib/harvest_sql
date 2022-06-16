package com.rkd.harvest_sql.data;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "FIELD_TRUCK_STATE_LOG")
public class FieldTruckStateLog
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", nullable = false)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "FIELD_ID", nullable = false)
  @JsonBackReference
  private Field field;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "TRUCK_ID", nullable = false)
  @JsonBackReference
  private Truck truck;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "STATE", nullable = false)
  @JsonBackReference
  private State state;

  @Column(name = "ENTRY_TIME", nullable = false)
  private Instant entryTime;

  @Column(name = "EXIT_TIME")
  private Instant exitTime;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Field getField()
  {
    return field;
  }

  public void setField(Field field)
  {
    this.field = field;
  }

  public Truck getTruck()
  {
    return truck;
  }

  public void setTruck(Truck truck)
  {
    this.truck = truck;
  }

  public State getState()
  {
    return state;
  }

  public void setState(State state)
  {
    this.state = state;
  }

  public Instant getEntryTime()
  {
    return entryTime;
  }

  public void setEntryTime(Instant entryTime)
  {
    this.entryTime = entryTime;
  }

  public Instant getExitTime()
  {
    return exitTime;
  }

  public void setExitTime(Instant exitTime)
  {
    this.exitTime = exitTime;
  }

}
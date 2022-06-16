package com.rkd.harvest_sql.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATES")
public class State
{
  @Id
  @Column(name = "STATE", nullable = false, length = 50)
  private String id;

  @Column(name = "NEXT_STATE", nullable = false, length = 50)
  private String nextState;

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getNextState()
  {
    return nextState;
  }

  public void setNextState(String nextState)
  {
    this.nextState = nextState;
  }

}
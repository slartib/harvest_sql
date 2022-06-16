package com.rkd.harvest_sql.data;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FieldTruckStateId implements Serializable
{
  private static final long serialVersionUID = 4291986772126759597L;
  @Column(name = "FIELD", nullable = false, length = 50)
  private String field;

  @Column(name = "TRUCK", nullable = false, length = 50)
  private String truck;

  public String getField()
  {
    return field;
  }

  public void setField(String field)
  {
    this.field = field;
  }

  public String getTruck()
  {
    return truck;
  }

  public void setTruck(String truck)
  {
    this.truck = truck;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o))
    {
      return false;
    }
    FieldTruckStateId entity = (FieldTruckStateId) o;
    return Objects.equals(this.field, entity.field) &&
        Objects.equals(this.truck, entity.truck);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(field, truck);
  }

}
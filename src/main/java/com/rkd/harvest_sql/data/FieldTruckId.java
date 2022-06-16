package com.rkd.harvest_sql.data;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FieldTruckId implements Serializable
{
  private static final long serialVersionUID = 2675101094771453893L;
  @Column(name = "FIELD_ID", nullable = false)
  private Integer fieldId;

  @Column(name = "TRUCK_ID", nullable = false)
  private Integer truckId;

  public Integer getFieldId()
  {
    return fieldId;
  }

  public void setFieldId(Integer fieldId)
  {
    this.fieldId = fieldId;
  }

  public Integer getTruckId()
  {
    return truckId;
  }

  public void setTruckId(Integer truckId)
  {
    this.truckId = truckId;
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
    FieldTruckId entity = (FieldTruckId) o;
    return Objects.equals(this.truckId, entity.truckId) &&
        Objects.equals(this.fieldId, entity.fieldId);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(truckId, fieldId);
  }

}
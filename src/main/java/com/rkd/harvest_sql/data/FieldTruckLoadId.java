package com.rkd.harvest_sql.data;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FieldTruckLoadId implements Serializable
{
  private static final long serialVersionUID = -236702834683336954L;
  @Column(name = "FIELD", nullable = false, length = 50)
  private String field;

  @Column(name = "TRUCK", nullable = false, length = 50)
  private String truck;

  @Column(name = "LOAD_NUM", nullable = false)
  private Integer loadNum;

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

  public Integer getLoadNum()
  {
    return loadNum;
  }

  public void setLoadNum(Integer loadNum)
  {
    this.loadNum = loadNum;
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
    FieldTruckLoadId entity = (FieldTruckLoadId) o;
    return Objects.equals(this.loadNum, entity.loadNum) &&
        Objects.equals(this.field, entity.field) &&
        Objects.equals(this.truck, entity.truck);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(loadNum, field, truck);
  }

}
package com.rkd.harvest_sql.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TRUCKS")
public class Truck
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", nullable = false)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "SHIPPER_ID", nullable = false)
  @JsonBackReference
  private Shipper shipper;

  @Column(name = "NAME", nullable = false, length = 50)
  private String name;

  /*
  @OneToMany(mappedBy = "truck")
  @JsonManagedReference
  private Set<FieldTruck> fieldTrucks = new LinkedHashSet<>();

  @OneToMany(mappedBy = "truck")
  @JsonManagedReference
  private Set<FieldTruckStateLog> fieldTruckStateLogs = new LinkedHashSet<>();

  @OneToMany(mappedBy = "truck")
  @JsonManagedReference
  private Set<Load> loads = new LinkedHashSet<>();
*/
  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Shipper getShipper()
  {
    return shipper;
  }

  public void setShipper(Shipper shipper)
  {
    this.shipper = shipper;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
/*
  public Set<FieldTruck> getFieldTrucks()
  {
    return fieldTrucks;
  }

  public void setFieldTrucks(Set<FieldTruck> fieldTrucks)
  {
    this.fieldTrucks = fieldTrucks;
  }

  public Set<FieldTruckStateLog> getFieldTruckStateLogs()
  {
    return fieldTruckStateLogs;
  }

  public void setFieldTruckStateLogs(Set<FieldTruckStateLog> fieldTruckStateLogs)
  {
    this.fieldTruckStateLogs = fieldTruckStateLogs;
  }

  public Set<Load> getLoads()
  {
    return loads;
  }

  public void setLoads(Set<Load> loads)
  {
    this.loads = loads;
  }
*/
}
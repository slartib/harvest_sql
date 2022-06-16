package com.rkd.harvest_sql.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "SHIPPER")
public class Shipper
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", nullable = false)
  private Integer id;

  @Column(name = "NAME", nullable = false, length = 50)
  private String name;

  @OneToMany(mappedBy = "shipper")
  @JsonManagedReference
  private Set<Truck> trucks = new LinkedHashSet<>();

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Set<Truck> getTrucks()
  {
    return trucks;
  }

  public void setTrucks(Set<Truck> trucks)
  {
    this.trucks = trucks;
  }

}
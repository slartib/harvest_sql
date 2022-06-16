package com.rkd.harvest_sql.data;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "FIELDS")
public class Field
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", nullable = false)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "GROWER_ID", nullable = false)
  @JsonBackReference
  private Grower grower;

  @Column(name = "NAME", nullable = false, length = 50)
  private String name;

  @Column(name = "\"SIZE\"")
  private Double size;

  @Column(name = "NEAREST_CITY", length = 50)
  private String nearestCity;

  @Column(name = "STATE", length = 50)
  private String state;

  @Column(name = "HARVEST_START_DATE")
  private LocalDate harvestStartDate;

  @Column(name = "HARVEST_COMPLETE_DATE")
  private LocalDate harvestCompleteDate;

  @OneToMany(mappedBy = "field")
  @JsonManagedReference
  private Set<Load> loads = new LinkedHashSet<>();

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Grower getGrower()
  {
    return grower;
  }

  public void setGrower(Grower grower)
  {
    this.grower = grower;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Double getSize()
  {
    return size;
  }

  public void setSize(Double size)
  {
    this.size = size;
  }

  public String getNearestCity()
  {
    return nearestCity;
  }

  public void setNearestCity(String nearestCity)
  {
    this.nearestCity = nearestCity;
  }

  public String getState()
  {
    return state;
  }

  public void setState(String state)
  {
    this.state = state;
  }

  public LocalDate getHarvestStartDate()
  {
    return harvestStartDate;
  }

  public void setHarvestStartDate(LocalDate harvestStartDate)
  {
    this.harvestStartDate = harvestStartDate;
  }

  public LocalDate getHarvestCompleteDate()
  {
    return harvestCompleteDate;
  }

  public void setHarvestCompleteDate(LocalDate harvestCompleteDate)
  {
    this.harvestCompleteDate = harvestCompleteDate;
  }

  public Set<Load> getLoads()
  {
    return loads;
  }

  public void setLoads(Set<Load> loads)
  {
    this.loads = loads;
  }

}
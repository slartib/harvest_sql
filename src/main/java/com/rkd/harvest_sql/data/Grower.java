package com.rkd.harvest_sql.data;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "GROWERS")
public class Grower
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", nullable = false)
  private Integer id;

  @Column(name = "NAME", nullable = false, length = 50)
  private String name;

  @Column(name = "CITY", length = 50)
  private String city;

  @Column(name = "STATE", length = 50)
  private String state;

  @OneToMany(mappedBy = "grower")
  @JsonManagedReference
  private List<Field> fields = new ArrayList<>();

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

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getState()
  {
    return state;
  }

  public void setState(String state)
  {
    this.state = state;
  }

  public List<Field> getFields()
  {
    return fields;
  }

  public void setFields(List<Field> fields)
  {
    this.fields = fields;
  }

}
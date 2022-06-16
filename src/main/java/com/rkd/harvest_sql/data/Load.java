package com.rkd.harvest_sql.data;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "LOADS")
public class Load
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

  @Column(name = "GROSS")
  private Double gross;

  @Column(name = "TARE")
  private Double tare;

  @Column(name = "NET")
  private Double net;

  @Column(name = "CREATED_DATE")
  private LocalDate createdDate;

  @Column(name = "DELIVERED_DATE")
  private LocalDate deliveredDate;

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

  public Double getGross()
  {
    return gross;
  }

  public void setGross(Double gross)
  {
    this.gross = gross;
  }

  public Double getTare()
  {
    return tare;
  }

  public void setTare(Double tare)
  {
    this.tare = tare;
  }

  public Double getNet()
  {
    return net;
  }

  public void setNet(Double net)
  {
    this.net = net;
  }

  public LocalDate getCreatedDate()
  {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate)
  {
    this.createdDate = createdDate;
  }

  public LocalDate getDeliveredDate()
  {
    return deliveredDate;
  }

  public void setDeliveredDate(LocalDate deliveredDate)
  {
    this.deliveredDate = deliveredDate;
  }

}
package com.rkd.harvest_sql.data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "FIELD_TRUCK_LOAD")
public class FieldTruckLoad
{
  @EmbeddedId
  private FieldTruckLoadId id;

  @Column(name = "GROSS", nullable = false)
  private Double gross;

  @Column(name = "TARE", nullable = false)
  private Double tare;

  @Column(name = "NET", nullable = false)
  private Double net;

  @Column(name = "\"DATE\"", nullable = false)
  private LocalDate date;

  public FieldTruckLoadId getId()
  {
    return id;
  }

  public void setId(FieldTruckLoadId id)
  {
    this.id = id;
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

  public LocalDate getDate()
  {
    return date;
  }

  public void setDate(LocalDate date)
  {
    this.date = date;
  }

}
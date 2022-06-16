package com.rkd.harvest_sql.controllers;


import com.rkd.harvest_sql.data.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin()
@RestController
public class HarvestController
{
  private final GrowerRepository growerRepository;
  private final FieldRepository fieldRepository;
  private final FieldTruckLoadRepository fieldTruckLoadRepository;
  private final FieldTruckStateRepository fieldTruckStateRepository;
  private final ShipperRepository shipperRepository;
  private final StateRepository stateRepository;

  private final TruckRepository truckRepository;

  public HarvestController(GrowerRepository growerRepository, FieldRepository fieldRepository, FieldTruckLoadRepository fieldTruckLoadRepository, FieldTruckStateRepository fieldTruckStateRepository, ShipperRepository shipperRepository, StateRepository stateRepository, TruckRepository truckRepository)
  {
    this.growerRepository = growerRepository;
    this.fieldRepository = fieldRepository;
    this.fieldTruckLoadRepository = fieldTruckLoadRepository;
    this.fieldTruckStateRepository = fieldTruckStateRepository;
    this.shipperRepository = shipperRepository;
    this.stateRepository = stateRepository;
    this.truckRepository = truckRepository;
  }

  @GetMapping("/")
  public String defaultMap()
  {
    return "Default Mapping";
  }
  @GetMapping("/growers")
  public List<Grower> growers()
  {
    return growerRepository.findAll();
  }

  @GetMapping("/fields")
  public List<Field> fields()
  {
    return fieldRepository.findAll();
  }

  @GetMapping("/states")
  public List<State> states()
  {
    return stateRepository.findAll();
  }

  @GetMapping("/trucks")
  public List<Truck> trucks()
  {
    return truckRepository.findAll();
  }

  @GetMapping("/trucks/{id}")
  public Optional<Truck> trucksbyid(@PathVariable Integer id)
  {
    return truckRepository.findById(id);
  }

  @GetMapping("/fieldtruckstates")
  public List<FieldTruckState> fieldTruckStates()
  {
    return fieldTruckStateRepository.findAll();
  }

  @GetMapping("/fieldtruckloads")
  public List<FieldTruckLoad> fieldTruckLoads()
  {
    return fieldTruckLoadRepository.findAll();
  }

  @GetMapping("/fieldtruckstates/{field}")
  public List<FieldTruckState> fieldTruckStatesByField (@PathVariable String field)
  {
    return fieldTruckStateRepository.findFieldTruckStatesById_Field(field);
  }

  @GetMapping("/fieldtruckloads/{field}")
  public List<FieldTruckLoad> fieldTruckLoadsByField (@PathVariable String field)
  {
    return fieldTruckLoadRepository.findFieldTruckLoadsById_FieldOrderById_LoadNum(field);
  }

}

package com.example.demo.controllers;

import com.example.demo.dao.DeviceRepository;
import com.example.demo.models.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {

    @Autowired
    private DeviceRepository repository;

    @PostMapping("/add")
    public void addDevice(@RequestBody Device device){
        repository.save(device);
    }

    @GetMapping("/getAll")
    public List<Device> getAll(){
        return repository.findAll();
    }


    @DeleteMapping("/delete")
    public void delete(@RequestBody Device device){
        repository.delete(device);
    }

    @GetMapping("/")
    public String head(){
        return "Hello";
    }


}

package com.org.cts.controller;

import com.org.cts.model.Hotel;
import com.org.cts.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    HotelService hotelService;


    @PostMapping("/create")
    public void createHotel(@RequestBody Hotel hotel){
        hotelService.createHotel(hotel);
    }


    @GetMapping("/getById/{id}")
    public Hotel getById(@PathVariable Integer id){
        Hotel hk=   hotelService.getById(id);
        return hk;
    }
    @GetMapping("/getAll")
    public List<Hotel> getAll(){
        List<Hotel> hd=   hotelService.getAll();
        return hd;
    }
    @GetMapping("/getByName/{name}")
    public Hotel getByName(@PathVariable String name){
        Hotel hk=  hotelService.getByName(name);
        return hk;
    }

   @PatchMapping ("/updateByName/{id}/{name}")
    public String updateNameById(@PathVariable Integer id,@PathVariable String name ){
        String s=hotelService.updateNameById(id,name);
        return s;

   }

}

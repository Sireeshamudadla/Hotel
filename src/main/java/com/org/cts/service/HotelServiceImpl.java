package com.org.cts.service;

import com.org.cts.model.Hotel;
import com.org.cts.repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepo hotelRepo;


    @Override
    public void createHotel(Hotel hotel) {
        hotelRepo.save(hotel);
    }

    @Override
    public Hotel getById(Integer id) {
        Hotel hh=  hotelRepo.getById(id);
        return hh;
    }

    @Override
    public List<Hotel> getAll() {
        List<Hotel> hst=   hotelRepo.findAll();
        return hst;
    }

    @Override
    public Hotel getByName(String name) {
        Hotel hh=  hotelRepo.getByName(name);
        return hh;
    }

    @Override
    public String updateNameById(Integer id, String name) {

        Optional<Hotel> hotel=hotelRepo.findById(id);
        Hotel hotel1  =hotel.get();
        hotel1.setName(name);
        hotelRepo.save(hotel1);
        return "update success";
    }


}

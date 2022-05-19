package com.org.cts.service;

import com.org.cts.model.Hotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface HotelService {
    public void createHotel(Hotel hotel);

    public Hotel getById(Integer id);

    public List<Hotel> getAll();

    public Hotel getByName(String name);


    public String updateNameById(Integer id, String name);
}
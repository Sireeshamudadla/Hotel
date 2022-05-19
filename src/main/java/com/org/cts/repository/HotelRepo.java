package com.org.cts.repository;

import com.org.cts.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer> {
    @Transactional
    Hotel getByName(String name);

}

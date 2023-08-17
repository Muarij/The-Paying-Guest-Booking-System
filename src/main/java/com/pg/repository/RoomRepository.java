package com.pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.pojos.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    // You can add custom queries here if needed
}

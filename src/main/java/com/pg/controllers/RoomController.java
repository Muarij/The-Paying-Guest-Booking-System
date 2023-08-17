package com.pg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.pojos.Room;
import com.pg.service.RoomService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/create")
    public Room createRoom(@RequestBody Room room) {
        return roomService.save(room);
    }

    @GetMapping("/getAll")
    public List<Room> getAllRooms() {
        return roomService.getAll();
    }

    @PutMapping("/update/{id}")
    public Room updateRoom(@RequestBody Room room, @PathVariable Integer id) {
        return roomService.update(id, room);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRoom(@PathVariable Integer id) {
        roomService.delete(id);
    }
}



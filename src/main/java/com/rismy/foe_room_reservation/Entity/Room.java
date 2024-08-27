package com.rismy.foe_room_reservation.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoomId",length = 50)
    private int RoomId;

    @Column(name="RoomName",length=100)
    private String roomName;

    @Column(name="Capacity",length=10)
    private Integer capacity;

    @Column(name="Description",length=100)
    private String description;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Booking> bookings = new ArrayList<Booking>();


}

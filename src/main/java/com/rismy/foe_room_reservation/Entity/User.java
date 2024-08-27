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
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UserId",length=100)
    private long userId;

    @Column(name="UserName",length=100)
    private String userName;

    @Enumerated(EnumType.STRING)
    @Column(name="UserType",length=50)
    private UserType usertype;

    @Column(name="Email",length=50)
    private String email;

    @Column(name="PhoneNumber",length=50)
    private String phoneNumber;

    @Column(name="Password")
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Booking> bookings = new ArrayList<Booking>();

}

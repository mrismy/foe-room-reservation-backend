package com.rismy.foe_room_reservation.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    private Time startTime;
    private Time endTime;
    private Date date;

    @Enumerated(EnumType.STRING)
    private RecurrenceType recurenceType;

    private int recurrencePeriod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomId")
    private Room room;

    public enum RecurrenceType{NONE,DAILY,WEEKLY}
}

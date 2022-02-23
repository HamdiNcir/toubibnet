package com.toubibnet.toubibnet.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date date;
    @ManyToOne
    @JoinColumn(name="doctor_id",referencedColumnName = "id")
    Doctor doctor;
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName="id")
    User user;
}

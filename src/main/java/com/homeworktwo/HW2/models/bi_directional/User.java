package com.homeworktwo.HW2.models.bi_directional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users_bi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String fName;
    private String lName;
    private String password;
    private String email;

    @OneToOne
    private Address address;
    @OneToMany
    private List<Review> reviews;
}

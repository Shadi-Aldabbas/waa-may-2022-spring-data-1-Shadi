package com.homeworktwo.HW2.models.join_table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users_table")
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
    @JoinTable(name = "address_user")
    private Address address;
    @OneToMany
    @JoinTable(name = "reviews_user")
    private List<Review> reviews;
}

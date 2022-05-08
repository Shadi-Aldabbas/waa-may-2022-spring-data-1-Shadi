package com.homeworktwo.HW2.models.join_column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users_column")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String fName;
    private String lName;
    private String password;
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToMany
    @JoinColumn(name = "reviews_ids")
    private List<Review> reviews;
}

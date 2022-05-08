package com.homeworktwo.HW2.dto;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int id;
    private String fName;
    private String lName;
    private String password;
    private String email;
    private Address address;
}

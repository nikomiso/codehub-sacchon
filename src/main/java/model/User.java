package model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

// TODO: Create validation for username, email, password
//  * No duplicated username, email
//  * Correct email syntax
//  * Define how strong the password will have to be

@Data
@MappedSuperclass
public class User {
    @Column(unique = true)
    private String username;
    private String password;

    private String name;
    @Column(unique = true)
    private String email;
    private String address;


}

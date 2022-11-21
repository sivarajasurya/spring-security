package com.gcit.siva.springsecurity.model;
import lombok.Data;
import javax.persistence.*;
@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String userName;

    private String password;

    private boolean active;

    private String roles;

}

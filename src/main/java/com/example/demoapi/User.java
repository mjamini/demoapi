package com.example.demoapi;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author jmohanta
 */
@Entity
@Data
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    public User(){
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

   
}

package com.Hotel.Hotels.module;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.lang.model.element.Name;

@Entity
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    public int Owner_id;
    public String OwnerName;
    public String Address;
    public String Age;
    public String phone_NO;
    public String Date_Birth;
    public String Issue_number;




    }


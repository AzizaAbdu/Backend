package com.Hotel.Hotels.module;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int H_Id;
    public String H_Name;
    public String H_Address;

    @ManyToOne
    @JoinColumn(name = "Owner_id")
    public  Owner owner;


}

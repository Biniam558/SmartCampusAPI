/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartcampus.model;

/**
 *
 * @author biniama
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Room model class 
 * represents a  room details in the Smart Campus API system
 * it contains basic details & associated sensors
*/

public class Room {
    
    // unique identifier for the room
    private String id;
    // name of the room
    private String name;
    //number of people the room can hold
    private int capacity;
    // list of sensor IDs associated with this room
    private List<String> sensorIds = new ArrayList<>();
    // default constructor. this is required for json conversion
    public Room(){   
    }
    
    // constructor with main fields 
    public Room(String id, String name, int capacity){
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
    // getters & setters methods
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setSensorIds(List<String> sensorIds){
        this.sensorIds = sensorIds;
    }   
}

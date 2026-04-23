/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartcampus.model;

/**
 *
 * @author biniama
 * 
 * Sensor class for Smart Campus
 */

public class Sensor {
    private String id;
    private String type;
    private double value;
    
    // defaul constructor
    public Sensor(){
        
    }
    //  constructor with parameters
    public Sensor (String id, String type, double value){
        this.id = id;
        this.type = type;
        this.value = value;
    }
    
    // getters & setters methods
    public String getId(){
        return id;      
    }
    public void setId(String id){
        this.id = id;        
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
               
}

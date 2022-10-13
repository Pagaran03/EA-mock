/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce_advance;

/**
 *
 * @author USER
 */
public class Userlist extends Program{
    private int id,age;
    private String name,username,email,password;

    public Userlist(int ID, String NAME, int AGE, String USERNAME, String EMAIL, String PASSWORD){
        this.id = ID;
        this.name = NAME;
        this.age = AGE;
//       this.address = ADDRESS;
        this.username = USERNAME;
        this.email = EMAIL;
        this.password = PASSWORD;
    }
   
    public int setID(int ID){
        this.id = ID;
        return this.id;
    }

    public String setNAME(String NAME){
        this.name = NAME;
        return this.name;
    }

    public int setAGE(int AGE){
        this.age = AGE;
        return this.age;
    }
   
    public String setUSERNAME(String USERNAME){
        this.username = USERNAME;
        return this.username;
    }

    public String setEMAIL(String EMAIL){
        this.email = EMAIL;
        return this.email;
    }

    public String setPASSWORD(String PASSWORD){
        this.password = PASSWORD;
        return this.password;
    }

    //GETTERS
     
   

    public int getID(){
        
        return this.id;
    }

    public String getNAME(){
        
        return this.name;
    }

    public int getAGE(){
        
        return this.age;
    }
   

    public String getUSERNAME(){
        
        return this.username;
    }

    public String getEMAIL(){
        
        return this.email;
    }

    public String getPASSWORD(){
        
        return this.password;
    }
}

package com.mycompany.ecommerce_advance;

/**
 *
 * @author USER
 */
public class Userlist extends Program{
    private int id,age;
    private String name,username,email,password,address;

    public Userlist(int ID, String NAME, int AGE, String ADDRESS, String USERNAME, String EMAIL, String PASSWORD){
        this.id = ID;
        this.name = NAME;
        this.age = AGE;
        this.address = ADDRESS;
        this.username = USERNAME;
        this.email = EMAIL;
        this.password = PASSWORD;
    }
    //SETTERS
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
    public String setADDRESS(String ADDRESS){
        this.address = ADDRESS;
        return this.address;
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
    
    public String getADDRESS(){
        return this.address;
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

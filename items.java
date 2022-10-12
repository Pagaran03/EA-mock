/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce_advance;

/**
 *
 * @author USER
 */
public class items extends Program{
    private int price;
    private String prodname;

    public items(int PRICE, String PRODNAME){
        this.price = PRICE;
        this.prodname = PRODNAME;
    }
    // MAO NI ANG SETTERS PARA SA ITEM PRICE UG PRODUCT NAME
    // DIRI I SET SA IMONG PROGRAM ANG KATONG DATA NGA NAA NAKA BUTANG SA
    //PRODUCTLIST() NGA FUNCTION
    public int setPrice(int PRICE){
        this.price = PRICE;
        return this.price;
    }
    
    public String setProdName(String PRODNAME){
        this.prodname = PRODNAME;
        return this.prodname;
    } 

    // TAS MAO NI SIYA ANG GETTERS PARA SA PRICE UG NAME
    // DARI KUHAON SA IMONG PROGRAM ANG KATONG MGA NA SET
    // NGA DATA GIKAN SA SETTERS
    public int getPrice(){
        return this.price;
    }

    public String getProdName(){
        return this.prodname;
    }
}
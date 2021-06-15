/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author afri
 */
public class ReportModel {
    Date TDate;
    String ID;
    String Name;
    float Price;
    int Quantity;
    float Total;

    public ReportModel(Date TDate, String ID, String Name, float Price, int Quantity, float Total) {
        this.TDate = TDate;
        this.ID = ID;
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Total = Total;
    }

    public Date getTDate() {
        return TDate;
    }

    public void setTDate(Date TDate) {
        this.TDate = TDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
    
    
}

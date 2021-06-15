/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author afri
 */
public class Item {
    String ID;
    String Name;
    String Company;
    int Quantity;
    float Price;
    float Sprice;
    String Search;

    public Item(String ID, String Name, String Company, int Quantity, float Price, float Sprice) {
        this.ID = ID;
        this.Name = Name;
        this.Company = Company;
        this.Quantity = Quantity;
        this.Price = Price;
        this.Sprice = Sprice;
        this.Search = Search;
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

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public float getSprice() {
        return Sprice;
    }

    public void setSprice(float Sprice) {
        this.Sprice = Sprice;
    }

    public String getSearch() {
        return Search;
    }

    public void setSearch(String Search) {
        this.Search = Search;
    }
    
    
}

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
public class ReqRepire {
    String Name;
    String Id;
    String Gmail;
    String Address;
    int Telephone;

    public ReqRepire(String Name, String Id, String Gmail, String Address, int Telephone) {
        this.Name = Name;
        this.Id = Id;
        this.Gmail = Gmail;
        this.Address = Address;
        this.Telephone = Telephone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }
    
}

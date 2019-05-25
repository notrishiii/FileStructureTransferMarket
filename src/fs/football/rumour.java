/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs.football;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Rishi Jha
 */
public class rumour implements Serializable {
    String name;
    String ct;
    String nt;
    String price;
    String position;

    public rumour(String name, String ct, String nt, String price, String position) {
        this.name = name;
        this.ct = ct;
        this.nt = nt;
        this.price = price;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
    
    
    
}

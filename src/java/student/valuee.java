/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author demet
 */
@ManagedBean
public class valuee {
    private String ülke;
    private String isim;
    private String lastName;
    
    public valuee(){
       
    }

    public String getÜlke() {
        return ülke;
    }

    public void setÜlke(String ülke) {
        this.ülke = ülke;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}

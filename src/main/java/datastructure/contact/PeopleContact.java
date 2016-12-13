/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.contact;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author silayagiz
 */
public class PeopleContact {
    
    private String personName;
    private String personPhone;
    List<PeopleContact> peopleList;
    

    public PeopleContact() {
    }

    public PeopleContact(String personName, String personPhone) {
        this.personName = personName;
        this.personPhone = personPhone;
    }
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public List<PeopleContact> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<PeopleContact> peopleList) {
        this.peopleList = peopleList;
        
    }
    
    
    public String findPhoneNumberByName(String name) {


    
    Objects.requireNonNull(name, "name parameter cannot be null");

    return peopleList
            .stream()
            .filter(p -> name.equals(p.getPersonName()))
            .map(p -> p.getPersonPhone())
            .findFirst()
            .orElse(null);

}
   
    
    
    
    
}

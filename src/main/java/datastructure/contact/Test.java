package datastructure.contact;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author silayagiz
 */
public class Test {
    public static void main (String [] args)
    {
        
  
    PeopleContact personList = new PeopleContact();
    personList.setPeopleList(new ArrayList<>());
    
    
    PeopleContact person1 = new PeopleContact("aaa", "123123123");
    PeopleContact person2 = new PeopleContact("bbb", "159159159");
    PeopleContact person3 = new PeopleContact("ccc", "321321321");
    PeopleContact person4 = new PeopleContact("ddd", "753753753");
     
    personList.getPeopleList().add(person1);
    personList.getPeopleList().add(person2);
    personList.getPeopleList().add(person3);
    personList.getPeopleList().add(person4);
    
    String phoneNumber = personList.findPhoneNumberByName("aaa");
       
    System.out.println("Phone: " + phoneNumber );
    
      
    
  }    
    
}

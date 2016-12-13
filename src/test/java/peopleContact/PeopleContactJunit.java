/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleContact;

import datastructure.contact.PeopleContact;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author silayagiz
 */
public class PeopleContactJunit {
    
    public PeopleContactJunit() {
    }
    PeopleContact personList = new PeopleContact();
   
    @Before
    public void setUp() {
   
    personList.setPeopleList(new ArrayList<>());
    
    
    PeopleContact person1 = new PeopleContact("aaa", "123123123");
    PeopleContact person2 = new PeopleContact("bbb", "159159159");
    PeopleContact person3 = new PeopleContact("ccc", "321321321");
    PeopleContact person4 = new PeopleContact("ddd", "753753753");
     
    personList.getPeopleList().add(person1);
    personList.getPeopleList().add(person2);
    personList.getPeopleList().add(person3);
    personList.getPeopleList().add(person4);
    }
    
   
    @Test
    public void peopleContactTest()
    {
     
        String phoneNumber = personList.findPhoneNumberByName("aaa");
        assertEquals(phoneNumber, "123123123");
}
        
        
        
       
    
}

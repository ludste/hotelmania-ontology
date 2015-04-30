package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: BankAccount
* @author ontology bean generator
* @version 2015/04/30, 15:38:44
*/
public class BankAccount implements Concept {

   /**
* Protege name: hotelId
   */
   private String hotelId;
   public void setHotelId(String value) { 
    this.hotelId=value;
   }
   public String getHotelId() {
     return this.hotelId;
   }

   /**
* Protege name: balance
   */
   private float balance;
   public void setBalance(float value) { 
    this.balance=value;
   }
   public float getBalance() {
     return this.balance;
   }

}

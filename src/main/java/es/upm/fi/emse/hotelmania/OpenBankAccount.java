package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: OpenBankAccount
* @author ontology bean generator
* @version 2015/05/9, 20:33:24
*/
public class OpenBankAccount implements AgentAction {

   /**
* Protege name: hotel
   */
   private Hotel hotel;
   public void setHotel(Hotel value) { 
    this.hotel=value;
   }
   public Hotel getHotel() {
     return this.hotel;
   }

}

package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: charegeStaffHotel
* @author ontology bean generator
* @version 2015/05/9, 20:33:24
*/
public class CharegeStaffHotel implements AgentAction {

   /**
* Protege name: bill
   */
   private float bill;
   public void setBill(float value) { 
    this.bill=value;
   }
   public float getBill() {
     return this.bill;
   }

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

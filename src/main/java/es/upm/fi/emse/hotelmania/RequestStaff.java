package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: RequestStaff
* @author ontology bean generator
* @version 2015/05/9, 15:17:15
*/
public class RequestStaff implements AgentAction {

   /**
* Protege name: staff
   */
   private Staff staff;
   public void setStaff(Staff value) { 
    this.staff=value;
   }
   public Staff getStaff() {
     return this.staff;
   }

   /**
* Protege name: requestingHotel
   */
   private Hotel requestingHotel;
   public void setRequestingHotel(Hotel value) { 
    this.requestingHotel=value;
   }
   public Hotel getRequestingHotel() {
     return this.requestingHotel;
   }

}

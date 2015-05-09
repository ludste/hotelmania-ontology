package es.upm.fi.emse.hotelmania;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Time
* @author ontology bean generator
* @version 2015/05/9, 15:17:15
*/
public class Time implements Concept {

   /**
* Protege name: day
   */
   private int day;
   public void setDay(int value) { 
    this.day=value;
   }
   public int getDay() {
     return this.day;
   }

}

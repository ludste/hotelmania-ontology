#!/bin/bash
javac -classpath ../../../../../JADE/jade/lib/jade.jar es/upm/fi/emse/hotelmania/*.java
jar -cf ../../../HotelmaniaOntology.jar es/upm/fi/emse/hotelmania/*.class
rm -rf es/upm/fi/emse/hotelmania/*.class

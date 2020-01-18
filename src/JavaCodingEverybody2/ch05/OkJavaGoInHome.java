﻿package ch05;
	import org.opentutorials.iot.Elevator;
	import org.opentutorials.iot.Lighting;
	import org.opentutorials.iot.Security;
 
public class OkJavaGoInHome {
 // 부품들을 써서 완제품을 만들어보자 
    public static void main(String[] args) {
         
        String id = "JAVA APT 507";
         
        // Elevator call 
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
         
        // Security off 
        Security mySecurity = new Security(id);
        mySecurity.off();
         
        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();
         
        Lighting floorLamp = new Lighting(id+" / floorLamp");
        floorLamp.on();
 
    }
}
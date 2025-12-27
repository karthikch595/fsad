package com.kl;
class Vehicle {
 void start() {
     System.out.println("Vehicle is starting");
 }
}

class Car extends Vehicle {
 void drive() {
     System.out.println("keep seatbleats");
 }
}

class ElectricCar extends Car {
 void charge() {
     System.out.println("testing sensors all are working are not");
 }

 public static void main(String[] args) {
     ElectricCar ec = new ElectricCar();

     ec.start();   
     ec.drive();  
     ec.charge();  
 }
}

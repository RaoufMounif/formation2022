package org.example;

public class Voiture extends MoyenDeTransport{

    int maxSpeed = 0;

    @Override
    void start(){
        System.out.println("Hey you, bienvenue au bord BlaBlaJar");
    }
    @Override
    void showSpeed(){
        System.out.println("Drivig with alcohol not recommanded, drive with this speed" + this.maxSpeed);
    }
}

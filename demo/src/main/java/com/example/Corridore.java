package com.example;

public class Corridore extends Thread{

    private String nome;

    public Corridore(String n){
        nome=n;
    }

    public void  run(){
            for(int i=1; i<6; i++){
                System.out.println(nome + " ha fatto il passo: " + i);
                try{
                    Thread.sleep((int)(Math.random()*(800-200))+200);
                }catch(InterruptedException e){
                    System.out.println("Pausa interrotta");
                }
            }
            System.out.println(nome + " è' arrivato");;
    }
}

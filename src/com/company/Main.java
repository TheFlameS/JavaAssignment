package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //-----------------------Old code-------------------------
//        Scanner sc = new Scanner(System.in);
//        ArrayList <Koiking> koikingGroup = new ArrayList <Koiking>();
//
//        int amount = sc.nextInt();
//
//        for(int i=0 ; i< amount ; i++){
//            Koiking po = new Koiking (sc.next());
//            koikingGroup.add(po);
//        }
//
//        System.out.println("END OF INPUT" + "\n");
//        int jLoop = 0;
//        while (jLoop >= 0){
//            System.out.print("What to do? : ");
//            String s = sc.next();
//            if(s.equals("swim")){
//                System.out.print("How far? : ");
//                int stepAmount = sc.nextInt();
//                for(Koiking now: koikingGroup){
//                    now.swim(stepAmount);
//                }
//            }
//            else if(s.equals("list")){
//                for(Koiking now: koikingGroup){
//                    System.out.print(now.getName() + " Distance : " + now.getDistance() + " Weight : " + now.getWeight() + "\n");
//                }
//            }
//            else {
//                break;
//            }
//        }
//
//        for (Koiking i: koikingGroup) {
//            System.out.println(i.getName());
//            System.out.println(i.getWeight());
//        }
        //-----------------------Old code-------------------------

        PokemonFarm pokemonFarm = new PokemonFarm();
        CommandParser commandParser = new CommandParser(pokemonFarm);

        commandParser.run();


    }
}

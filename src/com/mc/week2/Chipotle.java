package com.mc.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Chipotle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        String[] burritos = new String[25];
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Rice");
        ingredients.add("Meat");
        ingredients.add("Beans");
        ingredients.add("Salsa");
        ingredients.add("Veggies");

        //Collections.addAll(ingredients,"white, brown, none","chicken, steak,carnidas,chorizo, sofritas, veggies",
        // "pinto, black, none","mild, medium,hot, none, all","lettuce,fajita veggies, none, all");

        for (int i=1;i <=burritos.length;i++){
            System.out.println("Burrito " + i+ ": "+ ingredients.get(rn.nextInt(ingredients.size())));
        }
    }
}

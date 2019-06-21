package com.mc.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chipotle {
    public static void main(String[] args) {
        Random rn = new Random();

        ArrayList<String> rice = new ArrayList<>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");

        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");
        int beansRand = rn.nextInt(3);


        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("mild+medium+hot salsa");


        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("lettuce+fajita veggies");
        veggies.add("no veggies");

        for (int i =0; i<=25; i++){
            String riceRand = rice.get(rn.nextInt(rice.size()));
            String meatRand = meat.get(rn.nextInt(meat.size()));
            String beanRand = beans.get(rn.nextInt(beans.size()));
            String salsaRand = salsa.get(rn.nextInt(salsa.size()));
            String veggiesRand = veggies.get(rn.nextInt(veggies.size()));


            System.out.println("Burrito "+ i+ ": "+ riceRand+ ", "+ meatRand+", "+ beanRand+ ", "+ salsaRand+ ", "+veggiesRand);
        }

    }
}

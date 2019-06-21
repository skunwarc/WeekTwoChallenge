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
        int riceRand = rn.nextInt(3);
        String riceGen = rice.get(riceRand);

        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");
        int meatRand = 1+rn.nextInt(6);
        String meatGen = meat.get(meatRand);

        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");
        int beansRand = 1+rn.nextInt(3);
        String beanGen = beans.get(beansRand);

        ArrayList<String> salsa = new ArrayList<>();
        int salsaRand = 1+rn.nextInt(5);
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("mild+medium+hot salsa");
        String salsaGen = salsa.get(salsaRand);

        ArrayList<String> veggies = new ArrayList<>();
        int veggiesRand = 1+rn.nextInt(4);
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("lettuce+fajita veggies");
        veggies.add("no veggies");
        String veggieGen =  veggies.get(veggiesRand);

        for (int i =0; i<=25; i++){
            System.out.println("Burrito "+ i+ ": "+ riceGen+ ", "+ meatGen+", "+ beanGen+ ", "+ salsaGen+ ", "+veggieGen);
        }
    }
}

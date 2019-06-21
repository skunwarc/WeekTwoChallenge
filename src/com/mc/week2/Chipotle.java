package com.mc.week2;

import java.util.*;

public class Chipotle {
    public static void main(String[] args) {
        Random rn = new Random();

        List<String> rice = new ArrayList<>();
        rice .add("white rice ");
        rice .add("brown rice ");
        rice .add("no rice");
        int riceRand= new Random().nextInt(3);
        String riceGen = rice.get(riceRand);

        List<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");
        int meatRand = new Random().nextInt(6);
        String meatGen = meat.get(meatRand);

        List<String> beans = new ArrayList<>();
        beans.add("pinto");
        beans.add("black");
        beans.add("no beans");
        int beansRand = rn.nextInt(3);

        List<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no");
        salsa.add("mild+medium+hot salsa");
        int salsaRand = rn.nextInt(5);

        List<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita");
        veggies.add("lettuce+fajita+ vaggies");
        veggies.add("no");
        int veggiesRand = rn.nextInt(4);

        for (int i =0; i<=25; i++){

            System.out.println("Burrito "+ i+ ": "+ riceGen+ ", "+ meatGen+", ");
        }


    }
}

/*
Write a program that will allow a robot to assemble 25 burritos. Use a random generator for each burrito option and
 build a list of 25 burrito customizations:

Rice: white, brown, none
Meat: chicken, steak, carnidas, chorizo, sofritas, veggies
Beans: pinto, black, none
Salsa: mild, medium, hot, none, all
Veggies: lettuce, fajita veggies, none, all
Cheese: yes/no
Guac: yes/no
Queso: yes/no
Sour cream: yes/no

Start with a minimum of 5 ingredients for a burrito. If you still have time at the end, you can add more ingredients.

If you finish the project before 3pm then display a price for each burrito. Pricing will be $3.00 plus .50 for each
ingredient.

Then modify your program to use methods. For example, you can call a method from main whose sole purpose is to calculate
 the price of the burrito.
 */
package com.mc.week2;

import java.util.ArrayList;
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

        ArrayList<String> cheese = new ArrayList<>();
        cheese.add("yes cheese");
        cheese.add("no cheese");

        ArrayList<String> gauc = new ArrayList<>();
        gauc.add("yes guac");
        gauc.add("no guac");

        ArrayList<String> queso = new ArrayList<>();
        queso.add("yes queso");
        queso.add("no queso");

        ArrayList<String> sour = new ArrayList<>();
        sour.add("yes sour");
        sour.add("no sour");

        for (int i =0; i<=25; i++){
            String riceRand = rice.get(rn.nextInt(rice.size()));
            String meatRand = meat.get(rn.nextInt(meat.size()));
            String beanRand = beans.get(rn.nextInt(beans.size()));
            String salsaRand = salsa.get(rn.nextInt(salsa.size()));
            String veggiesRand = veggies.get(rn.nextInt(veggies.size()));
            String cheeseRand = cheese.get(rn.nextInt(cheese.size()));
            String gaucRand = gauc.get(rn.nextInt(gauc.size()));
            String quesoRand = gauc.get(rn.nextInt(queso.size()));
            String sourRand = sour.get(rn.nextInt(sour.size()));

            System.out.println("Burrito "+ i+ ": "+ riceRand+ ", "+ meatRand+", "+ beanRand+ ", "+ salsaRand+ ","
                    +veggiesRand+ ","+ cheeseRand+ ","+ gaucRand+ ","+quesoRand+","+ sourRand);
        }
        priceCalculate(rice,meat,bean,salsa,veggy,cheese,guac,queso,sour);
    }
    public static void priceCalculate(String rice, String meat,String bean,String salsa, String veggy, String cheese,
                                        String guac, String queso,String sour){
        double basePrice =3.00;
        if (!rice.equalsIgnoreCase("no")){
            basePrice +=0.5;
        }if(!meat.equalsIgnoreCase("no")){
            basePrice +=0.5;
        }if(!bean.equalsIgnoreCase("no")){
            basePrice +=0.5;
        }if(!cheese.equalsIgnoreCase("no")){
            basePrice +=0.5;
        }if(!guac.equalsIgnoreCase("no")){
            basePrice +=0.5;
        }if(!queso.equalsIgnoreCase("no")){
            basePrice +=0.5;
        }if(!sour.equalsIgnoreCase("no")){
            basePrice +=0.5;
        }if(salsa.equalsIgnoreCase("mild+medium+hot")){
            basePrice +=1.5;
        }else if (!salsa.equalsIgnoreCase("no")){
            basePrice+= 0.5;
        }
        System.out.println("Base price of each burrito: "+ basePrice);
    }

}

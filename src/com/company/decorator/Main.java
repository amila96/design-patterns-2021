package com.company.decorator;

public class Main {

    public static void main(String[] args) {

        Pizza pizza=new ThinCrustPizza();
        Pizza bbqChickenPizza= new BBQChicken(pizza);
        Pizza bbqChickenWithExtraCheese=new ExtraCheese(bbqChickenPizza);
        System.out.println("Cost of bbq chicken with extra cheese"+bbqChickenWithExtraCheese.getCost());

        Pizza pizza1=new PanPizza();
        Pizza thandooriChicken=new ThandooriChicken(pizza1);
        System.out.println("Cost of the pan pizza with thandoori Chicken"+thandooriChicken.getCost());



    }

}

package entities;

import java.util.ArrayList;

public class CarDealer {
     private static CarDealer instance;
     private ArrayList<Car> inventory;

     private CarDealer() {
         this.inventory = new ArrayList<>();
     }

     public static CarDealer getInstance() {
         if (instance == null) {
             instance = new CarDealer();
         }
         return instance;
     }
}

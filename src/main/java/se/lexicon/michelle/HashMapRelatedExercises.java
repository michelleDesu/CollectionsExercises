package se.lexicon.michelle;

import java.util.HashMap;

public class HashMapRelatedExercises {
    //9. Create a new hashMap of type <Integer,String> and populate it with
    // elements containing an id(Integer) and a car brand(String).
    // Lastly, print out the entire hashMap.
    public void printHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Ford");
        hashMap.put(4, "Lamborghini");
        hashMap.put(5, "Toyota");

        System.out.println(hashMap);

    }

    //10. Create a new hashMap of type <Integer,String> and populate it with
    // elements containing an id(Integer) and a car brand(String).
    //Lastly, print out only the keys.
    public void printOnlyKeysHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Ford");
        hashMap.put(4, "Lamborghini");
        hashMap.put(5, "Toyota");

        System.out.println(hashMap.keySet());
    }

    //11. Create a new hashMap of type <Integer,String> and populate it with
    // elements containing an id(Integer) and a car brand(String).
    //print out only the values.
    public void printOnlyValuesHashMap(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2, "Saab");
        hashMap.put(3, "Ford");
        hashMap.put(4, "Lamborghini");
        hashMap.put(5, "Toyota");

        System.out.println(hashMap.values());
    }

    //11. Create a new hashMap of type <Integer,String> and populate it with
    //Create a new hashMap of type <Integer,Car> and
    // populate it with elements containing an id(Integer) and a car object(Car).
    // Lastly, print out only the car's brand.

    public void printOutCarBrand(){
        HashMap<Integer, Car> hashMap = new HashMap<>();

        Car     car1 = new Car(1,"Volvo", "Combi"),
                car2 = new Car(2, "Saab", "Sport"),
                car3 = new Car(3, "Ford", "Combi"),
                car4 = new Car(4,"Lamborghini", "Sport"),
                car5 = new Car ( 5 , "Toyota", "Sedan");

        hashMap.put(1,car1 );
        hashMap.put(2,car2 );
        hashMap.put(3,car3  );
        hashMap.put(4,car4 );
        hashMap.put(5,car5  );
        for(Integer i : hashMap.keySet()){
            System.out.println(hashMap.get(i).getBrand());
        }


    }

}

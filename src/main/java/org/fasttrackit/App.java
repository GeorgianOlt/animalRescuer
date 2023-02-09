package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    Adopter adopterReference = new Adopter();
    adopterReference.adopterName = "Jon";
    adopterReference.availableMoney = 1200;

        System.out.println(adopterReference.adopterName);
        System.out.println(adopterReference.availableMoney);

    Animal animalReference = new Animal();
    animalReference.animalName = "Bishon";
    animalReference.age = 1;
    animalReference.favoriteFood = "Meat";
    animalReference.favoriteRecreationActivity = "Running";
    animalReference.feelingHungryLevel = 6;
    animalReference.levelOfHealthStatus = 8;
    animalReference.moodLevel = 10;



    AnimalFood animalFoodReference = new AnimalFood();
    animalFoodReference.foodName = "Meat";
    animalFoodReference.foodPrice = 7.5;
    animalFoodReference.foodQuantity = 5;
    animalFoodReference.stockAvailability = true;
    animalFoodReference.expiryDate = 10/10/2026;



    Game gameReference = new Game();
    gameReference.adopter = "Jon";
    gameReference.dog = "Bishon";
    gameReference.vet = "Charly";



    RecreationActivity recreationActivityReference = new RecreationActivity();
    recreationActivityReference.recreationName = "Running";



    Vet vetReference = new Vet();
    vetReference.vetName = "Charly";
    vetReference.vetSpecialization = "Pets";

        System.out.println(vetReference.vetName);


    }
}

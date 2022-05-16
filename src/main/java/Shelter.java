//TODO У вас есть 24 собаки и 8 котов. Порция обеда для каждого животного составляет 50 грамм и стоит 2 доллара. Животные кушают 3 раза в день.
//TODO Сколько нужно корма для котов в месяц?
//TODO Сколько нужно корма для собак в месяц?
//TODO Сколько нужно денег в месяц на содержание приюта?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shelter {

    public static void main(String []args) throws IOException {

        //Ask for User`s input about shelter
        //Ask how many Cats + show the input for user
        BufferedReader CatReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter cats quantity - ");
        int cat = Integer.parseInt(CatReader.readLine());

        //Ask how many Dogs + show the input for user
        System.out.println("Cats quantity - " + cat + "\n" + "_______________________________________________________________");
        BufferedReader DogReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter dogs quantity - ");
        int dog = Integer.parseInt(DogReader.readLine());

        //Ask how many dogs and cats will eat by one portion of food + show the input for user
        System.out.println("Cats quantity - " + cat);
        System.out.println("Dogs quantity - " + dog + "\n" + "_______________________________________________________________");
        BufferedReader rationFoodWeightReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Ration Food Weight per one meal(gram) - ");
        int rationFoodWeight = Integer.parseInt(rationFoodWeightReader.readLine());

        //Ask how many one meal will be cost + show the input for user
        System.out.println("Cats quantity - " + cat);
        System.out.println("Dogs quantity - " + dog);
        System.out.println("Ration Food Weight per one meal - " + rationFoodWeight + " Gram" + "\n" + "_______________________________________________________________");
        BufferedReader RationUsdReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the cost for one meal(USD) - ");
        int RationUsd = Integer.parseInt(RationUsdReader.readLine());

        //Ask how many times dogs and cats will eat + show the input for user
        System.out.println("Cats quantity - " + cat);
        System.out.println("Dogs quantity - " + dog);
        System.out.println("Ration Food Weight per one meal - " + rationFoodWeight + " Gram");
        System.out.println("The cost for one meal - " + RationUsd + " USD" + "\n" + "_______________________________________________________________");
        BufferedReader mealsPerDayReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many times dogs and cats will eat, per day - ");
        int mealsPerDay = Integer.parseInt(mealsPerDayReader.readLine());

        //Ask how many days in the month the user would like to calculate + show the input for user
        System.out.println("Cats quantity - " + cat);
        System.out.println("Dogs quantity - " + dog);
        System.out.println("Ration Food Weight per one meal - " + rationFoodWeight + " Gram");
        System.out.println("The cost for one meal - " + RationUsd + " USD" + "\n" + "_______________________________________________________________");
        BufferedReader DaysQuantityReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter, how many days in your month - ");
        int DaysQuantity = Integer.parseInt(DaysQuantityReader.readLine());

        //show to the user the information entered
        System.out.println("Cats quantity - " + cat);
        System.out.println("Dogs quantity - " + dog);
        System.out.println("Ration Food Weight per one meal - " + rationFoodWeight  + " Gram");
        System.out.println("The cost for one meal - " + RationUsd + " USD");
        System.out.println("Dogs and cats eat, per day - " + mealsPerDay + " Times");
        System.out.println("Your month has - " + DaysQuantity + " Days"  + "\n" + "_______________________________________________________________");

            //What would be if user entered 28 days, calculation for total cost, and food weight for Cats and Dogs
            if (DaysQuantity == 28) {
                for (DaysQuantity = 1; DaysQuantity < DaysQuantity + 1; DaysQuantity++) {
                    int totalWeightCats = (cat * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalWeightDogs = (dog * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalCost = (mealsPerDay * RationUsd * DaysQuantity * (cat + dog));
                    if (DaysQuantity == 28) {
                    System.out.println("The total weight of food for cats for shelter for 1 month is " + totalWeightCats + " Gram or ~ " + totalWeightCats / 1000 + "Kg");
                    System.out.println("The total weight of food for dogs for shelter for 1 month is " + totalWeightDogs + " Gram or ~ " + totalWeightDogs / 1000 + "Kg");
                    System.out.println("The total food cost for shelter for 1 month is " + totalCost + " USD");
                    }
                }

            //What would be if user entered 29 days, calculation for total cost, and food weight for Cats and Dogs
            } else if (DaysQuantity == 29) {
                for (DaysQuantity = 1; DaysQuantity < DaysQuantity + 1; DaysQuantity++) {
                    int totalWeightCats = (cat * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalWeightDogs = (dog * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalCost = (mealsPerDay * RationUsd * DaysQuantity * (cat + dog));
                    if (DaysQuantity == 29) {
                        System.out.println("The total weight of food for cats for shelter for 1 month is " + totalWeightCats + " Gram or ~ " + totalWeightCats / 1000 + "Kg");
                        System.out.println("The total weight of food for dogs for shelter for 1 month is " + totalWeightDogs + " Gram or ~ " + totalWeightDogs / 1000 + "Kg");
                        System.out.println("The total food cost for shelter for 1 month is " + totalCost + " USD");
                    }
                }

            //What would be if user entered 30 days, calculation for total cost, and food weight for Cats and Dogs
            } else if (DaysQuantity == 30) {
                for (DaysQuantity = 1; DaysQuantity < DaysQuantity + 1; DaysQuantity++) {
                    int totalWeightCats = (cat * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalWeightDogs = (dog * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalCost = (mealsPerDay * RationUsd * DaysQuantity * (cat + dog));
                    if (DaysQuantity == 30) {
                        System.out.println("The total weight of food for cats for shelter for 1 month is " + totalWeightCats + " Gram or ~ " + totalWeightCats / 1000 + "Kg");
                        System.out.println("The total weight of food for dogs for shelter for 1 month is " + totalWeightDogs + " Gram or ~ " + totalWeightDogs / 1000 + "Kg");
                        System.out.println("The total food cost for shelter for 1 month is " + totalCost + " USD");
                    }
                }

            //What would be if user entered 31 days, calculation for total cost, and food weight for Cats and Dogs
            } else if (DaysQuantity == 31) {
                for (DaysQuantity = 1; DaysQuantity < DaysQuantity + 1; DaysQuantity++) {
                    int totalWeightCats = (cat * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalWeightDogs = (dog * DaysQuantity * rationFoodWeight * mealsPerDay);
                    int totalCost = (mealsPerDay * RationUsd * DaysQuantity * (cat + dog));
                    if (DaysQuantity == 31) {
                        System.out.println("The total weight of food for cats for shelter for 1 month is " + totalWeightCats + " Gram or ~ " + totalWeightCats / 1000 + "Kg");
                        System.out.println("The total weight of food for dogs for shelter for 1 month is " + totalWeightDogs + " Gram or ~ " + totalWeightDogs / 1000 + "Kg");
                        System.out.println("The total food cost for shelter for 1 month is " + totalCost + " USD");
                    }
                }

            //What would be if user entered corresponding number days for month
            } else {
                System.out.println("Such month does not exist");
            }
    }
}

package car_dealership;

import java.util.Scanner;

public class Main {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Car carDetails1 = new Car("Honda", "Accord", 124, 24.25F);
        Car carDetails2 = new Car("Lexus", "Ex300", 83, 18.50F);
        Car carDetails3 = new Car("Mercedes", "CL300", 23, 15.05F);

        Dealership dealershipDetails = new Dealership("Jay's Car Dealer");

        dealershipDetails.availableCars.add(carDetails1);
        dealershipDetails.availableCars.add(carDetails2);
        dealershipDetails.availableCars.add(carDetails3);

        System.out.println("--------------------");

        System.out.println(dealershipDetails.name);

        System.out.println("--------------------");

//
//        dealershipDetails.showInventory();

        String carSelection;
        String carReturn;

        while(true) {
            System.out.println("(1) Book a car");
            System.out.println("(2) Return a car");
            System.out.println("(3) Exit the dealerShip");
            System.out.println("Please select your menu by entering a number from 1 - 3");

            int userNum = userInput.nextInt();
            userInput.nextLine();

            if(userNum == 1) {
                System.out.println("Select your Car:");
                dealershipDetails.showInventory();

                carSelection = userInput.nextLine();

                dealershipDetails.bookedCar(carSelection);
                System.out.println("Available  cars: \n" + dealershipDetails.availableCars);

            }

            else if(userNum == 2) {
                System.out.println("Return a car:");
                carReturn = userInput.nextLine();

                dealershipDetails.returnCar(carReturn);

                System.out.println("Available  cars: \n" + dealershipDetails.availableCars);

            }
            else if(userNum == 3) {
                System.out.println("Leaving the dealership");
                break;
            }
        }
    }
}

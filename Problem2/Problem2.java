/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022B
  Assessment: Test 1
  Author: Nguyen Cuong Anh Minh
  ID: 3931605
  Created  date: 06/08/2022
  Acknowledgement: Acknowledge the resources that you use here.
*/
package Problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    protected static ArrayList<Vehicle> vehicles;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to DMV\s
                Options:\s
                1: Register vehicle
                2: Search vehicles
                3: Display vehicle info
                4: Change ownership
                5: Exit
                """);

        while (true) {
            System.out.print("Enter an option: ");
            String input = scanner.next();
            switch (input){
                case "1":
                    registerVehicle(scanner);
                    break;
                case "2":
                    searchVehicles();
                case "3":
                    displayVehicleInfo();
                case "4":
                    changeOwnerShip();
                case "5":
                    System.exit(0);
            }
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void registerVehicle(Scanner scanner) {
        System.out.println("Enter vehicle vin: ");
        String vin = scanner.nextLine();
        System.out.println("Enter vehicle maker: ");
        String maker = scanner.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();
        System.out.println("Enter vehicle year: ");
        int year = scanner.nextInt();
        System.out.println("Enter vehicle color: ");
        String color = scanner.nextLine();
        System.out.println("Enter vehicle engineSize: ");
        String engineSize = scanner.nextLine();
        System.out.println("Enter vehicle fuelType: ");
        String fuelType = scanner.nextLine();
        System.out.println("Enter vehicle licensePlate: ");
        String licensePlate = scanner.nextLine();
        System.out.println("Enter vehicle register date: ");
        String registerDate = scanner.nextLine();

        Vehicle vehicle = new Vehicle(vin,maker,model,year,color,
                engineSize,fuelType,licensePlate);
        vehicle.addRegistrationDate(registerDate);
        vehicles.add(vehicle);
    }

    private static void searchVehicles(Scanner scanner){
        System.out.println("Enter the Maker of the vehicle");
        String vehicleMaker = scanner.nextLine();
        for (Vehicle vehicle: vehicles){
            if (vehicle.getMaker().contains(vehicleMaker)){
                vehicle
            }
        }
        if
    }
}


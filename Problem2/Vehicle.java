package Problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
    private String vin;
    private String maker;
    private String model;
    private int year;
    private String color;
    private String engineSize;
    private String fuelType;
    private String licensePlate;

    protected ArrayList<String> registrationDates;

    protected  ArrayList<Person> ownedBy;

    protected void addRegistrationDate(String registDate) {
        registrationDates.add(registDate);
    }
    public Vehicle(String vin, String maker, String model, int year,
                   String color, String engineSize, String fuelType,
                   String licensePlate) {
        this.vin = vin;
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.licensePlate = licensePlate;
    }


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void displayVehicle(){
        System.out.println("Vin: " + this.getVin() + "\n" +
                "Maker: " + this.getMaker() + "\n" +
                "Model: " + this.getModel() + "\n" +
                "Year: " + this.getYear() + "\n" +
                "Color: " + this.getColor() + "\n" +
                ""
                "");
    }

}

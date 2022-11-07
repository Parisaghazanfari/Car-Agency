package Boundry;

import Entity.CarInformation;

import java.util.ArrayList;

public class CarOperation {
    ArrayList<CarInformation> cars = new ArrayList<>();
    ArrayList<CarInformation> rentalCar = new ArrayList<>();
    CarInformation carInformation1 = new CarInformation(1, "BMW", "10", "100");
    CarInformation carInformation2 = new CarInformation(2, "Mercedes Benz", "20", "200");
    CarInformation carInformation3 = new CarInformation(3, "Porsche", "10", "300");

    public void addCar() {
        cars.add(carInformation1);
        cars.add(carInformation2);
        cars.add(carInformation3);
    }

    public void rentCar(CarInformation carInformation) {
        rentalCar.add(carInformation);
        cars.remove(carInformation);
    }

    public void reverseCar(CarInformation carInformation) {
        cars.add(carInformation);
        rentalCar.remove(carInformation);
    }
    public CarInformation printCars() {
        for (CarInformation carinformation : cars
        ) {
            System.out.println(carinformation);
        }
        return null;
    }

    public CarInformation printRentalCar() {
        for (CarInformation carInformation : rentalCar
        ) {
            System.out.println(carInformation);
        }
        return null;
    }

    public void rentCar(int id) {
        CarInformation carInfo = findCarForRent(id);
        rentCar(carInfo);

    }

    public void reverseCar(int id) {
        CarInformation carInfo = findCarForReverse(id);
        System.out.println(carInfo);
        reverseCar(carInfo);
        ;
    }

    public CarInformation findCarForRent(int id) {
        for (CarInformation carInformation : cars
        ) {
            if (carInformation.getId() == id) {
                System.out.println("You car is:");
                System.out.println(carInformation);
                System.out.println("Car was  successfully rented\n\n");
                return carInformation;
            }
        }
        System.out.println("Car is not exist");
        return null;
    }

    public CarInformation findCarForReverse(int id) {
        for (CarInformation carInformation : rentalCar
        ) {
            if (carInformation.getId() == id){
                System.out.println("YOur car is:");
                System.out.println(carInformation);
                System.out.println("Car was successfully reversed\n\n");
                return carInformation;
            }
        }
        System.out.println("Car is not exist");
        return null;
    }

}

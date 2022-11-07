package Controller;

import Boundry.CarOperation;
import Boundry.GetCustomInfo;
import Entity.CarInformation;
import Entity.CustomerInformation;
import Entity.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Menu menu=new Menu();
        CarOperation carOperation=new CarOperation();
        GetCustomInfo getCustomInfo=new GetCustomInfo();
        System.out.println("\nWelcome to our Agency\n");
        carOperation.addCar();
        getCustomInfo.getCustomInfo();
        Scanner scanner=new Scanner(System.in);
        menu.menuBar();
        int operation=scanner.nextInt();
        while(operation!=0) {

            switch (operation) {
                case 1:
                    carOperation.printCars();
                    System.out.println("\nWhich car do you want to rent?\n" + "Please import car's ID:");
                    int id = scanner.nextInt();
                    while(id!=0) {
                        carOperation.rentCar(id);
                        System.out.println("Import 0 to continue:");
                        id=scanner.nextInt();
                    }
                    menu.menuBar();
                    operation = scanner.nextInt();
                    break;
                case 2:
                    carOperation.printRentalCar();
                    System.out.println("\nWhich car do you want to reverse?\n" + "Please import car's ID:");
                    int id1 = scanner.nextInt();
                    while(id1!=0) {
                        carOperation.reverseCar(id1);
                        System.out.println("Import 0 to continue:");
                        id1=scanner.nextInt();
                    }
                    menu.menuBar();
                    operation = scanner.nextInt();
                    break;
                case 3:
                    carOperation.printCars();
                    menu.menuBar();
                    operation = scanner.nextInt();
                    break;
                case 4:
                    carOperation.printRentalCar();
                    menu.menuBar();
                    operation = scanner.nextInt();
                    break;
            }
        }
        System.out.println("Bye");
    }
}

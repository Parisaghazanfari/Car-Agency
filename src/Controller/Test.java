package Controller;

import Boundry.CarOperation;
import Entity.CarInformation;
import Entity.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Menu menu=new Menu();
        CarOperation carOperation=new CarOperation();
        System.out.println("Welcome to our Agency");
        carOperation.addCar();
        Scanner scanner=new Scanner(System.in);
        menu.menuBar();
        int operation=scanner.nextInt();
        while(operation!=0) {

            switch (operation) {
                case 1:
                    carOperation.printCars();
                    System.out.println("\nWhich car do you want?\n" + "Please import id:");
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
                    break;
            }
        }
        System.out.println("Bye");
    }
}

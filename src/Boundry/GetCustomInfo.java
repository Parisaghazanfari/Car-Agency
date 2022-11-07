package Boundry;

import Entity.CustomerInformation;

import java.util.Scanner;

public class GetCustomInfo {
    public CustomerInformation getCustomInfo(){
        CustomerInformation customerInformation=new CustomerInformation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Name:");
        customerInformation.setName(scanner.next());
        System.out.println("Last Name:");
        customerInformation.setLastName(scanner.next());
        System.out.println("Phone Number:");
        customerInformation.setPhoneNumber(scanner.next());
        System.out.println("Today's Date:");
        customerInformation.setDate(scanner.next());
        System.out.println("Today's Hour");
        customerInformation.setHours(scanner.next());
        return customerInformation;
    }
}

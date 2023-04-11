package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    static Contact person = new Contact();
    static  Scanner sc = new Scanner(System.in);
    public static void addContact(){

        System.out.println("Enter the First name");
        String firstName= sc.next();
        person.setFirstName(firstName);
        System.out.println("Enter the Last name");
        String lastName= sc.next();
        person.setLastName(lastName);
        System.out.println("Enter the Address");
        String address = sc.next();
        person.setAddress(address);
        System.out.println("Enter the City");
        String city= sc.next();
        person.setCity(city);
        System.out.println("Enter the State");
        String state= sc.next();
        person.setState(state);
        System.out.println("Enter the ZipCode");
        int zip = sc.nextInt();
        person.setZip(zip);
        System.out.println("Enter the PhoneNumber");
        long phoneNumber = sc.nextLong();
        person.setPhoneNumber(phoneNumber);
        System.out.println("Enter the EmailId");
        String email= sc.next();
        person.setEmailId(email);

        System.out.println(person);
    }

    public static void editContact(){

            System.out.println("Edit the Contact");
            String s;
                System.out.println("Choose an option");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter First name :");
                        person.setFirstName(sc.next());
                        break;

                    case 2:
                        System.out.println("Enter Last name :");
                        person.setLastName(sc.next());
                        break;
                    case 3 :
                        System.out.println("Enter Addresss");
                        person.setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter the City :");
                        person.setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter the state :");
                        person.setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter zip code :");
                        person.setZip(sc.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter Phone number:");
                        person.setPhoneNumber(sc.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter Phone number :");
                        person.setEmailId(sc.next());
                        break;
                    default:
                        System.out.println("wrong option");


                }
        System.out.println(person);
    }

    public static void main(String[] args) {
        AddressBook obj = new AddressBook();
        obj.addContact();
        editContact();

    }
}

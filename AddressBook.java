package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {


    static Scanner sc = new Scanner(System.in);
    ArrayList<Contact> person1 = new ArrayList<>();
    public void addContact() {

        Contact contact = new Contact();
        System.out.println("Enter the First name");
        String firstName = sc.next();
        contact.setFirstName(firstName);

        System.out.println("Enter the Last name");
        String lastName = sc.next();
         contact.setLastName(lastName);

        System.out.println("Enter the Address");
        String address = sc.next();
        contact.setAddress(address);

        System.out.println("Enter the City");
        String city = sc.next();
       contact.setCity(city);

        System.out.println("Enter the State");
        String state = sc.next();
        contact.setState(state);

        System.out.println("Enter the ZipCode");
        int zip = sc.nextInt();
         contact.setZip(zip);

        System.out.println("Enter the PhoneNumber");
        long phoneNumber = sc.nextLong();
         contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter the EmailId");
        String email = sc.next();
        contact.setEmailId(email);

        person1.add(contact);

    }

    public static void editContact(){
        Contact person = new Contact();
        Scanner sc = new Scanner(System.in);
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
    public static void deleteContact(){
        Contact person = new Contact();
        Scanner sc = new Scanner(System.in);

        System.out.println("delete the Contact");
        String s;
        System.out.println("Choose an option");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Delete First name :");
                person.setFirstName(null);
                break;

            case 2:
                System.out.println("Delete Last name :");
                person.setLastName(null);
                break;
            case 3 :
                System.out.println("Delete Addresss");
                person.setAddress(null);
                break;
            case 4:
                System.out.println("Delete the City :");
                person.setCity(null);
                break;
            case 5:
                System.out.println("Delete the state :");
                person.setState(null);
                break;
            case 6:
                System.out.println("Delete zip code :");
                person.setZip(0);
                break;
            case 7:
                System.out.println("Delete Phone number:");
                person.setPhoneNumber(0);
                break;
            case 8:
                System.out.println("Delete Phone number :");
                person.setEmailId(null);
                break;
            default:
                System.out.println("wrong option");


        }
        System.out.println(person);
    }

    @Override
    public String toString() {
        return "AddressBook{" +

                ", person1=" + person1 +
                '}';
    }

    public static void main(String[] args) {
        AddressBook family = new AddressBook();
        System.out.println("enter no of contact");
        int noOfContact= sc.nextInt();

        for(int i = 0; i<noOfContact;i++) {
            family.addContact();
        }
        System.out.println(family);
        AddressBook office = new AddressBook();
        System.out.println("enter no of contact for office");
        int noOfContact1= sc.nextInt();

        for(int i = 0; i<noOfContact1;i++) {
            office.addContact();
        }
        System.out.println(office);




//        AddressBook contact2 = new AddressBook();
//        contact2.addContact();

        //AddressBook contact2 = new AddressBook();
//        contact2.addContact();

//        AddressBook.addContact();
//        System.out.println(person);
        //editContact();
        //System.out.println(person);
        //deleteContact();;
        //System.out.println(person);

    }
}

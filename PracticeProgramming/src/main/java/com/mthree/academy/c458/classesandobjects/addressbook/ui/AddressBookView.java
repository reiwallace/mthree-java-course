package com.mthree.academy.c458.classesandobjects.addressbook.ui;

import com.mthree.academy.c458.classesandobjects.addressbook.dto.Address;
import com.mthree.academy.c458.classesandobjects.addressbook.enums.MenuOption;

import java.util.Collection;

public class AddressBookView {
    private final UserIO io;

    public AddressBookView(UserIO io) {
        this.io = io;
    }

    public void viewMainMenu() {
        io.print("========== \nMAIN MENU");
        io.print("Please select the operation you wish to perform:");
        io.print("1. Add Address");
        io.print("2. Delete Address");
        io.print("3. Find Address");
        io.print("4. List Address Count");
        io.print("5. List All Addresses");
        io.print("6. Exit");
    }

    public MenuOption getMainMenuChoice() {
        return MenuOption.getFromInt(io.readInt("",1, 6));
    }

    public Address getNewAddress() {
        // Prompt user and take string inputs
        io.print("\nADD ADDRESS");
        String firstname = io.readString("Please Enter First Name:");
        String surname = io.readString("Please Enter Last Name:");
        String address = io.readString("Please Enter Street Address:");
        io.print(".");
        io.print(".");
        io.print(".");

        // Return new address
        return new Address(firstname, surname, address);
    }

    public void addAddressSuccess() {
        io.print("Address added.");
        outputReturnToMenu();
    }

    public void addAddressFail() {
        io.print("Failed to add address.");
        outputReturnToMenu();
    }

    public String getAddressToRemove() {
        io.print("\nREMOVE ADDRESS");
        return io.readString("Please enter last name of address to delete");
    }

    public boolean printAddressAndConfirm(Address address) {
        printAddressInfo(address);
        // Read user option
        return io.readString("Really Delete? Y/N").equalsIgnoreCase("y");
    }

    public void removeAddressSuccess() {
        io.print("Address Deleted");
        outputReturnToMenu();
    }

    public void removeAddressFail() {
        io.print("Address could not be deleted.");
        outputReturnToMenu();
    }

    public String findAddress() {
        io.print("\nFIND ADDRESS");
        return io.readString("Please enter last name of address to find");
    }

    public void findAddressSuccess(Address address) {
        printAddressInfo(address);
        outputReturnToMenu();
    }

    public void findAddressFail() {
        io.print("Address not found.");
        outputReturnToMenu();
    }

    public void viewAddressCount(int count) {
        io.print("\nADDRESS COUNT");
        io.print("There are " + count + " addresses in the book.");
        outputReturnToMenu();
    }

    public void listAddresses(Collection<Address> addresses) {
        io.print("\nLIST ADDRESSES");

        // Iterate over address and print them
        for(Address address : addresses) {
            io.print("");
            printAddressInfo(address);
        }
        outputReturnToMenu();
    }

    public void sayGoodbye() {
        io.print("Goodbye!");
    }

    private void printAddressInfo(Address address) {
        // Use address get methods to print out address details
        io.print(address.getFirstname() + " " + address.getSurname());
        io.print(address.getAddress());
        io.print("");
    }

    private void outputReturnToMenu() {
        io.readString("Press any key to return to Main Menu.");
    }
}

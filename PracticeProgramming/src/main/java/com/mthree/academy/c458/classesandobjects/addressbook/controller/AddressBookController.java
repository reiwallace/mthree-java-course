package com.mthree.academy.c458.classesandobjects.addressbook.controller;

import com.mthree.academy.c458.classesandobjects.addressbook.dao.AddressBookDao;
import com.mthree.academy.c458.classesandobjects.addressbook.dto.Address;
import com.mthree.academy.c458.classesandobjects.addressbook.ui.AddressBookView;
import com.mthree.academy.c458.classesandobjects.addressbook.enums.MenuOption;
import java.util.Collection;

public class AddressBookController {
    private AddressBookView view;
    private AddressBookDao dao;
    private boolean running = false;

    public AddressBookController() {}
    /**
     * Dependency Injection
     * @param dao - Data Access Object implementing the AddressBookDao interface
     * @param view - Interface object
     */
    public AddressBookController(AddressBookDao dao, AddressBookView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        // Set program to running and start main loop
        running = true;
        while(running) {
            // Display main menu and get user choice
            view.viewMainMenu();
            MenuOption option = view.getMainMenuChoice();

            // Handle choice
            switch(option) {
                case ADD_ADDRESS:
                    addAddress();
                    break;

                case REMOVE_ADDRESS:
                    removeAddress();
                    break;

                case GET_ADDRESS_BY_SURNAME:
                    findAddress();
                    break;

                case GET_ADDRESS_COUNT:
                    getAddressCount();
                    break;

                case GET_ALL_ADDRESS:
                    getAllAddresses();
                    break;

                case EXIT:
                    running = false;
                    break;
            }
        }

        view.sayGoodbye();
    }

    private void addAddress() {
        // Get new address and it through the dao
        Address newAddress = view.getNewAddress();
        view.addAddressSuccess();
    }

    private void removeAddress() {
        // Get address surname from user then use that to grab from dao
        String toRemoveSurname = view.getAddressToRemove();
        Address toRemove = dao.getAddressBySurname(toRemoveSurname);

        // Break if user doesn't want to remove address
        if(!view.printAddressAndConfirm(toRemove)) return;

        // Remove address from dao and check if removed value existed
        boolean removeSuccess = dao.removeAddress(toRemoveSurname) != null;

        // View appropriate response
        if(removeSuccess) {
            view.removeAddressSuccess();
        } else {
            view.removeAddressFail();
        }
    }

    private void findAddress() {
        // Get address surname from user then use that to grab from dao
        String toFindSurname = view.findAddress();
        Address foundAddress = dao.getAddressBySurname(toFindSurname);

        // Check if address is null
        boolean searchSuccess = foundAddress != null;

        // View appropriate response
        if(searchSuccess) {
            view.findAddressSuccess(foundAddress);
        } else {
            view.findAddressFail();
        }
    }

    private void getAddressCount() {
        // Grab address count from dao and pass to view
        view.viewAddressCount(dao.getAddressCount());
    }

    private void getAllAddresses() {
        view.listAddresses(dao.getAllAddresses());
    }
}

package com.mthree.academy.c458.classesandobjects.addressbook.dao;

import com.mthree.academy.c458.classesandobjects.addressbook.dto.Address;
import java.util.Collection;

public interface AddressBookDao {
    /**
     * Adds an address to the address book.
     * @param surname - Surname of address resident
     * @param address - Address object
     * @return The new address object
     */
    Address addAddress(String surname, Address address);

    /**
     * Removes an address from the address book
     * @param surname - Surname of address resident
     * @return The address previously associated with the surname, null if none found
     */
    Address removeAddress(String surname);

    /**
     * Retrieves an address by the resident's surname
     * @param surname - Resident surname
     * @return Address object
     */
    Address getAddressBySurname(String surname);

    /**
     * Counts the total number of addresses in the address book
     * @return Integer total of addresses
     */
    int getAddressCount();

    /**
     * Returns all address objects in the address book
     * @return Collection containing all address objects stored in the address book
     */
    Collection<Address> getAllAddresses();
}

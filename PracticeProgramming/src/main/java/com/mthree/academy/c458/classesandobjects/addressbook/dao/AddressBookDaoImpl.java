package com.mthree.academy.c458.classesandobjects.addressbook.dao;

import com.mthree.academy.c458.classesandobjects.addressbook.dto.Address;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookDaoImpl implements AddressBookDao {
    private final Map<String, Address> addressMap = new HashMap<>();

    @Override
    public Address addAddress(String surname, Address address) {
        return addressMap.put(surname, address);
    }

    @Override
    public Address removeAddress(String surname) {
        return addressMap.remove(surname);
    }

    @Override
    public Address getAddressBySurname(String surname) {
        return addressMap.get(surname);
    }

    @Override
    public int getAddressCount() {
        return addressMap.size();
    }

    @Override
    public Collection<Address> getAllAddresses() {
        return addressMap.values();
    }
}

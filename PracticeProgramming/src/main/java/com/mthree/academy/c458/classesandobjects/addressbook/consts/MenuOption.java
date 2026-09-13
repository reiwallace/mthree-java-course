package com.mthree.academy.c458.classesandobjects.addressbook.consts;

public enum MenuOption {
    ADD_ADDRESS,
    REMOVE_ADDRESS,
    GET_ADDRESS_BY_SURNAME,
    GET_ADDRESS_COUNT,
    GET_ALL_ADDRESS,
    EDIT_ADDRESS,
    EXIT;

    public static MenuOption getFromInt(int x) {
        switch(x) {
            case 1:
                return ADD_ADDRESS;
            case 2:
                return REMOVE_ADDRESS;
            case 3:
                return GET_ADDRESS_BY_SURNAME;
            case 4:
                return EDIT_ADDRESS;
            case 5:
                return GET_ADDRESS_COUNT;
            case 6:
                return GET_ALL_ADDRESS;
            case 7:
                return EXIT;
            default:
                return null;
        }
    }
}

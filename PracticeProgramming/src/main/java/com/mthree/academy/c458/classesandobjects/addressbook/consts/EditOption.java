package com.mthree.academy.c458.classesandobjects.addressbook.consts;

public enum EditOption {
    EDIT_FIRSTNAME,
    EDIT_SURNAME,
    EDIT_ADDRESS,
    EXIT;

    public static EditOption getFromInt(int x) {
        switch(x) {
            case 1:
                return EDIT_FIRSTNAME;
            case 2:
                return EDIT_SURNAME;
            case 3:
                return EDIT_ADDRESS;
            case 4:
                return EXIT;
            default:
                return null;
        }
    }
}

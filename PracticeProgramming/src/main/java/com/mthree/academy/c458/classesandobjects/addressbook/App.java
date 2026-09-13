package com.mthree.academy.c458.classesandobjects.addressbook;

import com.mthree.academy.c458.classesandobjects.addressbook.controller.AddressBookController;
import com.mthree.academy.c458.classesandobjects.addressbook.dao.AddressBookDao;
import com.mthree.academy.c458.classesandobjects.addressbook.dao.AddressBookDaoImpl;
import com.mthree.academy.c458.classesandobjects.addressbook.ui.AddressBookView;
import com.mthree.academy.c458.classesandobjects.addressbook.ui.UserIO;
import com.mthree.academy.c458.classesandobjects.addressbook.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        AddressBookDao dao = new AddressBookDaoImpl();
        UserIO io = new UserIOConsoleImpl();
        AddressBookView view = new AddressBookView(io);
        AddressBookController controller = new AddressBookController(dao, view);
        controller.run();
    }
}

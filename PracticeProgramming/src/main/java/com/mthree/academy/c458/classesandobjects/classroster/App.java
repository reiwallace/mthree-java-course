package com.mthree.academy.c458.classesandobjects.classroster;

import com.mthree.academy.c458.classesandobjects.classroster.controller.ClassRosterController;
import com.mthree.academy.c458.classesandobjects.classroster.dao.ClassRosterDao;
import com.mthree.academy.c458.classesandobjects.classroster.dao.ClassRosterDaoFileImpl;
import com.mthree.academy.c458.classesandobjects.classroster.ui.ClassRosterView;
import com.mthree.academy.c458.classesandobjects.classroster.ui.UserIO;
import com.mthree.academy.c458.classesandobjects.classroster.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();
    }
}

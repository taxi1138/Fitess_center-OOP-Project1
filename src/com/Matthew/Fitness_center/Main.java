package com.Matthew.Fitness_center;

import com.Matthew.Fitness_center.menu.Busy;
import com.Matthew.Fitness_center.menu.Fitness_Center_Menu;
import com.Matthew.Fitness_center.menu.Menu;
import com.Matthew.Fitness_center.menu.TrainerMenu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Fitness_Center_Menu();
        menu.add_data();
        menu.runInterface();
        Busy trMenu = new TrainerMenu();
        trMenu.exercise(1);
        trMenu.work(1);

    }
}
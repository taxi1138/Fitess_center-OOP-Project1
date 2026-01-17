package com.Matthew.Fitness_center;
import menu.Busy;
import menu.Fitness_Center_Menu;
import menu.Menu;
import menu.TrainerMenu;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

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
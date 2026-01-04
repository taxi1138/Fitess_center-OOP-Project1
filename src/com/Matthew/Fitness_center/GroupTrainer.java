package com.Matthew.Fitness_center;

import java.util.Scanner;

import static com.Matthew.Fitness_center.Main.Trainers;

public class GroupTrainer extends Trainer {
    private int current_groups;
    private int average_rating;

    public GroupTrainer(String name, int age, String email, String specialization, int years_of_experience, int years_in_ourGym, int current_groups, int average_rating, int salary){
        super(name, age, email, specialization, years_in_ourGym, years_of_experience, salary);
        this.current_groups = current_groups;
        this.average_rating = average_rating;
    }

    public int getCurrent_groups(){
        return current_groups;
    }
    public int getAverage_rating(){
        return average_rating;
    }

    public void setCurrent_clients(int current_groups){
        if(current_groups>=0){
            this.current_groups = current_groups;
        }
        else{
            System.out.println("Invalid input for the number of current groups. It is set to 0 by default");
            this.current_groups = 0;
        }
    }
    public void setAverage_rating(int average_rating){
        if (average_rating >= 0 && average_rating<= 10){
            this.average_rating = average_rating;
        }
        else{
            System.out.println("Invalid input for average rating of a group trainer. It was set to 0 by default");
            this.average_rating = 0;
        }
    }
    @Override
    public void checkExperience() {
        if (getYears_of_experience() > 4 && average_rating > 6) {
            System.out.println(getName() + " is a skilled group trainer.");
        } else {
            System.out.println(getName() + " is improving as a group trainer.");
        }
    }

    @Override
    public void checkSalary() {
        if (getSalary() > 155000 && current_groups > 3) {
            System.out.println(getName() + " earns well leading multiple groups.");
        } else {
            System.out.println(getName() + " has standard group trainer salary.");
        }
    }

}


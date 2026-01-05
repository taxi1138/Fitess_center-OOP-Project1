package com.Matthew.Fitness_center;

import java.util.Locale;
import java.util.Scanner;



public class PersonalTrainer extends Trainer {
    private int current_clients;
    private int max_amount_of_clients;
    private int rating;


    public PersonalTrainer(String name, int age, String email, String specialization, int salary, int years_of_experience, int years_in_ourGym, int current_clients, int max_amount_of_clients, int rating){
        super(name, age, email, specialization, years_in_ourGym, years_of_experience, salary);
        setCurrent_clients(current_clients);
        setMax_amount_of_clients(max_amount_of_clients);
        setRating(rating);
    }

    public int getCurrent_clients(){
        return current_clients;
    }
    public int getMax_amount_of_clients(){
        return max_amount_of_clients;
    }
    public int getRating(){
        return rating;
    }

    public void setCurrent_clients(int current_clients){
        if (current_clients>=0){
            this.current_clients = current_clients;
        }
        else{
            this.current_clients = 0;
            System.out.println("Invalid input for the number of current clients. It is set to 0 by default");
        }
    }
    public void setMax_amount_of_clients(int max_amount_of_clients){
        if (max_amount_of_clients >= 0){
            this.max_amount_of_clients = max_amount_of_clients;
        }
        else{
            this.max_amount_of_clients = 0;
            System.out.println("Invalid input for maximum number of clients. It is set to 0 by default");
        }
    }
    public void setRating(int rating){
        if (rating >=0 && rating <= 10){
            this.rating = rating;
        }
        else{
            this.rating = 0;
            System.out.println("Invalid input for rating(should be 0-10). It is set to 0 by default");
        }
    }
    @Override
    public void checkExperience() {
        if (getYears_of_experience() > 3 && rating > 7) {
            System.out.println(getName() + " is a highly-rated personal trainer.");
        } else {
            System.out.println(getName() + " is developing as a personal trainer.");
        }
    }

    @Override
    public void checkSalary() {
        if (getSalary() > 160000 && current_clients > 8) {
            System.out.println(getName() + " earns premium as a busy personal trainer.");
        } else {
            System.out.println(getName() + " has standard personal trainer earnings.");
        }
    }
}





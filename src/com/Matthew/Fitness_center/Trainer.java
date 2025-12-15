package com.Matthew.Fitness_center;
import java.util.Locale;
import java.util.Scanner;

public class Trainer {
    private int trainer_id;
    private String name;
    private int age;
    private String email;
    private String specialization;
    private int years_of_experience;
    private int years_in_ourGym;
    private static int trainer_id_count = 1;
    private double salary;

    public Trainer(String name, int age, String email, String specialization, int years_in_ourGym, int years_of_experience, int salary){
        this.trainer_id = trainer_id_count;
        this.name = name;
        this.age = age;
        this.email = email;
        this.specialization = specialization;
        this.salary = salary;
        this.years_in_ourGym = years_in_ourGym;
        this.years_of_experience = years_of_experience;
        trainer_id_count++;
    }

    public int getYears_in_ourGym(){
        return years_in_ourGym;
    }

    public void setYears_in_ourGym(int years_in_ourGym){
        this.years_in_ourGym = years_in_ourGym;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getYears_of_experience(){
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience){
        this.years_of_experience = years_of_experience;
    }

    public int getTrainer_id(){
        return trainer_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public void salaryRaise(Trainer trainer){
        System.out.println("Your current salary: "+ trainer.getSalary()+" are you sure you want to apply for a raise?");
        Scanner sc = new Scanner(System.in);
        String decision = sc.next().toLowerCase();
        if (decision.equals("yes")){
            if ((trainer.getYears_in_ourGym() >= 2)&&(trainer.getYears_of_experience() >= 3)){
                trainer.setSalary(trainer.getSalary() * 1.5);
                System.out.println("Your salary is now: "+trainer.getSalary());
            }
            else {
                System.out.println("We are sorry, but your qualification is not good enough for a raise yet");
            }
        }
        else {
            System.out.println("Your salary was not raised");
        }

    }
}

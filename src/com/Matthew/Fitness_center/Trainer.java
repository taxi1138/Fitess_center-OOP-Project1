package com.Matthew.Fitness_center;
import java.util.Scanner;



public class Trainer {
    private int trainer_id;
    protected String name;
    protected int age;
    private String email;
    protected String specialization;
    protected int years_of_experience;
    protected int years_in_ourGym;
    private static int trainer_id_count = 1;
    private double salary;

    public Trainer(String name, int age, String email, String specialization, int years_in_ourGym, int years_of_experience, int salary){
        this.trainer_id = trainer_id_count;
        setName(name);
        setAge(age);
        setEmail(email);
        setSpecialization(specialization);
        setSalary(salary);
        setYears_in_ourGym(years_in_ourGym);
        setYears_of_experience(years_of_experience);
        trainer_id_count++;
    }


    public int getYears_in_ourGym(){
        return years_in_ourGym;
    }

    public void setYears_in_ourGym(int years_in_ourGym){
        if (years_in_ourGym >= 0) {
            this.years_in_ourGym = years_in_ourGym;
        }
        else{
            System.out.println("Invalid input for (years_in_our_gym). It is set to 0 by default");
            this.years_in_ourGym = 0;
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary >= 0){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid input for salary. It is set to 150000 by default");
            this.salary = 150000;
        }
    }

    public int getYears_of_experience(){
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience){
        if(years_of_experience >= 0){
            this.years_of_experience = years_of_experience;
        }
        else{
            System.out.println("invalid input for years_of_experience. It is set to 0 by default");
            this.years_of_experience = 0;
        }
    }

    public int getTrainer_id(){
        return trainer_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        else{
            this.name = "Unknown";
            System.out.println("Invalid input for Name. It was set to Unknown");
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
        else{
            this.age = 18;
            System.out.println("Invalid input for age. It was set to 18 by default");
        }

    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        if (email.contains("@")){
            this.email = email;
        }
        else{
            this.email = "Unknown";
            System.out.println("Invalid input for email. It was set to Unknown");
        }
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        if (specialization != null && !specialization.trim().isEmpty()){
            this.specialization = specialization;
        }
        else{
            this.specialization = "Unknown";
            System.out.println("Invalid input for specialization. It was set to Unknown by default");
        }
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
    public void checkExperience() {
        if (years_of_experience > 5) {
            System.out.println(name + " is an experienced trainer.");
        } else {
            System.out.println(name + " is still building experience.");
        }
    }

    public void checkSalary() {
        if (salary > 150000) {
            System.out.println(name + " has a high salary.");
        } else {
            System.out.println(name + " has a standard salary.");
        }
    }

}

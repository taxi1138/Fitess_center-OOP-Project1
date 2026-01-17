package com.Matthew.Fitness_center;
import java.util.Scanner;



public abstract class Trainer {
    private int trainer_id;
    protected String name;
    protected int age;
    private String email;
    protected String specialization;
    protected int years_of_experience;
    protected int years_in_ourGym;
    private static int trainer_id_count = 1;
    private double salary;

    public Trainer(String name, int age, String email, String specialization, int years_in_ourGym, int years_of_experience, double salary){
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
        if (years_in_ourGym < 0){
            throw new IllegalArgumentException("cannot be less than 0!");
        }
        else {
            this.years_in_ourGym = years_in_ourGym;
        }

    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary <= 0){
            throw new IllegalArgumentException("cannot be less than 0 or equal to 0!");
        }
        else{
            this.salary = salary;
        }
    }

    public int getYears_of_experience(){
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience){
        if (years_of_experience < 0){
            throw new IllegalArgumentException("cannot be less than 0!");
        }
        else{
            this.years_of_experience = years_of_experience;
        }
    }

    public int getTrainer_id(){
        return trainer_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be left empty!");
        }
        else{
            this.name = name;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("cannot be less than 0!");
        }
        else{
            this.age = age;
        }

    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        if (!email.contains("@")){
            throw new IllegalArgumentException("Must contain the @ symbol!");
        }
        else if( email == null || email.trim().isEmpty()){
            throw new IllegalArgumentException("Cannot be left empty!");
        }
        else{
            this.email = email;
        }
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        if (specialization == null || specialization.trim().isEmpty()){
            throw new IllegalArgumentException("Cannot be left empty!");
        }
        else{
            this.specialization = specialization;
        }
    }

    public void salaryRaise(Trainer trainer) {
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

    public abstract void checkExperience();
    public abstract void checkSalary();

}

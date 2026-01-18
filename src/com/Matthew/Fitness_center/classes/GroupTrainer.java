package com.Matthew.Fitness_center.classes;


public class GroupTrainer extends Trainer {
    private int current_groups;
    private int average_rating;

    public GroupTrainer(String name, int age, String email, String specialization, int years_of_experience, int years_in_ourGym, int current_groups, int average_rating, int salary){
        super(name, age, email, specialization, years_in_ourGym, years_of_experience, salary);
        setCurrent_groups(current_groups);
        setAverage_rating(average_rating);
    }

    public int getCurrent_groups(){
        return current_groups;
    }
    public int getAverage_rating(){
        return average_rating;
    }

    public void setCurrent_groups(int current_groups){
        if(current_groups<0){
            throw new IllegalArgumentException("cannot be less than 0!");
        }
        else{
            this.current_groups = current_groups;
        }
    }
    public void setAverage_rating(int average_rating){
        if (average_rating < 0 || average_rating> 10){
            throw new IllegalArgumentException("cannot be less than 0 or greater than 10!");
        }
        else{
            this.average_rating = average_rating;
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


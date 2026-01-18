package com.Matthew.Fitness_center.classes;

public class Member {
    private int id;
    private String name;
    private int age;
    private String email;
    private static int id_count = 1;

    public Member(String name, int age, String email){
        this.id = id_count;
        setName(name);
        setAge(age);
        setEmail(email);
        id_count++;
    }
    public int getId (){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("cannot be left empty");
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
}





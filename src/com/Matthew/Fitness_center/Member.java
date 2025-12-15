package com.Matthew.Fitness_center;

public class Member {
    private int id;
    private String name;
    private int age;
    private String email;
    private static int id_count = 1;

    public Member(String name, int age, String email){
        this.id = id_count;
        this.name = name;
        this.age = age;
        this.email = email;
        id_count++;
    }
    public int getId (){
        return id;
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
};





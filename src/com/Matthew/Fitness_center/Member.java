package com.Matthew.Fitness_center;

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
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("The input for name is not valid, name is set to empty string");
            this.name = "InvaildName";
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
        else{
            System.out.println("age cannot be negative. Age is set to 0");
            this.age = 0;
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
            System.out.println("Invalid email. Must contain @ symbol. Email is set to InvalidEmail");
            this.email = "InvalidEmail";
        }
    }
}





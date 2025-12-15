package com.Matthew.Fitness_center;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Member memb1 = new Member("Nikita Pehil",43, "PehilNikita@mail.ru");
        System.out.println(memb1.getId()+";"+memb1.getName()+";"+memb1.getAge()+";"+memb1.getEmail());
        memb1.setName("Vladimir");
        memb1.setAge(12);
        memb1.setEmail("VladimirButrivomb@mail.com");
        System.out.println(memb1.getId()+";"+memb1.getName()+";"+memb1.getAge()+";"+memb1.getEmail());

        Membership membership1 = new Membership("ordinary",31, LocalDate.of(2025,12,1), LocalDate.of(2025,12,31), "active");
        System.out.println(membership1.getMembership_type()+";"+membership1.getMembership_duration_days()+';'+membership1.getSubscription_date()+';'+membership1.getExpiration_date()+';'+membership1.getStatus());
        membership1.setMembership_type("premium"); membership1.setMembership_duration_days(30);
        membership1.setExpiration_date(LocalDate.of(2025,11,12));
        membership1.setSubscription_date(LocalDate.of(2025,12,12));
        membership1.setStatus("expired");
        System.out.println(membership1.getMembership_type()+";"+membership1.getMembership_duration_days()+';'+membership1.getSubscription_date()+';'+membership1.getExpiration_date()+';'+membership1.getStatus());
        membership1.ChangeDate(membership1);

        Trainer trainer1 = new Trainer("Timur Musivor", 34, "Musivor@mail.com","Pilates", 4, 6, 250000);
        System.out.println(trainer1.getTrainer_id()+';'+trainer1.getName()+';'+trainer1.getAge()+';'+trainer1.getEmail()+';'+trainer1.getYears_in_ourGym()+';'+trainer1.getYears_of_experience()+';'+trainer1.getSalary()+';'+trainer1.getSpecialization());
        trainer1.setName("gog");
        trainer1.setAge(29);
        trainer1.setEmail("lanker@mail.ru");
        trainer1.setYears_in_ourGym(5);
        trainer1.setYears_of_experience(6);
        trainer1.setSpecialization("Crossfit");
        trainer1.setSalary(300000);
        trainer1.salaryRaise(trainer1);
        System.out.println(trainer1.getTrainer_id()+';'+trainer1.getName()+';'+trainer1.getAge()+';'+trainer1.getEmail()+';'+trainer1.getYears_in_ourGym()+';'+trainer1.getYears_of_experience()+';'+trainer1.getSalary()+';'+trainer1.getSpecialization());
    }
}

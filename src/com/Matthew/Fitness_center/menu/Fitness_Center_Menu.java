package com.Matthew.Fitness_center.menu;
import com.Matthew.Fitness_center.classes.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Fitness_Center_Menu implements Menu {
    private static ArrayList<Member> Members = new ArrayList<>();
    private static ArrayList<Membership> Memberships = new ArrayList<>();
    static ArrayList<Trainer> Trainers = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

    }

    public void add_data(){
        Members.add(new Member("Matthew", 18, "vconopla@mail.ru"));
        Members.add(new Member("Arduk", 76, "ardukov@mail.ru"));
        Members.add(new Member("Akzhok", 23, "mamumam@mail.ru"));

        Memberships.add(new Membership("ordinary", 30, LocalDate.of(2025, 11 , 12), LocalDate.of(2025, 12, 12), "Active"));
        Memberships.add(new Membership("Premium", 60, LocalDate.now().minusDays(90), LocalDate.now().minusDays(60), "expired"));

        Trainers.add(new PersonalTrainer("John Smith", 28, "john@gym.com", "Weight Training", 150000, 5, 2, 8, 12, 9));
        Trainers.add(new PersonalTrainer("Emily Johnson", 32, "emily@gym.com", "Yoga & Pilates", 145000, 8, 1, 5, 10, 6));
        Trainers.add(new GroupTrainer("frodo", 18, "theRingTempts@mail.ru", "Fitness", 2, 2, 3, 8, 165000));

        PersonalTrainer pt = new PersonalTrainer("John", 28, "john@gym.com", "Weights",
                150000, 5, 2, 8, 12, 9);
        GroupTrainer gt = new GroupTrainer("Sarah", 35, "sarah@gym.com", "Yoga",
                7, 3, 4, 8, 155000);
    }

    public void displayMenu(){
        System.out.println("\n========================================");
        System.out.println(" FITNESS CENTER MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Member");
        System.out.println("2. View All Members");
        System.out.println("3. Add Membership Subscription");
        System.out.println("4. View All Membership Subscriptions");
        System.out.println("5. View All Trainers");
        System.out.println("6. Add Personal Trainer");
        System.out.println("7. Add Group Trainer");
        System.out.println("8. View Personal Trainers");
        System.out.println("9. Vied Group Trainers");
        System.out.println("0. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice: ");
    }

    public void runInterface(){
        boolean running = true;
        while (running){
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    addMember();
                    break;
                case 2:
                    viewMembers();
                    break;
                case 3:
                    addMembership();
                    break;
                case 4:
                    viewMemberships();
                    break;
                case 5:
                    viewTrainers();
                    break;
                case 6:
                    addPersonalTrainer();
                    break;
                case 7:
                    addGroupTrainer();
                    break;
                case 8:
                    viewPersonalTrainers();
                    break;
                case 9:
                    viewGroupTrainers();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            if (running){
                System.out.print("Press Enter to continue. . .");
                sc.nextLine();
            }
        }
        sc.close();
    }
    private static void viewPersonalTrainers(){
        int count = 0;
        System.out.println("ALL PERSONAL TRAINERS OF THE FITNESS CENTER");
        for (int i = 0; i < Trainers.size(); i++){
            Trainer t = Trainers.get(i);
            if (t instanceof PersonalTrainer pt){
                count ++;
                System.out.println("name: "+pt.getName()+"; age:"+pt.getAge()+"; email:"+pt.getEmail()+"; specialization:"+pt.getSpecialization()+"; salary: "+pt.getSalary()+"; years in our gym: "+pt.getYears_in_ourGym()+"; years of experience:"+pt.getYears_of_experience()+"; rating: "+pt.getRating()+"; number of current clients:"+ pt.getCurrent_clients()+"; max number of clients:"+pt.getMax_amount_of_clients());
            }
        }
        if (count == 0){
            System.out.println("No personal trainers were found");
        }
    }

    private static void viewGroupTrainers(){
        int count = 0;
        System.out.println("ALL GROUP TRAINERS OF THE FITNESS CENTER");
        for (int i = 0; i < Trainers.size(); i++){
            Trainer t = Trainers.get(i);
            if (t instanceof GroupTrainer gt){
                count ++;
                System.out.println("name: "+gt.getName()+"; age:"+gt.getAge()+"; email:"+gt.getEmail()+"; specialization:"+gt.getSpecialization()+"; salary: "+gt.getSalary()+"; years in our gym: "+gt.getYears_in_ourGym()+"; years of experience:"+gt.getYears_of_experience()+"; average rating: "+gt.getAverage_rating()+"; number of current groups:"+ gt.getCurrent_groups()+"; max number of clients:");
            }
        }
        if (count == 0){
            System.out.println("No group trainers were found");
        }
    }

    private static void addGroupTrainer(){
        try{
            System.out.print("Input name: ");
            String name = sc.nextLine();

            System.out.print("Input age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Input email");
            String email = sc.nextLine();

            System.out.print("Input specialization: ");
            String specialization = sc.nextLine();

            System.out.print("Input number of years of experience: ");
            int years_of_exp = sc.nextInt();
            sc.nextLine();

            System.out.print("Input number of years in our gym: ");
            int years_in = sc.nextInt();
            sc.nextLine();

            System.out.print("Input number of current groups: ");
            int group_num = sc.nextInt();
            sc.nextLine();

            System.out.print("Input maximum number of clients: ");
            int max_groups = sc.nextInt();
            sc.nextLine();

            System.out.print("Input salary: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("Input average rating: ");
            int avg_rating = sc.nextInt();
            sc.nextLine();

            Trainers.add(new GroupTrainer(name, age, email, specialization, years_of_exp, years_in, salary, group_num, max_groups));
        }
        catch (Exception e){
            System.out.println("❌ "+e.getMessage());
        }
    }


    private static void addPersonalTrainer(){
        try{
            System.out.print("Input Personal trainer's name: ");
            String name = sc.nextLine();

            System.out.print("Input Personal trainer's age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Input Personal trainer's email");
            String email = sc.nextLine();

            System.out.print("Input Personal trainer's specialization: ");
            String specialization = sc.nextLine();

            System.out.print("Input Personal Trainer's number of years of experience: ");
            int years_of_exp = sc.nextInt();
            sc.nextLine();

            System.out.print("Input Personal trainer's number of years in our gym: ");
            int years_in = sc.nextInt();
            sc.nextLine();

            System.out.print("Input Personal Trainer's number of current clients: ");
            int client_num = sc.nextInt();
            sc.nextLine();

            System.out.print("Input Personal trainer's maximum number of clients: ");
            int max_clients = sc.nextInt();
            sc.nextLine();

            System.out.print("Input Personal trainer's salary: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("Input rating: ");
            int rating = sc.nextInt();
            sc.nextLine();

            Trainers.add(new PersonalTrainer(name, age, email, specialization, salary, years_of_exp, years_in, client_num, max_clients, rating));
        }
        catch(Exception e){
            System.out.println("❌ "+ e.getMessage());
        }

    }

    private static void addMember(){
        try{
            System.out.print("Input Member name: ");
            String name = sc.nextLine();

            System.out.print("Input member age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Input member email: ");
            String email = sc.nextLine();

            Members.add(new Member(name, age, email));
            System.out.println("Member added successfully! ");
        }
        catch (Exception e){
            System.out.println("❌ "+e.getMessage());
        }
    }

    private static void viewMembers(){
        System.out.println("ALL MEMBERS OF THE FITNESS CENTER:");
        System.out.println();
        if (Members.isEmpty()){
            System.out.println("No members found");
            return;
        }
        else{
            System.out.println("Total number of members: "+ Members.size());
            for(int i = 0; i < Members.size(); i++){
                Member member = Members.get(i);
                System.out.println(member.getId()+ ";"+ member.getName() + ";"+ member.getAge()+";"+member.getEmail()+";");
            }
        }
    }

    private static void addMembership(){
        try{
            System.out.print("input membership type: ");
            String membership_type = sc.nextLine();

            System.out.print("input membership duration: ");
            int membership_duration = sc.nextInt();
            sc.nextLine();

            System.out.print("Input number of subscription day: ");
            int subs_day = sc.nextInt();
            sc.nextLine();
            System.out.print("Input number of subscription month: ");
            int subs_month = sc.nextInt();
            sc.nextLine();
            System.out.print("Input subscription year: ");
            int subs_year = sc.nextInt();
            sc.nextLine();

            Memberships.add(new Membership(membership_type, membership_duration, LocalDate.of(subs_year, subs_month, subs_day), LocalDate.of(subs_year, subs_month, subs_day).plusDays(membership_duration), "Active"));
        }
        catch(Exception e){
            System.out.println("❌ "+e.getMessage());
        }
    }

    private static void viewMemberships(){
        System.out.println("ALL MEMBERSHIPS OF THE FITNESS CENTER");
        if (Memberships.isEmpty()){
            System.out.println("no memberships were found");
            return;
        }
        else{
            System.out.println(Memberships.size() + " Memberships were found: ");
            for (int i = 0; i < Memberships.size(); i++){
                Membership ship = Memberships.get(i);
                System.out.println(ship.getMembership_type()+";"+ship.getMembership_duration_days()+";"+ship.getSubscription_date()+";"+ship.getExpiration_date()+";"+ship.getStatus());
            }
        }
    }


    private static void viewTrainers(){
        System.out.println("ALL TRAINERS OF THE FITNESS CENTER");
        if (Trainers.isEmpty()){
            System.out.println("no trainers were found;");
            return;
        }
        else{
            System.out.println(Trainers.size() + " Trainers were found:");
            for (int i = 0; i<Trainers.size(); i++){
                Trainer trainer = Trainers.get(i);
                if (trainer instanceof PersonalTrainer pt){
                    System.out.println("[Personal Trainer]"+pt.getTrainer_id()+";"+pt.getName()+";"+pt.getAge()+";"+pt.getEmail()+";"+pt.getSpecialization()+";"+pt.getYears_of_experience()+";"+pt.getYears_in_ourGym()+";"+pt.getSalary());
                }
                else if (trainer instanceof GroupTrainer gp){
                    System.out.println("[Group Trainer]"+gp.getTrainer_id()+";"+gp.getName()+";"+gp.getAge()+";"+gp.getEmail()+";"+gp.getSpecialization()+";"+gp.getYears_of_experience()+";"+gp.getYears_in_ourGym()+";"+gp.getSalary());
                }
                else{
                    System.out.println("[Trainer]"+trainer.getTrainer_id()+";"+trainer.getName()+";"+trainer.getAge()+";"+trainer.getEmail()+";"+trainer.getSpecialization()+";"+trainer.getYears_of_experience()+";"+trainer.getYears_in_ourGym()+";"+trainer.getSalary());
                }
            }
        }
    }
}

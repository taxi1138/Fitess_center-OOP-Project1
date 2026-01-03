package com.Matthew.Fitness_center;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    private static ArrayList<Member> Members = new ArrayList<>();
    private static ArrayList<Membership> Memberships = new ArrayList<>();
    private static ArrayList<Trainer> Trainers = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Members.add(new Member("Matthew", 18, "vconopla@mail.ru"));
        Members.add(new Member("Arduk", 76, "ardukov@mail.ru"));
        Members.add(new Member("Akzhok", 23, "mamumam@mail.ru"));

        Memberships.add(new Membership("ordinary", 30, LocalDate.of(2025, 11 , 12), LocalDate.of(2025, 12, 12), "Active"));
        Memberships.add(new Membership("Premium", 60, LocalDate.now().minusDays(90), LocalDate.now().minusDays(60), "expired"));

        Trainers.add(new Trainer("Mramuk", 23, "Mramuk@mail.ru", "Yoga", 3, 6, 250000));
        Trainers.add(new Trainer("Avgustin", 45, "MiliyAvgustin@mail.ru", "Pilates", 4, 12, 500000));
        runInterface();
    }

    public static void displayMenu(){
        System.out.println("\n========================================");
        System.out.println(" FITNESS CENTER MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Member");
        System.out.println("2. View All Members");
        System.out.println("3. Add Membership Subscription");
        System.out.println("4. View All Membership Subscriptions");
        System.out.println("5. Add Trainer");
        System.out.println("6. View All Trainers");
        System.out.println("0. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice: ");
    }

    public static void runInterface(){
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
                    addTrainer();
                    break;
                case 6:
                    viewTrainers();
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

    private static void addMember(){
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

    private static void addTrainer(){
        System.out.print("Input trainer name: ");
        String train_name = sc.nextLine();

        System.out.print("Input trainer age: ");
        int train_age = sc.nextInt();
        sc.nextLine();

        System.out.print("Input trainer email: ");
        String train_email = sc.nextLine();

        System.out.print("Input trainer specialization: ");
        String specialization = sc.nextLine();

        System.out.print("Input trainer's number of years of experince: ");
        int years_of_exp = sc.nextInt();
        sc.nextLine();

        System.out.print("Input trainer's salary: ");
        int salary = sc.nextInt();
        sc.nextLine();

        Trainers.add(new Trainer(train_name, train_age, train_email, specialization, years_of_exp, 0, salary));
        System.out.println("Trainer has been successfully added!");
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
                System.out.println(trainer.getTrainer_id()+";"+trainer.getName()+";"+trainer.getAge()+";"+trainer.getEmail()+";"+trainer.getSpecialization()+";"+trainer.getYears_of_experience()+";"+trainer.getYears_in_ourGym()+";"+trainer.getSalary());
            }
        }
    }
}
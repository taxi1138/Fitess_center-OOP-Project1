package com.Matthew.Fitness_center;
import java.time.LocalDate;
import java.util.Scanner;

public class Membership {
    private String membership_type;
    private int membership_base_duration_days;
    private LocalDate subscription_date;
    private LocalDate expiration_date;
    private String status;

    public Membership(String membership_type, int membership_duration_days, LocalDate subscription_date, LocalDate expiration_date, String status) {
        this.membership_type = membership_type;
        this.membership_base_duration_days = membership_duration_days;
        this.subscription_date = subscription_date;
        this.expiration_date = expiration_date;
        this.status = status;
    }

    public String getMembership_type() {
        return membership_type;
    }

    public void setMembership_type(String membership_type) {
        this.membership_type = membership_type;
    }

    public int getMembership_duration_days() {
        return membership_base_duration_days;
    }

    public void setMembership_duration_days(int membership_duration_days) {
        this.membership_base_duration_days = membership_duration_days;
    }

    public LocalDate getSubscription_date() {
        return subscription_date;
    }

    public void setSubscription_date(LocalDate subscription_date) {
        this.subscription_date = subscription_date;
    }

    public LocalDate getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(LocalDate expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void ChangeDate(Membership membership) {
        System.out.println("This is your membership expiration date: " + membership.getExpiration_date());
        System.out.println("Do you want to extend your membership?  yes/no");
        Scanner sc = new Scanner(System.in);
        String decision = sc.next().toLowerCase();;
        if (decision.equals("yes")){
            System.out.println("By how many days do you want to extend your membership?");
            int days = sc.nextInt();
            membership.setExpiration_date(membership.getExpiration_date().plusDays(days));
            System.out.println("You just extended your membership by " + days + " days. That's how your expiration date looks like now: "+membership.getExpiration_date());
        }
        else if (decision.equals("no")){
            System.out.println("your membership was not extended");
        }
        else {
            System.out.println("Your input is invalid");
        }
    }
}
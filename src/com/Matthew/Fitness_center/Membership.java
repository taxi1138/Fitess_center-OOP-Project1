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
        setMembership_type(membership_type);
        setMembership_duration_days(membership_duration_days);
        setSubscription_date(subscription_date);
        setExpiration_date(expiration_date);
        setStatus(status);
    }

    public String getMembership_type() {
        return membership_type;
    }

    public void setMembership_type(String membership_type) {
        if (membership_type != null && !membership_type.trim().isEmpty()){
            this.membership_type = membership_type;
        }
        else{
            System.out.println("Invalid membership type. It is set to InvalidMembershipType");
            this.membership_type = "InvalidMembershipType";
        }
    }

    public int getMembership_duration_days() {
        return membership_base_duration_days;
    }

    public void setMembership_duration_days(int membership_duration_days) {
        if (membership_duration_days > 0){
            this.membership_base_duration_days = membership_duration_days;
        }
        else{
            System.out.println("Invalid input for membership duration. It is set to 0");
                this.membership_base_duration_days = 0;
        }
    }

    public LocalDate getSubscription_date() {
        return subscription_date;
    }

    public void setSubscription_date(LocalDate subscription_date) {
        if (subscription_date.isBefore(LocalDate.now())){
            this.subscription_date = subscription_date;
        }
        else{
            this.subscription_date = LocalDate.now();
            System.out.println("The date is Invalid. It is set to present date by default");
        }
    }

    public LocalDate getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(LocalDate expiration_date) {
        if (expiration_date.isBefore(LocalDate.now())){
            this.expiration_date = expiration_date;
        }
        else{
            this.expiration_date = getSubscription_date().plusDays(30);
            System.out.println("Expiration date is invalid. It is set to current date + 30 days by default");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()){
            this.status = status;
        }
        else{
            this.status = "Unknown";
            System.out.println("Input for status is invalid. It is set to Unknown by default");
        }
    }

    public void ChangeDate(Membership membership) {
        System.out.println("This is your membership expiration date: " + membership.getExpiration_date());
        System.out.println("Do you want to extend your membership?  yes/no");
        Scanner sc = new Scanner(System.in);
        String decision = sc.next().toLowerCase();
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
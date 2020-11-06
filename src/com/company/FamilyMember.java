package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyMember implements MemberInterface{

    private static boolean fileCreated = false;

    private String name,Lastname,status;
    private int age;

    public FamilyMember(String name, String Lastname, int age, String status) {
        this.name = name;
        this.Lastname = Lastname;
        this.age = age;
        this.status = status;
        saveDetails();
    }


    private void saveDetails() {
        File budget = new File("family.txt");

        try {
            FileWriter writer = new FileWriter(budget,fileCreated);
            writer.write(name + ", " + Lastname + ", " + status + ", " + age + "\n");
            writer.close();
            fileCreated = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getMoneyFromBudget(FamilyBudget budget, int money) {
        if (budget.getMoney() >= money) {
            budget.setMoney(budget.getMoney() - money);
            return budget.getMoney();
        } else {
            return -1;
        }

    }

}

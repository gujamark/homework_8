package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*First f = new First();
        f.assignRandomInRange();
        System.out.println(Arrays.toString(f.m));*/

        FamilyBudget fb = new FamilyBudget();
        fb.setMoney(1000);

        FamilyMember fm1 = new FamilyMember("Guja","Markozashvili",20,"Normal");
        FamilyMember fm2 = new FamilyMember("Dato","Markozashvili",21,"Rich");
        FamilyMember fm3 = new FamilyMember("Gio","Markozashvili",22,"Poor");

        fm1.getMoneyFromBudget(fb,100);
        fm2.getMoneyFromBudget(fb,200);
        fm3.getMoneyFromBudget(fb,300);
        System.out.println(fb.getMoney());

    }
}

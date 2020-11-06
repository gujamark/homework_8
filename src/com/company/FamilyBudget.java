package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget implements BudgetInterface {
    private int money;

    @Override
    public void setMoney(int num) {
        this.money = num;
        saveMoney(this.money);
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public String getStatus() {
        if (money > 400000)
            return "Rich";
        else if ( money > 10000)
            return "Normal";
        else
            return "Poor";
    }

    private void saveMoney(int money) {
        File budget = new File("budget.txt");

        try {
            FileWriter writer = new FileWriter(budget);
            writer.write(Integer.toString(money));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

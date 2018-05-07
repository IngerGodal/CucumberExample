package ru.inger.cucumbertest;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

public class StepdefsMoney {

    @Дано("^на счете пользователья имеется (\\d+) рублей$")
    public void hasMoney(int allMoney) {
        try {
            System.out.println(allMoney);
        } catch (Exception e) {
            throw new PendingException();
        }
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void withdrawsMoney(int amount)  {
        try {
            System.out.println(amount);
        } catch (Exception e) {
            throw new PendingException();
        }
    }

    @Тогда("^на счете пользователя остатся (\\d+) рублей$")
    public void remainMoney(int money) {
        try {
            System.out.println(money);
        } catch (Exception e) {
            throw new PendingException();
        }
    }

    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void warningAppears(String arg1) {
        try {
            System.out.println(arg1);
        } catch (Exception e) {
            throw new PendingException();
        }
    }

    @Тогда("^на счете пользователя остается (\\d+) рублей$")
    public void remainMoney2(int money) {
        try {
            System.out.println(money);
        } catch (Exception e) {
            throw new PendingException();
        }
    }

    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void hasMoney2(int allMoney) {
        try {
            System.out.println(allMoney);
        } catch (Exception e) {
            throw new PendingException();
        }
    }

    @Когда("^пользователь снимает со счёта (\\d+) рублей$")
    public void withdrawsMoney2(int amount) {
        try {
            System.out.println(amount);
        } catch (Exception e) {
            throw new PendingException();
        }
    }
}

package ru.inger.cucumbertest;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

import java.util.List;
import java.util.Map;

public class StepdefsMenuItem {
    @Дано("^пункты меню$")
    public void пунктыМеню(DataTable arg) {
        try{
            List<Map<String, String>> table = arg.asMaps(String.class, String.class);
            System.out.println(table.get(0).get("Name"));
            System.out.println(table.get(1).get("Name"));
            System.out.println(table.get(2).get("Name"));
        } catch (Exception e) {
            throw new PendingException();
        }
    }


    @Когда("^пользователь выбирает достпуный пункт меню$")
    public void пользовательВыбираетДостпуныйПунктМеню() {
        try{
            System.out.println("Выбор пункта меню");
        } catch (Exception e) {
            throw new PendingException();
        }
    }

    @Тогда("^становится доступен раскрывающийся список$")
    public void становитсяДоступенРаскрывающийсяСписок() {
        try {
            System.out.println("Доступен раскрывающийся список");
        } catch (Exception e) {
            throw new PendingException();
        }
    }
}

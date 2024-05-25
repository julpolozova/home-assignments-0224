package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Реализация интерфейса Greeting.
 */
public class GreetingImpl implements Greeting {

    /**
     * Получение имени.
     *
     * @return имя
     */
    public String getFirstName() {
        return "Yuliya";
    }

    /**
     * Получение фамилии.
     *
     * @return фамилия
     */
    public String getLastName() {
        return "Polozova";
    }

    /**
     * Получение года рождения.
     *
     * @return год рождения
     */
    public int getBirthYear() {
        return 1990;
    }

    /**
     * Получение набора хобби.
     *
     * @return список хобби
     */
    public Collection<String> getHobbies() {
        return List.of("reading", "knitting");
    }

    /**
     * Получение имени репозитория.
     *
     * @return адрес репозитория
     */
    public String getRepoUrl() {
        return "https://github.com/julpolozova/home-assignments-0224.git";
    }

    /**
     * Получение телефона.
     *
     * @return номер телефона
     */
    public String getPhone() {
        return "89092241898";
    }

    /**
     * Получение набора ожиданий от курса.
     *
     * @return список ожиданий
     */
    public Collection<String> getCourseExpectations() {
        return List.of("изучить java до уровня junior", "применить знания на практике");
    }
}

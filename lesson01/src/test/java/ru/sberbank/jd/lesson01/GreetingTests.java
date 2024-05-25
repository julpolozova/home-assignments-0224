package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

public class GreetingTests {
    Greeting greeting = new GreetingImpl();

    @Test
    public void testFirstName() {
        Assert.assertEquals("Yuliya", greeting.getFirstName());
    }

    @Test
    public void testLastName(){
        Assert.assertEquals("Polozova", greeting.getLastName());
    }

    @Test
    public void testBirthYear(){
        Assert.assertEquals(1990, greeting.getBirthYear());
    }

    @Test
    public void testHobbies(){
        Assert.assertFalse(greeting.getHobbies().isEmpty());
    }

    @Test
    public void testRepoUrl(){
        Assert.assertEquals("https://github.com/julpolozova/home-assignments-0224.git",
                greeting.getRepoUrl());
    }

    @Test
    public void testPhone(){
        Assert.assertEquals("89092241898", greeting.getPhone());
    }

    @Test
    public void testCourseExpectations(){
        Assert.assertFalse(greeting.getCourseExpectations().isEmpty());
    }
}

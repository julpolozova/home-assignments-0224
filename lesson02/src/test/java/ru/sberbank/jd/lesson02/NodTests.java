package ru.sberbank.jd.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class NodTests {
    Nod nod = new NodImpl();
    @Test
    public void test1() {
        Assert.assertEquals(21, nod.calculate(1071, 462));
    }
    @Test
    public void test2() {
        Assert.assertEquals(6, nod.calculate(84, 90));
    }
    @Test
    public void test3() {
        Assert.assertEquals(1, nod.calculate(15, 28));
    }
    @Test
    public void test4() {
        Assert.assertEquals(0, nod.calculate(5, 0));
    }
}

package com.minime;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MinimeTest {
    @Test
    public void testHello() throws Exception {
        Minime minime = new Minime();
        Assert.assertThat(minime.getGreeting(), Is.is("hello world!"));
    }
}

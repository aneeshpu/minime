package com.minime;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinimeTest {
    @Test
    public void testHello() throws Exception {
        Minime minime = new Minime();
        assertThat(minime.getBeating(), is("Hello Mini me!"));
    }
}

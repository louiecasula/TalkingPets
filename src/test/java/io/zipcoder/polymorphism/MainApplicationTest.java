package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
    @Test
    public void testDogSpeak(){
        Dog doggo = new Dog();

        String expected = "Woof! Bark! Reeheehee!";

        Assert.assertEquals(expected, doggo.speak());
    }

    @Test
    public void testCatSpeak(){
        Cat kitty = new Cat();

        String expected = "Mow! Purrr... I hate Mondays!";

        Assert.assertEquals(expected, kitty.speak());
    }

    @Test
    public void testLizardSpeak(){
        Lizard lizzy = new Lizard();

        String expected = "*Lizard tongue sounds* Note to self: Don't drink tap water at Jerry Garcia's house.";

        Assert.assertEquals(expected, lizzy.speak());
    }
}

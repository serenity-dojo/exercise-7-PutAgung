package com.serenitydojo;

import com.serenitydojo.model.Animals;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodTypes;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {


    @Test
    public void shouldFeedCatsTuna() {
        FoodTypes food = Feeder.feeds(Animals.CAT, false, FoodTypes.TUNA);
        Assert.assertEquals( FoodTypes.TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        FoodTypes food = Feeder.feeds(Animals.HAMSTER, false, FoodTypes.CABBAGE);
        Assert.assertEquals(FoodTypes.CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        FoodTypes food = Feeder.feeds(Animals.DOG, false, FoodTypes.DOG_FOOD);
        Assert.assertEquals(FoodTypes.DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        FoodTypes food = Feeder.feeds(Animals.CAT, true, FoodTypes.SALMON);
        Assert.assertEquals(FoodTypes.SALMON, food);

    }
}

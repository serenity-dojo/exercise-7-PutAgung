package com.serenitydojo.checks;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class EnumsTest {
    @Test
    public void theFoodTypeEnumShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.model.FoodTypes")).isNotNull();
        assertThat(Class.forName("com.serenitydojo.model.FoodTypes").isEnum()).isNotNull();
    }

    @Test
    public void theFoodTypeEnumShouldHaveSomeValues() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.model.FoodTypes").getEnumConstants()).isNotEmpty();
    }

    @Test
    public void theFeedsMethodShouldReturnTheEnum() throws Exception {
        Method[] methods = Class.forName("com.serenitydojo.model.Feeder").getMethods();
        Method feedMethod = Arrays.stream(methods).filter(method -> method.getName().equals("feeds")).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No feeds() method found on the Feeder class"));
        assertThat(feedMethod.getReturnType().getName()).isEqualTo("com.serenitydojo.model.FoodType");
    }
}

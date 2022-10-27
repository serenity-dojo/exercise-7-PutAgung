package com.serenitydojo.model;

public class Feeder {
    public static FoodTypes feeds(Animals animal, boolean isPremium, FoodTypes foodTypes) {

//        if (animal.equals("Cats")) {
//            return (isPremium) ? "Salmon" : "Tuna";
//        } else if (animal.equals("Dog")) {
//            return "Dog Food";
//        }
//        return "Cabbage";

        switch (animal) {
            case CAT:
                return (isPremium) ? FoodTypes.SALMON : FoodTypes.TUNA;
            case DOG:
                return (isPremium) ? FoodTypes.DELUXE_DOG_FOOD : FoodTypes.DOG_FOOD;
            case HAMSTER:
                return (isPremium) ? FoodTypes.LETTUCE : FoodTypes.CABBAGE;
            default:
                return FoodTypes.UNKNOWN;
        }

    }

}

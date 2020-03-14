package com.molchanovsky.pizzarecipes;

public class PizzaRecipeItem {
    private int imageResource;
    private String title;
    private String description;
    private String recipe;


    public PizzaRecipeItem(int imageResource, String title, String description, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getDescription() {
        return description;
    }
}

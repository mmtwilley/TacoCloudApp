package com.example.tacocloud.models;

import lombok.Data;
@Data
public class Ingredient implements Persistable<String>{

    private final String id;
    private final String name;
    private final Type type;

    @Override
    public boolean isNew(){
        return true;
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}


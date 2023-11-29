package com.example.tacocloud.models;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
public class IngredientRef {


    private final String ingredient;

}
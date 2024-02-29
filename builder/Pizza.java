/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nom;
    private List<String> ingredients;

    public Pizza(String nom) {
        this.nom = nom;
        this.ingredients = new ArrayList<>();
    }

    public void ajouterIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return String.format("Pizza %s, ingredients: %s", nom, String.join(",", ingredients));
    }
}


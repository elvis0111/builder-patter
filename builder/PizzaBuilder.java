/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author HP
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public PizzaBuilder(String nom) {
        pizza = new Pizza(nom);
    }

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void ajouterIngredient();

    public abstract void ajouterBase();
}

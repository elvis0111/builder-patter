/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author HP
 */
public class ReineBuilder extends PizzaBuilder {
    public ReineBuilder() {
        super("Reine");
    }

    @Override
    public void ajouterIngredient() {
        pizza.ajouterIngredient("Jambon");
        pizza.ajouterIngredient("Champignon");
        pizza.ajouterIngredient("Emental");
    }

    @Override
    public void ajouterBase() {
        pizza.ajouterIngredient("Sauce Tomate");
    }
}

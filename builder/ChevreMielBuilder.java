/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author HP
 */
public class ChevreMielBuilder extends PizzaBuilder {
    public ChevreMielBuilder() {
        super("Chèvre Miel");
    }

    @Override
    public void ajouterIngredient() {
        pizza.ajouterIngredient("Fromage de chèvre");
        pizza.ajouterIngredient("Miel");
        pizza.ajouterIngredient("Olives");
    }

    @Override
    public void ajouterBase() {
        pizza.ajouterIngredient("Crème fraiche");
    }
}
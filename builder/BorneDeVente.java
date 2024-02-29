/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author HP
 */
public class BorneDeVente {

    public void PreparerPizza(PizzaBuilder builder) {
        builder.ajouterBase();
        builder.ajouterIngredient();
    }

    public static void main(String[] args) {
        BorneDeVente borne = new BorneDeVente();
        ReineBuilder reineBuilder = new ReineBuilder();
        borne.PreparerPizza(reineBuilder);
        System.out.println(reineBuilder.pizza);
    }
}

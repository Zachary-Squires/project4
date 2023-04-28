import javax.swing.*;

public class PokemonSelection{
    public Pokemon createPokemon(){
        Pokemon Pokemon = new Pokemon(JOptionPane.showInputDialog("Pokemon name:"), Integer.parseInt(JOptionPane.showInputDialog("Pokemon hitpoints:")), JOptionPane.showInputDialog("Pokemon move:"), Integer.parseInt(JOptionPane.showInputDialog("Pokemon move power:")), Integer.parseInt(JOptionPane.showInputDialog("Pokemon attack speed:")));
        return Pokemon;
    }

    public void assignPokemon(){
        PokemonSelection PS = new PokemonSelection();
        System.out.println("Player 1: Select a Pokemon and enter its stats.");
        Pokemon playerOnePokemon = PS.createPokemon();
        System.out.println("Player 1 Pokemon\n" + playerOnePokemon.displayPokemonStats());
        System.out.println("Player 2: Select a Pokemon and enter its stats.");
        Pokemon playerTwoPokemon = PS.createPokemon();
        System.out.println("Player 2 Pokemon\n" + playerTwoPokemon.displayPokemonStats());
    }
}

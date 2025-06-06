/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import javax.swing.JOptionPane;



/**
 *
 * @author selma
 */
public class TesteExercicio1JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     String input = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(input);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é zero.");
        }
    }
}
    


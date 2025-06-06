/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.meuprojeto.Teste;

import javax.swing.JOptionPane;

/**
 *
 * @author selma
 */
public class TesteExercicio4JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ímpar.");
        }
    }
}
    
    


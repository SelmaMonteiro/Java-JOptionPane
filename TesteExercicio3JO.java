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
public class TesteExercicio3JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior.");
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "O segundo número é maior.");
        } else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais.");
        }
    }
}
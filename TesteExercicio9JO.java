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
public class TesteExercicio9JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero >= 10 && numero <= 20) {
            JOptionPane.showMessageDialog(null, "O número está dentro do intervalo [10,20].");
        } else {
            JOptionPane.showMessageDialog(null, "O número está fora do intervalo [10,20].");
        }
    }
}
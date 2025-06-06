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
public class TesteExercicio8JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));

        double fahrenheit = celsius * 1.8 + 32;

        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
    }
}
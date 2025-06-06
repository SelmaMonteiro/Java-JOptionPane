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
public class TesteExercicio7JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (m):"));

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f", imc));
    }
}
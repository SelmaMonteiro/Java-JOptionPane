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
public class TesteExercicio10JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade:");

        if (idade >= 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
            JOptionPane.showMessageDialog(null, "Você pode votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você NÃO pode votar.");
        }
    }
}

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
public class TesteExercicio2JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog("Digite a nota do aluno:");
        double nota = Double.parseDouble(input);

        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (nota >= 5) {
            JOptionPane.showMessageDialog(null, "Em recuperação");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
  

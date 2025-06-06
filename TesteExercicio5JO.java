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
public class TesteExercicio5JO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        double media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "A media das notas é: " + media);
    }
}

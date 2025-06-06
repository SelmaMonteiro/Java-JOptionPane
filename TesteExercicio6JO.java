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
public class TesteExercicio6JO {

        public static void main(String[] args) {
       double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");

        double resultado = 0;
        boolean operacaoValida = true;

        if (operacao.equals("+")) {
            resultado = num1 + num2;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
        } else if (operacao.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                operacaoValida = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação inválida.");
            operacaoValida = false;
        }

        if (operacaoValida) {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}

// Programa cálculo da potência de dois números.
// Prof. Lucy Mari
// Aluno: Daniel Luz
// 15-11-22

import javax.swing.*;

public class Potencia {
  // O programa apresenta erro se a declaração da função principal for main(String entrada[]), como mostrado nos exemplos das aulas. 
  public static void main(String[] entrada) {
    // Variáveis
      int n1, n2, mod;
      double pot1;
      String msg = "";
    
    // Entrada de dados
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
    
    // Cálculo
      mod = n1 % n2;
      pot1 = Math.pow(n1, n2);

    // Mensagem
      msg = "O resto de divisão de " + n1 + " por " + n2 + " é igual a " + mod + "\n";
      msg = msg + "O resultado da potência de " + n1 + " por " + n2 + " é igual a " + pot1 + "\n";
      JOptionPane.showMessageDialog(null, msg);

      System.exit(0);
    }
}

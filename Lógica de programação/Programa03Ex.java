import javax.swing.*;

public class Programa03Ex {
  public static void main(String[] entrada) {

      int n1, n2, mod;
      double pot1, pot2;
      String msg = "";

      n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));

      mod = n1 % n2;
      pot1 = Math.pow(n1, n2);
      pot2 = Math.pow(n2, n1);
      

      msg = msg + "resto de divisão de " + n1 + " por " + n2 + " = " + mod + "\n";
      msg = msg + "a potência de " + n1 + "por" + n2 + " = " + pot1 + "\n";
      msg = msg + "a potência de " + n2 + "por" + n1 + " = " + pot2 + "\n";
      JOptionPane.showMessageDialog(null, msg);

      System.exit(0);
    }
}

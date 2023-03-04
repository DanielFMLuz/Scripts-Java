//Soma de números de uma ArrayList
//Daniel Luz
//04/03/2023

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PensarEResponder {
    public static void main(String[] args) {
        
        //Solicitando Quantidade
        String msgSolicitaQuantidade = "Quantos números quer somar?";
        int qtd = Integer.parseInt(JOptionPane.showInputDialog(msgSolicitaQuantidade));

        String msgRespostaQuantidade = String.format("Você quer somar %d números.\n", qtd);
        msgRespostaQuantidade = msgRespostaQuantidade + "Clique em Ok para continuar";
        JOptionPane.showMessageDialog(null, msgRespostaQuantidade);

        //Montando ArrayList
        ArrayList<Integer> numerosArraylist = new ArrayList<>();
        int soma = 0;
        
        for (int i = 0; i < qtd; i++){
            String msgSolicitaNumero = String.format("Digite o %d º número.", i+1);
            numerosArraylist.add(Integer.parseInt(JOptionPane.showInputDialog(msgSolicitaNumero)));
        }
  
        //Somando números
        for (int i = 0; i < numerosArraylist.size(); i++){
            soma += numerosArraylist.get(i);
        }

        //Resposta final (obs.: não consegui fazer com String.format)
        String msgRepostaFinal = "";
        msgRepostaFinal= msgRepostaFinal + "Os números somados foram: ";
        msgRepostaFinal= msgRepostaFinal + numerosArraylist;
        msgRepostaFinal= msgRepostaFinal + "\n A soma dos números é igual a ";
        msgRepostaFinal= msgRepostaFinal + soma + ".";
    
        JOptionPane.showMessageDialog(null, msgRepostaFinal);
        
        System.exit(0);
      }
}

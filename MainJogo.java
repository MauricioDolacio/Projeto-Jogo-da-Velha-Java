import javax.swing.JOptionPane;

public class MainJogo {
       public static void main(String[] args) {
           String nomeUm = cadastro("Jogador X");
           String nomeDois = cadastro("Jogador O");

            Jogo jg = new Jogo(nomeUm, nomeDois);
            jg.setVisible(true);
    }

    private static String cadastro(String mensagem){
           String nome = "";
           while(nome.isEmpty()) {
               nome = JOptionPane.showInputDialog(mensagem);
               if (nome.isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Usuario Invalido!");
               }
           }
           return nome;
    }
}
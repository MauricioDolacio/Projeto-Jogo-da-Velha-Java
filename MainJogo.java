import javax.swing.JOptionPane;

public class MainJogo {
       public static void main(String[] args) {
           String nomeUm = "";
           String nomeDois = "";
           while(nomeUm.equals("") || nomeDois.equals("")){
                nomeUm = JOptionPane.showInputDialog("Jogador X: ");
                if(nomeUm.equals("")){
                    JOptionPane.showMessageDialog(null, "Usuário Inválido!"); 
                }
                nomeDois = JOptionPane.showInputDialog("Jogador O: ");
                if(nomeDois.equals("")){
                    JOptionPane.showMessageDialog(null, "Usuário Inválido!");
                }
           }
           
            Jogo jg = new Jogo(nomeUm, nomeDois);
            jg.setVisible(true);
           
           
    }
}
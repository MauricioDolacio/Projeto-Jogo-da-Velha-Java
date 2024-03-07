public class Jogador{
    private String name;
    private int pontuacao = 0;
    
    public void setName(String nome){
        this.name = nome;
    }
    public String getName(){
        return name;
    }
    public void setPonto(){
        this.pontuacao+= 1;    
    }
    public int getPonto(){
        return pontuacao;
    }
    
}
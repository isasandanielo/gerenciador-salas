public class Sala {
    private String nome;
    private boolean disponivel;
    private int capacidade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public Sala(String nome, boolean disponivel, int capacidade){
        this.nome = nome;
        this.disponivel = disponivel;
        this.capacidade = capacidade;
    }
    public boolean reservar(int quantidadePessoas){
        if(disponivel == true && quantidadePessoas <= capacidade){
            disponivel = false;
            return true;
        }
        return false;
    }
    public void liberarSala(){
        disponivel = true;
    }
}

public class SalaReuniao extends Sala{
    private boolean possuiProjetor;

    public boolean getPossuiProjetor() {
        return possuiProjetor;      
    }

    public void setPossuiProjetor(boolean possuiProjetor) {
        this.possuiProjetor = possuiProjetor;
    }

    public SalaReuniao(String nome, boolean disponivel, int capacidade, boolean possuiProjetor){
        super(nome, disponivel, capacidade);
        this.possuiProjetor = possuiProjetor;
    }
    @Override
    public boolean reservar(int quantidadePessoas) {
        if(getDisponivel() == true && quantidadePessoas <= getCapacidade() && possuiProjetor == true){
            setDisponivel(false);
            return true;
        }
        return false;
    }
}
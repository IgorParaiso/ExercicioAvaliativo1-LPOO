public class VetPessoa {
    
    
    private Pessoa[] vetPessoa;
    private int quant;
    
    public VetPessoa (int tamanho){
        this.vetPessoa = new Pessoa[tamanho];
        this.quant = 0;
    }
    
    public int getQuant(){
        return quant;
    }
    
    public Pessoa getPos(int posicao){
        if (posicao >= 0 && posicao<quant){
            return this.vetPessoa[posicao];
        }
        return null;
    }
    
}

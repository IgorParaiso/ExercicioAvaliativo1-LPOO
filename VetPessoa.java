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
    
    public boolean insere (Pessoa usuario) {
    	
    	if (this.quant >= this.vetPessoa.length) {
    		return false;
    	}
    	this.vetPessoa[quant] = usuario;
    	this.quant++;
    
    }
    
    public int pesquisa(String nome) {
    	for(int i; i<this.quant; i++) {
    		if(vetPessoa[i].getNome().equals(nome)) {
    			return i
    		}
    	}
    	return -1;
    }
    
}

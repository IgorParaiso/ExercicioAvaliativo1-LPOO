public class ProgramaPrincipal {
    
package estatico;

import io.InOut;

public class AppPessoa {
	public static void main (String[] args) {
		Pesssoa[] vetPessoa = new Pessoa[5];
		
		InserirPessoa (vetPessoa);
		Remover (vetPessoa);
		Nome (vetPessoa);
		Dia/Mês (vetPessoa);
		Mês (vetPessoa);
	}

	private static void lerPessoa(Pessoa[] vetPessoa) {
		String nome;
		double nome, mes, mesDia, VetPessoa;
		for (int i=0; i<vetPessoa.length; i++) {
			nome = InOut.leString("Nome");
			mes = InOut.leDouble("Mes");
			mesDia = InOut.leDouble("Dia e Mês");
			vetPessoa[i] = new Pessoa(nome, mes, mesDia);
		}
	}

	
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}

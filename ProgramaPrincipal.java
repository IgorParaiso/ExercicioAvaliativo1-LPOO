public class ProgramaPrincipal {
    
package estatico;

import io.InOut;

public class AppPessoa {
	public static void main (String[] args) {
		Pesssoa[] vetPessoa = new vetPessoa();
		
        int aux;

        while(aux > 0){
            //[janela de leitura]
            aux = InOut.leInt("Inserir Opcao");

            switch(aux){
                case 1: // INSERIR
                    // ler os dados de nome OK, telefone, email e dataAniversario OK;
                    // atribuir esses dados à uma nova Pessoa -> new Pessoa( {nome = xxxx, telefone = xxxx, email = xxxx, data = xx/xx/xx)
                    String nome = InOut.leString("Nome");
                    int dia = InOut.leInt("Dia");
                    int mes = InOut.leInt("Mes");
                    int ano = InOut.leInt("Ano");
                    String email = InOut.leString("Email");
                    String telefone = InOut.String("Telefone");
                    Pessoa pessoa = new Pessoa(nome, data(dia,mes,ano), email, telefone); 
                    boolean operacaoOk = VetPessoa.insere(pessoa);
                    if(operacaoOk) System.out.println("Operação de inserção bem-sucedida!\n");
                    else System.out.println("Operação de inserção falhou!\n");
                    break;

                case 2: // REMOVER
                    // ler o nome
                    String nome = InOut.leString("Nome");
                    boolean operacaoOk = VetPessoa.remove(pessoa);
                    if(operacaoOk) System.out.println("Operação de remoção bem-sucedida!\n");
                    else System.out.println("Operação de remoção falhou!\n");
                    break;

                case 3: // Pesquisar por nome
                    String nome = InOut.leString("Nome");
                    int aux = VetPessoa.pesquisa(nome);
                    // mostrar na tela as informações
                    if(aux != -1) System.out.println("Nome: " + vetPessoa[aux].nome + "Telefone: " + vetPessoa[aux].telefone + "Email: " + vetPessoa[aux].email + "Data: " + vetPessoa[aux].getDataDeAniversario());
                    else System.out.println("NOME INEXISTENTE");
                    break;

                case 4: // Pesquiar DiaMes
                    int dia = InOut.leInt("Dia");
                    int mes = InOut.leInt("Mes");
                    VetPessoa aniversariantes = VetPessoa.pesquisaDiaMes(dia, mes);

                    if(aniversariantes != null){
                        for(int i=0;i<aniversariantes.length;i++){ // 
                            System.out.println(aniversariantes[i].nome);
                        }
                    }
                    else System.out.println("NENHUM ANIVERSARIANTE");
                    break;

                case 5: // Pesquisar Mes
                    int dia = InOut.leInt("Dia");
                    int mes = InOut.leInt("Mes");
                    VetPessoa aniversariantes = VetPessoa.pesquisaDiaMes(dia, mes);
                    if(aniversariantes != null){
                        for(int i=0;i<aniversariantes.length;i++){ // 
                            System.out.println(aniversariantes[i].nome);
                            System.out.println(aniversariantes[i].getDataDeAniversario()); // 
                        }
                    }
                    else System.out.println("NENHUM ANIVERSARIANTE");
                    break;
            }
        }
	}
}




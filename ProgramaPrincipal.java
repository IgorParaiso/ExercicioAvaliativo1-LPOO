public class ProgramaPrincipal {
    
package estatico;

import io.InOut;

public class AppPessoa {
	public static void main (String[] args) {
		Pesssoa[] vetPessoa = new vetPessoa();
		
        int aux;

        while(aux > 0){
            //[janela de leitura]
            aux = int.Parse(Console.ReadLine(aux));

            switch(aux){
                case 1: // INSERIR
                    // ler os dados de nome OK, telefone, email e dataAniversario OK;
                    // atribuir esses dados à uma nova Pessoa -> new Pessoa( {nome = xxxx, telefone = xxxx, email = xxxx, data = xx/xx/xx)
                    string nome = InOut.leString("Nome");
                    int dia = InOut.leInt("Dia");
                    int mes = InOut.leInt("Mes");
                    int ano = InOut.leInt("Ano");
                    string email = InOut.leString("Email");
                    string telefone = InOut.leDouble("Telefone");
                    Pessoa pessoa = new Pessoa(nome, data(dia,mes,ano), email, telefone); // verificar como ficou a classe de data);

                    bool operacaoOk = VetPessoa.insere(pessoa);
                    if(operacaoOk) Console.WriteLine("Operação de inserção bem-sucedida!\n");
                    else Console.WriteLine("Operação de inserção falhou!\n");
                    break;

                case 2: // REMOVER
                    // ler o nome
                    string nome = InOut.leString("Nome");
                    bool operacaoOk = VetPessoa.remove(pessoa);
                    if(operacaoOk) Console.WriteLine("Operação de remoção bem-sucedida!\n");
                    else Console.WriteLine("Operação de remoção falhou!\n");
                    break;

                case 3: // Pesquisar por nome
                    string nome = InOut.leString("Nome");
                    int aux = VetPessoa.pesquisa(nome);
                    // mostrar na tela as informações
                    if(aux != -1) Console.WriteLine("Nome: " + vetPessoa[aux].nome + "Telefone: " + vetPessoa[aux].telefone + "Email: " + vetPessoa[aux].email + "Data: " + vetPessoa[aux].getDataDeAniversario());
                    else Console.WriteLine("NOME INEXISTENTE");
                    break;

                case 4: // Pesquiar DiaMes
                    int dia = InOut.leInt("Dia");
                    int mes = InOut.leInt("Mes");
                    VetPessoa aniversariantes = VetPessoa.pesquisaDiaMes(dia, mes);

                    if(aniversariantes != null){
                        for(int i=0;i<aniversariantes.length;i++){ // se quiser pode fazer foreach
                            Console.WriteLine(aniversariantes[i].nome);
                        }
                    }
                    else Console.WriteLine("NENHUM ANIVERSARIANTE");
                    break;

                case 5: // Pesquisar Mes
                    int dia = InOut.leInt("Dia");
                    int mes = InOut.leInt("Mes");
                    VetPessoa aniversariantes = VetPessoa.pesquisaDiaMes(dia, mes);
                    if(aniversariantes != null){
                        for(int i=0;i<aniversariantes.length;i++){ // se quiser pode fazer foreach
                            Console.WriteLine(aniversariantes[i].nome);
                            Console.WriteLine(aniversariantes[i].getDataDeAniversario()); // cuidado com esse get, pois não sei como está a classe 'Pessoa'
                        }
                    }
                    else Console.WriteLine("NENHUM ANIVERSARIANTE");
                    break;
            }
        }
	}
}


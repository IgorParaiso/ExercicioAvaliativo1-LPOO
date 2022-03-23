import diagnostico.InOut;

public class ProgramaPrincipal {

    public static void main (String[] args) {
        VetPessoa bdUser = new VetPessoa(5);
        boolean running = true;
        

        while(running){
            //[janela de leitura]
            int aux = InOut.leInt("1 - Inserir"
                    + "\n2 - Remover"
                    + "\n3 - Pesquisar por nome"
                    + "\n4 - Pesquisar por Dia e Mes"
                    + "\n5 - Pesquisar por mes"
                    + "\n6 - Sair"
                    + "\nInserir Opcao:");

            switch(aux){
                case 1: // INSERIR
                    // ler os dados de nome OK, telefone, email e dataAniversario OK;
                    // atribuir esses dados à uma nova Pessoa -> new Pessoa( {nome = xxxx, telefone = xxxx, email = xxxx, data = xx/xx/xx)
                    String nome = InOut.leString("Nome");
                    int dia = InOut.leInt("Dia");
                    int mes = InOut.leInt("Mes");
                    int ano = InOut.leInt("Ano");
                    String email = InOut.leString("Email");
                    String telefone = InOut.leString("Telefone");
                    Pessoa pessoa = new Pessoa(nome, email, telefone, new Data(dia,mes,ano)); 
                    boolean operacaoOk = bdUser.insere(pessoa);
                    if(operacaoOk) InOut.msgSemIcone("Sucesso!", "Operacao bem-sucedida");
                    else InOut.msgSemIcone("Falhou!", "Operacao não foi bem-sucedida");
                    break;
                    
                case 2: // REMOVER
                    // ler o nome
                    nome = InOut.leString("Nome");
                    operacaoOk = bdUser.remove(nome);
                    if(operacaoOk) System.out.println("Operação de remoção bem-sucedida!\n");
                    else System.out.println("Operação de remoção falhou!\n");
                    break;

                case 3: // Pesquisar por nome
                    nome = InOut.leString("Nome");
                    aux = bdUser.pesquisa(nome);
                    // mostrar na tela as informações
                    if(aux != -1) {
                        System.out.println();
                        System.out.println("Nome: " + bdUser.getPessoa(aux).getNome() + "Telefone: " 
                            + bdUser.getPessoa(aux).getTelefone() + "Email: " + bdUser.getPessoa(aux).getEmail() 
                            + "Data: " + bdUser.getPessoa(aux).getDataDeAniversario());
                    }
                    else System.out.println("NOME INEXISTENTE");
                    break;

                case 4: // Pesquiar DiaMes
                    dia = InOut.leInt("Dia");
                    mes = InOut.leInt("Mes");
                    VetPessoa aniversariantes = bdUser.pesquisaDiaMes(dia, mes);

                    if(aniversariantes != null){
                        for(int i=0;i< aniversariantes.getQuant();i++){ // 
                            System.out.println(aniversariantes.getPessoa(i).getNome());
                        }
                    }
                    else System.out.println("NENHUM ANIVERSARIANTE");
                    break;

                case 5: // Pesquisar Mes
                    mes = InOut.leInt("Dia");
                    aniversariantes = bdUser.pesquisaMes(mes);
                    if(aniversariantes != null){
                        for(int i=0;i<aniversariantes.getQuant();i++){ // 
                            System.out.println(aniversariantes.getPessoa(i).getNome());
                            System.out.println(aniversariantes.getPessoa(i).getDataDeAniversario()); // 
                        }
                    }
                    else System.out.println("NENHUM ANIVERSARIANTE");
                    break;
                case 6:
                    running = false;
                    break;
            }
        }
	}
}

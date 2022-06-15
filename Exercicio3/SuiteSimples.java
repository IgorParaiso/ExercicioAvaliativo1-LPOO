public class SuiteSimples extends Quarto{

	public SuiteSimples(int andar, char identificador, int qntHosp, boolean reservado,
			Usuario usuario, boolean limpo, boolean checkin, String tipoCama,
			int valorBase, boolean cafeDaManha, String vista, int fatura) {
		super(andar, identificador, qntHosp, reservado, usuario, limpo, checkin,
				tipoCama, valorBase, cafeDaManha, vista, fatura);
	}

	public int faturamento(Quarto quarto){
		int valorTotal = limpar(quarto) + abastecerToalha(quarto) + trocarChuveiro(quarto);
		setFatura(valorTotal);
		return getFatura();
	}

	@Override
	public boolean checkin(Quarto quarto) {
		if (isLimpo() == true && isCheck_in() == false){
			setLimpo(false);
			setReservado(true);
			setCheck_in(true);
			System.out.println("Checkin realizado!\n");
			return true;
		}else{
			System.out.println("Não é possivel fazer Checkin!\n");
			return false;
		}
	}

	@Override
	public boolean checkout(Quarto quarto) {
		if (isReservado() == true && isCheck_in() == true){
			setReservado(false);
			setCheck_in(false);
			System.out.println("Checkout efetuado!\n");
			return true;
		}else{
			System.out.println("Não é possivel fazer Checkout de um quarto sem Checkin!\n");
			return false;
		}
	}

	@Override
	public boolean fazerReserva(Quarto quarto) {
		if (isReservado() == false && isCheck_in() == false){
			setReservado(true);
			System.out.println("Reserva realizada!\n");
			return true;
		}else{
			System.out.println("Reserva não realizada!\n");
			return false;
		}
	}

	@Override
	public int limpar(Quarto quarto) {
		if(isLimpo() == false) {
			setLimpo(true);
			System.out.println("O quarto foi limpo!\n");
		}
		if(isCheck_in() == true) {
			System.out.println("Valor de R$5,00 será cobrado no Checkout\n");
			return 5;
		}else {
			return 0;
		}
	}

	@Override
	public int abastecerToalha(Quarto quarto) {
		if(isCheck_in() == true) {
			System.out.println("Valor de R$20,00 será cobrado no Checkout\n");
			return 20;
		}else {
			return 0;
		}
	}

	@Override
	public int trocarChuveiro(Quarto quarto) {
		if(isCheck_in() == true) {
			System.out.println("Valor de R$50,00 será cobrado no Checkout\n");
			return 50;
		}else {
			return 0;
		}
	}

	@Override
	public String ConsultarDisponiveis(vetQuartos listaQuartos) {
		/*if (isLimpo() == true && isCheck_in() == false){
			setLimpo(false);
			setReservado(true);
			setCheck_in(true);
			System.out.println("O quarto " + quarto + " está limpo e disponível!");*/
			return null;
		}

	}

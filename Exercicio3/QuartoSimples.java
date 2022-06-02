public class QuartoSimples extends Quarto{

	public QuartoSimples(int andar, char identificador, int qntHosp, boolean reservado,
			Usuario usuario, boolean limpo, boolean checkin, String tipoCama,
			float valorBase, boolean cafeDaManha, String vista, float fatura) {
		super(andar, identificador, qntHosp, reservado, usuario, limpo, checkin,
				tipoCama, valorBase, cafeDaManha, vista, fatura);
	}

	@Override
	public boolean checkin(Quarto quarto) {
		if (isLimpo() == true && isReservado() == false && isCheck_in() == false){
			setCheck_in(true);
			setReservado(true);
			setLimpo(false);
			
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean checkout(Quarto quarto) {
		float valorFinal = getValorBase() + getFatura();
		
		return false;
	}

	@Override
	public String ConsultarDisponiveis(vetQuartos listaQuartos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fazerReserva(Quarto quartos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean limpar(Quarto quarto) {
		float valor = 5;
		return false;
	}

	@Override
	public boolean TrocarChuveiro(Quarto quarto) {
		float valor = 50;
		if(isCheck_in() == true){
			
		}
		return false;
	}

	@Override
	public boolean AbastecerToalha(Quarto quarto) {
		float valor = 20;
		return false;
	}

}

public abstract class Quarto implements Atendimento, Manutencao{
	
	private int andar, qntHosp;
	private char identificador;
	private boolean reservado, limpo, check_in, cafeDaManha;
	private Usuario usuario;
	private String tipoCama, vista;
	private float valorBase, fatura;
	
	public Quarto(int andar, char identificador, int qntHosp, boolean reservado, Usuario usuario,
			boolean limpo, boolean checkin, String tipoCama, float valorBase, boolean cafeDaManha,
			String vista, float fatura){
		this.andar = andar;
		this.identificador = identificador;
		this.qntHosp = qntHosp;
		this.reservado = reservado;
		this.usuario = usuario;
		this.limpo = limpo;
		this.check_in = check_in;
		this.tipoCama = tipoCama;
		this.valorBase = valorBase;
		this.cafeDaManha = cafeDaManha;
		this.vista = vista;
		this.fatura = fatura;
	}

	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getQntHosp() {
		return qntHosp;
	}
	public void setQntHosp(int qntHosp) {
		this.qntHosp = qntHosp;
	}

	public char getIdentificador() {
		return identificador;
	}
	public void setIdentificador(char identificador) {
		this.identificador = identificador;
	}

	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public boolean isLimpo() {
		return limpo;
	}
	public void setLimpo(boolean limpo) {
		this.limpo = limpo;
	}

	public boolean isCheck_in() {
		return check_in;
	}
	public void setCheck_in(boolean check_in) {
		this.check_in = check_in;
	}

	public boolean isCafeDaManha() {
		return cafeDaManha;
	}
	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTipoCama() {
		return tipoCama;
	}
	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}

	public String getVista() {
		return vista;
	}
	public void setVista(String vista) {
		this.vista = vista;
	}

	public float getValorBase() {
		return valorBase;
	}
	public void setValorBase(float valorBase) {
		this.valorBase = valorBase;
	}

	public float getFatura() {
		return fatura;
	}
	public void setFatura(float fatura) {
		this.fatura = fatura;
	}
	
}

public class Data {
    private int dia;
	private int mes;
	private  int ano;

	public Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	} 
	public int getDia(){
		return dia;
	}
	public void SetDia(int d){
		this.dia = d;
	}
	public int getMes(){
		return mes;
	}
	public void SetMes (int m){
		this.mes = m;
	}
	public int getAno() {
		return ano;
	}
	public void SetAno (int a){
		this.ano = a;
	}
	public String toString(){
}

}

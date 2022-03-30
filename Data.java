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
	public void setDia(int d){
		this.dia = d;
	}
	public int getMes(){
		return mes;
	}
	public void setMes (int m){
		this.mes = m;
	}
	public int getAno() {
		return ano;
	}
	public void setAno (int a){
		this.ano = a;
	}
	public String toString(){
		return this.dia +" / "+ this.mes +" / " + this.ano;
	}

}

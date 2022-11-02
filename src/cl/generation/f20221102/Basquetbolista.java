package cl.generation.f20221102;

public class Basquetbolista extends EquipoBasquetball{
	private Float altura;
	private Float peso;
	public Basquetbolista() {
		super();
	}
	public Basquetbolista(Float altura, Float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Basquetbolista [altura=" + altura + ", peso=" + peso + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	@Override
	public void metodoImprimir() {
		System.out.println("estoy en el metodo de la clase hija basquebolista");
	}
	
}

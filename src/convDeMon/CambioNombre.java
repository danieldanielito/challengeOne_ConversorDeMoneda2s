package convDeMon;

public class CambioNombre {
	private Double variable;
	private String nombre;
	
	public CambioNombre(Double variable, String nombre) {
		this.variable = variable;
		this.nombre = nombre;
	}
	public Double getVariable() {
		return variable;
	}
	public void setVariable(Double variable) {
		this.variable = variable;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "" + variable + " " + nombre ;
	}
	

}

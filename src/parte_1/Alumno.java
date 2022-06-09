package parte_1;

public class Alumno extends Persona {
	int legajo;
	
	//constructors
	public Alumno() {}
	public Alumno(int legajo) {
		this.legajo = legajo;
	}
	public Alumno(String nombre,String apellido,int legajo) {
		super(nombre,apellido);
		this.legajo = legajo;
	}
	
	//getter
	public int getLegajo() {
		return legajo;
	}
	
	//setter
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public boolean equals(Object obj) {
		Alumno aComparar = null;
		if(obj instanceof Alumno) {
			aComparar = (Alumno)obj;
		}
		return super.equals(obj) && legajo == aComparar.legajo;
	}
	
	public int hashCode(){
		return super.hashCode() + (int)legajo;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", legajo=");
		sb.append(legajo);
		return sb.toString();
	}
	
}

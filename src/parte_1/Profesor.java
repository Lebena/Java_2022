package parte_1;

public class Profesor extends Persona {
	String iosfa;

	public Profesor() {}
	public Profesor(String iosfa) {
		this.iosfa = iosfa;
	}
	public Profesor(String nombre,String apellido,String iosfa) {
		super(nombre,apellido);
		this.iosfa = iosfa;
	}
	
	public String getIosfa() {
		return iosfa;
	}

	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}
	
	public boolean equals(Object obj) {
		Profesor aComparar = null;
		if(obj instanceof Profesor) {
			aComparar = (Profesor)obj;
		}
		return super.equals(obj) && iosfa.equals(aComparar.getIosfa());
	}
	
	public int hashCode(){
		return super.hashCode() + iosfa.hashCode();
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", iosfa=");
		sb.append(iosfa);
		return sb.toString();
	}
	
}
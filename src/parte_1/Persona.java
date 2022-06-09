package parte_1;

abstract class Persona {
	private String apellido;
	private String nombre;
	
	//constructors
	public Persona() {
		nombre = "vacio";
		apellido = "vacio";
	}

	public Persona(String giveNombre, String giveApellido) {
		nombre = giveNombre;
		apellido = giveApellido;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	//setters
	public void setNombre(String giveNombre) {
		nombre = giveNombre;
	}
	
	public void setApellido(String giveApellido) {
		apellido = giveApellido;
	}
	
	//misc
	public boolean equals(Object obj) {
		Persona objetoRecibido = null;
		if(obj instanceof Persona) {
		objetoRecibido = (Persona)obj;
		}
		return ( objetoRecibido.getNombre().toUpperCase().equals(nombre.toUpperCase()) &&
			     objetoRecibido.getApellido().toUpperCase().equals(apellido.toUpperCase()) 
			   );
	}
	
	public int hashCode() {
		return nombre.hashCode() + apellido.hashCode();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("nombre:");
		sb.append(nombre);
		sb.append(",apellido=");
		sb.append(apellido);
		
		return sb.toString();
	}
}

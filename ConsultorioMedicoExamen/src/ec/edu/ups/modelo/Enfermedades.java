package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sintomas
 *
 */
@Entity
public class Enfermedades implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@ManyToOne
	private Paciente enfermedad;

	public Enfermedades() {
		super();
	}
	
	

	public Enfermedades(String nombre, Paciente enfermedad) {
		super();
		this.nombre = nombre;
		this.enfermedad = enfermedad;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enfermedades other = (Enfermedades) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Paciente getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Paciente enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
   
}

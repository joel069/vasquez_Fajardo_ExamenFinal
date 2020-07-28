package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sintomas
 *
 */
@Entity

public class Alergias implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@ManyToOne
	private Paciente alergias;

	public Alergias() {
		super();
	}

	public Alergias(String nombre, Paciente alergias) {
		super();
		this.nombre = nombre;
		this.alergias = alergias;
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

	public Paciente getAlergias() {
		return alergias;
	}

	public void setAlergias(Paciente alergias) {
		this.alergias = alergias;
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
		Alergias other = (Alergias) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alergias [codigo=" + codigo + ", nombre=" + nombre + ", alergias=" + alergias + "]";
	}
	 
}

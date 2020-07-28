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
	
	
   
}

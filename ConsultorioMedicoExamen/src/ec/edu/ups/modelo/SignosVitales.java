package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String presion;
	private String frecuenciac;
	private String frecuenciar;
	private String temperatura;
	private String saturacion;
	@ManyToOne
	private Paciente pacientesi;
	
	public SignosVitales() {
		super();
	}
	
	
	
	
   
}

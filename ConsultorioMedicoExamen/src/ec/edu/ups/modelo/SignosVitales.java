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

	public SignosVitales(String presion, String frecuenciac, String frecuenciar, String temperatura, String saturacion,
			Paciente pacientesi) {
		super();
		this.presion = presion;
		this.frecuenciac = frecuenciac;
		this.frecuenciar = frecuenciar;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.pacientesi = pacientesi;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPresion() {
		return presion;
	}

	public void setPresion(String presion) {
		this.presion = presion;
	}

	public String getFrecuenciac() {
		return frecuenciac;
	}

	public void setFrecuenciac(String frecuenciac) {
		this.frecuenciac = frecuenciac;
	}

	public String getFrecuenciar() {
		return frecuenciar;
	}

	public void setFrecuenciar(String frecuenciar) {
		this.frecuenciar = frecuenciar;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getSaturacion() {
		return saturacion;
	}

	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}

	public Paciente getPacientesi() {
		return pacientesi;
	}

	public void setPacientesi(Paciente pacientesi) {
		this.pacientesi = pacientesi;
	}

	@Override
	public String toString() {
		return "SignosVitales [codigo=" + codigo + ", presion=" + presion + ", frecuenciac=" + frecuenciac
				+ ", frecuenciar=" + frecuenciar + ", temperatura=" + temperatura + ", saturacion=" + saturacion
				+ ", pacientesi=" + pacientesi + "]";
	}
	
	
	
	
	
	
   
}

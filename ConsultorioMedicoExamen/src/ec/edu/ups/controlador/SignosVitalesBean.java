package ec.edu.ups.controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import ec.edu.ups.ejb.CitasFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.modelo.Citas;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.SignosVitales;

public class SignosVitalesBean {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CitasFacade citfacade;
	
	@EJB
	private SignosVitalesFacade sigfacade;
	
	private String presion;
	private String frecuenciac;
	private String frecuenciar;
	private String temperatura;
	private String saturacion;
	private List<SignosVitales> signos;
	
	@PostConstruct
    public void init() {
	 
	signos = sigfacade.findAll();
    
    }
	
	public CitasFacade getCitfacade() {
		return citfacade;
	}
	public void setCitfacade(CitasFacade citfacade) {
		this.citfacade = citfacade;
	}
	public SignosVitalesFacade getSigfacade() {
		return sigfacade;
	}
	public void setSigfacade(SignosVitalesFacade sigfacade) {
		this.sigfacade = sigfacade;
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
	
	/*
	public String add() {
		
		Citas cit = new Paciente();
		pac=pacfacade.buscarPaciente(paciente);
		System.out.println("el autor es :" + pac);
		citfacade.create(new Citas(this.fecha, this.hora,this.duracion,pac));
		citas =citfacade.findAll();
		return null;
	    }
*/
	    public String delete(SignosVitales s) {	
		sigfacade.remove(s);
		signos = sigfacade.findAll();
		return null;
	    }

	    public String save(SignosVitales s) {
	    sigfacade.edit(s);
		return null;
	    }
}

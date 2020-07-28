package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitasFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.modelo.Citas;
import ec.edu.ups.modelo.Paciente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class CitasBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CitasFacade citfacade;
	@EJB
	private PacienteFacade pacfacade;
	
	private String fecha;
	private String hora;
	private String duracion;
	private List<Citas> citas;
	private String cita;
	private String paciente;
	@PostConstruct
    public void init() {
	 
	citas = citfacade.findAll();
    
    }
	public CitasFacade getCitfacade() {
		return citfacade;
	}
	public void setCitfacade(CitasFacade citfacade) {
		this.citfacade = citfacade;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public List<Citas> getCitas() {
		return citas;
	}
	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}

	public String getCita() {
		return cita;
	}
	public void setCita(String cita) {
		this.cita = cita;
	}
	
	
	public PacienteFacade getPacfacade() {
		return pacfacade;
	}
	public void setPacfacade(PacienteFacade pacfacade) {
		this.pacfacade = pacfacade;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String add() {
		
		Paciente pac = new Paciente();
		pac=pacfacade.buscarPaciente(paciente);
		System.out.println("el autor es :" + pac);
		citfacade.create(new Citas(this.fecha, this.hora,this.duracion,pac));
		citas =citfacade.findAll();
		return null;
	    }

	    public String delete(Citas c) {	
		citfacade.remove(c);
		citas = citfacade.findAll();
		return null;
	    }

	    public String save(Citas c) {
	    citfacade.edit(c);
		return null;
	    }
	

}

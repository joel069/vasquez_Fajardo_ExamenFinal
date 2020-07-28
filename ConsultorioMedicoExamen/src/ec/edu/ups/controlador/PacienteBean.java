package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.modelo.Alergias;
import ec.edu.ups.modelo.Citas;
import ec.edu.ups.modelo.Enfermedades;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.SignosVitales;
import ec.edu.ups.modelo.Sintomas;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PacienteBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@EJB
	private PacienteFacade pacfacade;
	private String cedula;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String correo;
	private List<Paciente>pacientes;
	private List <Citas> citas;
	private List<SignosVitales> signos;
	private List<Sintomas> sintomas;
	private List<Enfermedades> enfermedades;
	private List<Alergias> alergias;
	
	
	@PostConstruct
    public void init() {
	 
	pacientes = pacfacade.findAll();
    
    }


	public PacienteFacade getPacfacade() {
		return pacfacade;
	}


	public void setPacfacade(PacienteFacade pacfacade) {
		this.pacfacade = pacfacade;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public List<Paciente> getPacientes() {
		return pacientes;
	}


	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}


	public List<Citas> getCitas() {
		return citas;
	}


	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}


	public List<SignosVitales> getSignos() {
		return signos;
	}


	public void setSignos(List<SignosVitales> signos) {
		this.signos = signos;
	}


	public List<Sintomas> getSintomas() {
		return sintomas;
	}


	public void setSintomas(List<Sintomas> sintomas) {
		this.sintomas = sintomas;
	}


	public List<Enfermedades> getEnfermedades() {
		return enfermedades;
	}


	public void setEnfermedades(List<Enfermedades> enfermedades) {
		this.enfermedades = enfermedades;
	}


	public List<Alergias> getAlergias() {
		return alergias;
	}


	public void setAlergias(List<Alergias> alergias) {
		this.alergias = alergias;
	}
	/*
		public String add() {
		
		Paciente pac = new Paciente();
		pac= pacfacade.buscarpersona(" ");
		System.out.println("el autor es :" + pac);
		pacfacade.create(new Paciente(this.nombre, this.isbn,this.numpag,aut));
		pacientes =pacfacade.findAll();
		return null;
	    }
*/
	    public String delete(Paciente p) {	
		pacfacade.remove(p);
		pacientes = pacfacade.findAll();
		return null;
	    }

	    public String save(Paciente p) {
	    pacfacade.edit(p);
		return null;
	    }
	    
	    /*
	    public void listarlibros() {
	    	
	    	System.out.println("la lista es" + libfacadeejb.listarlibroautor("juanito"));
	    	libros = libfacadeejb.listarlibroautor("juanito");
	    	
	    }*/
	
}

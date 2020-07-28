package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String cedula;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String correo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private List <Citas> citas;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientesi")
	private List<SignosVitales> signos;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sintoma")
	private List<Sintomas> sintomas;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "enfermedad")
	private List<Enfermedades> enfermedades;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "alergias")
	private List<Alergias> alergias;

	public Paciente() {
		super();
	}


	public Paciente(String cedula, String nombre, String apellidos, String telefono, String direccion, String correo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
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


	public List<Citas> getCitas() {
		return citas;
	}


	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}


	@Override
	public String toString() {
		return  nombre ;
	}

   
}

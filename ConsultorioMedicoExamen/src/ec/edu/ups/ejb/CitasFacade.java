package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.modelo.Citas;
import ec.edu.ups.modelo.Paciente;
@Stateless
public class CitasFacade extends AbstractFacade<Citas>{
	
	
	@PersistenceContext(unitName = "ConsultorioMedicoExamen")
    private EntityManager em;

    public CitasFacade() {
        super(Citas.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public Paciente buscarPaciente(String nombre) {
		System.out.println("El nombre que llega a las base es" +nombre);
		Paciente pac= new Paciente();
		try {
		String sql = "SELECT p FROM Paciente p where p.nombre= '"+nombre+"'";
		System.out.println(sql);
		Query query = em.createQuery(sql);
		pac= (Paciente) query.getSingleResult();
		System.out.println("recupere : " +nombre);
	}catch(Exception e) {
		System.out.println("Producto" + e.getMessage());
	}
		
		return pac;
 }


}

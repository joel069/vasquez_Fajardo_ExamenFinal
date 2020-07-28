package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Enfermedades;
import ec.edu.ups.modelo.Paciente;
@Stateless
public class EnfermedadesFacade extends AbstractFacade<Enfermedades>{
	
	 @PersistenceContext(unitName = "ConsultorioMedicoExamen")
	    private EntityManager em;

	    public EnfermedadesFacade() {
	        super(Enfermedades.class);
	    }
	    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }

}

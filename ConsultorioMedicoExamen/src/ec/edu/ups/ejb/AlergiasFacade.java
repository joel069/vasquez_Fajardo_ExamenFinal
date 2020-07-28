package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Alergias;

@Stateless
public class AlergiasFacade  extends AbstractFacade<Alergias>{
	
	 @PersistenceContext(unitName = "ConsultorioMedicoExamen")
	    private EntityManager em;

	    public AlergiasFacade() {
	        super(Alergias.class);
	    }
	    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }

}

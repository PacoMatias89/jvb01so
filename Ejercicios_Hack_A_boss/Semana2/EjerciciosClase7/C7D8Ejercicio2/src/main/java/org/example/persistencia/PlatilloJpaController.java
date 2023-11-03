package org.example.persistencia;

import org.example.logica.Platillo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class PlatilloJpaController {

    private EntityManagerFactory emf = null;

    public PlatilloJpaController() {
        this.emf = Persistence.createEntityManagerFactory("restuarantePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Creamos el CRUD para el objeto

    public void create(Platillo platillo){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(platillo);
        em.getTransaction().commit();
    }

    public void destroy(Long id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Platillo persona = em.find(Platillo.class, id);
        em.remove(persona);
        em.getTransaction().commit();
    }

    public void edit(Platillo platillo) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(platillo);// Editamos los datos de la persona
        em.getTransaction().commit();
    }

    public List<Platillo> findPlatilloEntities(){
        EntityManager em  = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
}

package ourbusinessproject;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class EnterpriseProjectService {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Object object) {
        entityManager.persist(object);
        entityManager.flush();
    }


    public Project findProjectById(Long id) {


        return entityManager.find(Project.class, id);
    }

    public Enterprise findEnterpriseById(Long id) {

        return entityManager.find(Enterprise.class, id);
    }
}

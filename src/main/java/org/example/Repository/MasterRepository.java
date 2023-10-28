package org.example.Repository;

import org.example.Tables.Master;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class MasterRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public MasterRepository() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Master> getAllMasters() {
        TypedQuery<Master> query = entityManager.createQuery("SELECT u FROM Master u", Master.class);
        return query.getResultList();
    }

    public void closeEntityManager() {
        if (this.entityManager != null) {
            this.entityManager.close();
        }

        if (this.entityManagerFactory != null) {
            this.entityManagerFactory.close();
        }
    }
}

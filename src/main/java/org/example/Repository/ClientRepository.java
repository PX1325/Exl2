package org.example.Repository;

import org.example.Tables.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.List;

public class ClientRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ClientRepository() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public List<Client> getAllClients() {
        TypedQuery<Client> query = entityManager.createQuery("SELECT u FROM Client u", Client.class);
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

package com.example.crengineering;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UpdatesDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void createUpdate(Updates updates){
        entityManager.persist(updates);
    }

    public Updates getUpdateById(int id){
        return entityManager.find(Updates.class, id);
    }

    public void deleteUpdate(Updates update) {entityManager.remove(update);}
}

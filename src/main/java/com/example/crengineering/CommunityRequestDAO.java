package com.example.crengineering;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Repository
@Transactional
public class CommunityRequestDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void createCommunityRequest(CommunityRequest communityRequest){
        entityManager.persist(communityRequest);
    }

    public CommunityRequest getCommunityRequestById(int id){
        return entityManager.find(CommunityRequest.class, id);
    }

    public void deleteCommunityRequest(int id) {
        CommunityRequest communityRequest = entityManager.find(CommunityRequest.class, id);
        entityManager.remove(communityRequest);
    }
}


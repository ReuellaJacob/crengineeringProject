package com.example.crengineering;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRequestRepository extends CrudRepository<CommunityRequest, Integer> {
    CommunityRequest findCommunityRequestByCommunityRequestId(int communityRequestId);
}
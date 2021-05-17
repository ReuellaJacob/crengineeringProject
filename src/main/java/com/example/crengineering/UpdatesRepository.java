package com.example.crengineering;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UpdatesRepository extends CrudRepository<Updates, Long> {
    List<Updates> findByCommunityRequest(CommunityRequest communityRequest, Sort sort);
}

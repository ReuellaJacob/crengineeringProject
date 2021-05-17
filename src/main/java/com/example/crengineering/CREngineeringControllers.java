package com.example.crengineering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Collection;

@RestController
public class CREngineeringControllers {
    @Autowired
    private CommunityRequestDAO communityRequestDAO;

    @Autowired
    private UpdatesDAO updatesDAO;

    @Autowired
    private CommunityRequestRepository communityRequestRepository;

    @RequestMapping(value = "/createRequest", method = RequestMethod.POST)
    public CommunityRequest createCommunityRequest(@RequestBody CommunityRequest communityRequest) {
        communityRequestDAO.createCommunityRequest(communityRequest);
        return communityRequest;
    }

    @RequestMapping(value = "/getRequest", method = RequestMethod.GET)
    public CommunityRequest getCommunityRequest(@RequestParam("id") int id) {
        return communityRequestDAO.getCommunityRequestById(id);
    }

    @RequestMapping(value = "/deleteRequest", method = RequestMethod.DELETE)
    public void deleteCommunityRequest(@RequestParam("id") int id) {
        communityRequestDAO.deleteCommunityRequest(id);
    }

    @RequestMapping(value = "/requests", method = RequestMethod.GET)
    public Collection<CommunityRequest> listOfCommunityRequests() {
        return (Collection<CommunityRequest>) communityRequestRepository.findAll();
    }

//    @RequestMapping(value = "/createUpdate", method = RequestMethod.POST)
//    public Updates createUpdate(@PathVariable("communityRequestId") int communityRequestId, @RequestBody Updates update) {
//        return communityRequestRepository.findCommunityRequestByCommunityRequestId(communityRequestId).Map(communityRequest -> {
//            update.setCommunityRequest(communityRequest);
//            return updatesRepository.save(update);
//        }).orElseThrow(() -> new ResourceNotFoundException("community Request not found, Id#" + communityRequestId));
//    }
}



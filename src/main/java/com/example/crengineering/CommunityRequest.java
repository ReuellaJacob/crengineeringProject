package com.example.crengineering;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="communityrequests")

public class CommunityRequest {
    private String entryDate;
    private String content;
    private String closeDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer communityRequestId;

    //TODO: default and cascade if I want that
    @OneToMany(mappedBy = "communityRequest", fetch = FetchType.LAZY)
    private Set<Updates> updates = new HashSet<>();

    public CommunityRequest() {
        this.content = content;
        this.communityRequestId = communityRequestId;
    }

    public CommunityRequest(String entryDate, String content) {
        this.entryDate = entryDate;
        this.content = content;
        this.communityRequestId = communityRequestId;
    }

    public Set<Updates> getUpdates() {
        return updates;
    }

    public void setUpdates(Set<Updates> updates) {
        this.updates = updates;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }
}

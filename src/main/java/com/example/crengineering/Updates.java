package com.example.crengineering;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="updates")

public class Updates {
    private String updateDate;
    private String content;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int updateId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "communityRequestId")
    private CommunityRequest communityRequest;

    public Updates(String updateDate, String content) {
        this.updateDate = updateDate;
        this.content = content;
    }

    public Updates() {
        this.updateId = updateId;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCommunityRequest(CommunityRequest communityRequest) {
        this.communityRequest = communityRequest;
    }
}

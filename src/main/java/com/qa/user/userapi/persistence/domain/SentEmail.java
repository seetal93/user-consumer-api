package com.qa.user.userapi.persistence.domain;

public class SentEmail {

    private Long emailId;

    private String emailAddress;

    public SentEmail() {

    }

    public SentEmail(Long emailId, String emailAddress) {

        this.emailAddress = emailAddress;
        this.emailId = emailId;
    }

    public Long getEmailId() {
        return emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }
  

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

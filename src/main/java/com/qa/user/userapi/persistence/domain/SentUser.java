package com.qa.user.userapi.persistence.domain;

public class SentUser {

    private Long userId;

    private String firstName;

    private String lastName;

    private String userName;

    private SentEmail sentEmail;

    public SentUser() {
    }

    public SentUser(Long userId, String firstName, String lastName, String userName, SentEmail sentEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userId = userId;
        this.sentEmail = sentEmail;
    }

    public Long getId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SentEmail getSentEmail() {
        return sentEmail;
    }

    public void setSentEmail(SentEmail sentPrize) {
        this.sentEmail = sentEmail;
    }

}
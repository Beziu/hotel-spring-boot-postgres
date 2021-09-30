package com.frankmoley.lil.sbet.landon.roomwebapp.models;

import java.util.UUID;

public class StaffMember {

    private UUID guid;
    private String firstName;
    private String lastName;
    private String position;

    public StaffMember() {
    }

    public StaffMember(String firstName, String lastName, String position) {
        this.guid = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public StaffMember(UUID guid, String firstName, String lastName, String position) {
        this.guid = guid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

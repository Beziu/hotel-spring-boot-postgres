package com.frankmoley.lil.sbet.landon.roomwebapp.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
public class StaffMember {

    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID guid;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "POSITION")
    private Position position;

    public StaffMember() {
        this.guid = UUID.randomUUID();
    }

    public StaffMember(String firstName, String lastName, Position position) {
        this.guid = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public StaffMember(UUID guid, String firstName, String lastName, Position position) {
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}

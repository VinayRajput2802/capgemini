package org.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainee")
public class Trainee {
    @Id
    private Integer traineeId;
    private String domain;
    private String location;
    private String traineeName;

    public Trainee() {
    }

    public Trainee(Integer traineeId, String domain, String location, String traineeName) {
        this.traineeId = traineeId;
        this.domain = domain;
        this.location = location;
        this.traineeName = traineeName;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }
}

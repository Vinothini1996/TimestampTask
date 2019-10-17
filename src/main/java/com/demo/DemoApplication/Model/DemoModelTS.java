package com.demo.DemoApplication.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="demomodelts",uniqueConstraints = {@UniqueConstraint(columnNames = {"timestamp"})})
public class DemoModelTS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @NotNull
    Long timeStamp;

    public DemoModelTS(){

    }

    public DemoModelTS(int id, @NotNull Long timeStamp) {
        this.id = id;
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}

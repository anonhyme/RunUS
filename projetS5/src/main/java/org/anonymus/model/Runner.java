package org.anonymus.model;

import javax.persistence.*;

/**
 * Created by antoine on 3/2/2015.
 */
@Entity
@Table(name = "runner")
public class Runner {
    
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Column(name = "height")
    private Integer runnerHeight;
    
    @Column(name = "average_speed")
    private Integer runnerAvgSpeed;
    
    @Column(name = "last_run")
    private String lastRunStat;
    
    @Column(name = "mac_id")
    private String macId;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRunnerHeight() {
        return runnerHeight;
    }

    public void setRunnerHeight(Integer runnerHeight) {
        this.runnerHeight = runnerHeight;
    }

    public Integer getRunnerAvgSpeed() {
        return runnerAvgSpeed;
    }

    public void setRunnerAvgSpeed(Integer runnerAvgSpeed) {
        this.runnerAvgSpeed = runnerAvgSpeed;
    }

    public String getLastRunStat() {
        return lastRunStat;
    }

    public void setLastRunStat(String lastRunStat) {
        this.lastRunStat = lastRunStat;
    }

    public String getMacId() {
        return macId;
    }

    public void setMacId(String macId) {
        this.macId = macId;
    }
}

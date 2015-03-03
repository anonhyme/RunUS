package org.anonymus.service;

/**
* Created by antoine on 3/1/2015.
*/

import org.anonymus.exception.RunnerNotFound;
import org.anonymus.model.Runner;

import java.util.List;

public interface RunnerService {

    public Runner create(Runner runner);
    public Runner delete(int id) throws RunnerNotFound;
    public List<Runner> findAll();
    public Runner update(Runner runner) throws RunnerNotFound;
    public Runner findById(int id);
}
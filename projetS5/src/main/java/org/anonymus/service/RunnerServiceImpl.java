package org.anonymus.service;

import org.anonymus.exception.RunnerNotFound;
import org.anonymus.model.Runner;
import org.anonymus.repository.RunnerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by antoine on 3/1/2015.
 */
@Service
public class RunnerServiceImpl implements RunnerService {

    @Resource
    private RunnerRepository RunnerRepository;

    @Override
    @Transactional
    public Runner create(Runner Runner) {
        Runner createdRunner = Runner;
        return RunnerRepository.save(createdRunner);
    }

    @Override
    @Transactional
    public Runner findById(int id) {
        return RunnerRepository.findOne(id);
    }

    @Override
    @Transactional(rollbackFor = RunnerNotFound.class)
    public Runner delete(int id) throws RunnerNotFound {
        Runner deletedRunner = RunnerRepository.findOne(id);

        if (deletedRunner == null) {
            throw new RunnerNotFound();
        }

        RunnerRepository.delete(deletedRunner);
        return deletedRunner;
    }

    @Override
    @Transactional
    public List<Runner> findAll() {
        return RunnerRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = RunnerNotFound.class)
    public Runner update(Runner Runner) throws RunnerNotFound {
        Runner updatedRunner = RunnerRepository.findOne(Runner.getId());

        if (updatedRunner == null) {
            throw new RunnerNotFound();
        }

        updatedRunner.setName(Runner.getName());
        updatedRunner.setMacId(Runner.getMacId());
        updatedRunner.setRunnerHeight(Runner.getRunnerHeight());
        return updatedRunner;
    }

}
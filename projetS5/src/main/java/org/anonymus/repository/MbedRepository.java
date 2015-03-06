package org.anonymus.repository;

import org.anonymus.model.Runner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by antoine on 3/2/2015.
 */
public interface MbedRepository extends JpaRepository<Runner, Integer> {
    
}

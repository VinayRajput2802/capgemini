package org.cg.repo;

import org.cg.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITraineeRepo extends JpaRepository<Trainee,Integer> {
}

package dev.kavrin.taskTracker.data.repository;

import dev.kavrin.taskTracker.data.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

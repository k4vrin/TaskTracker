package dev.kavrin.taskTracker.domain.service;

import dev.kavrin.taskTracker.data.model.Task;
import dev.kavrin.taskTracker.data.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow();
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task create(String title) {
        return taskRepository.save(new Task(title));
    }

    @Transactional
    public Task update(Long id, String title, boolean completed) {
        Task task = taskRepository.findById(id)
                .orElseThrow();

        task.setTitle(title);
        task.setCompleted(completed);
        return task;
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
package dev.kavrin.taskTracker.controller;

import dev.kavrin.taskTracker.controller.dto.CreateTaskRequest;
import dev.kavrin.taskTracker.controller.dto.UpdateTaskRequest;
import dev.kavrin.taskTracker.data.model.Task;
import dev.kavrin.taskTracker.domain.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.findById(id);
    }

    // POST /api/tasks
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody CreateTaskRequest request) {
        return taskService.create(request.title());
    }

    // PUT /api/tasks/{id}
    @PutMapping("/{id}")
    public Task updateTask(
            @PathVariable Long id,
            @RequestBody UpdateTaskRequest request
    ) {
        return taskService.update(id, request.title(), request.completed());
    }

    // DELETE /api/tasks/{id}
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable Long id) {
        taskService.delete(id);
    }

}

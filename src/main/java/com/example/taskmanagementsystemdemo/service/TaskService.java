package com.example.taskmanagementsystemdemo.service;

import com.example.taskmanagementsystemdemo.entity.Category;
import com.example.taskmanagementsystemdemo.entity.Task;
import com.example.taskmanagementsystemdemo.repository.CategoryRepository;
import com.example.taskmanagementsystemdemo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public TaskService(TaskRepository taskRepository, CategoryRepository categoryRepository) {
        this.taskRepository = taskRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Transactional
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Transactional
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Transactional
    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id)
                .map(existingTask -> {
                    existingTask.setTitle(updatedTask.getTitle());
                    existingTask.setDescription(updatedTask.getDescription());
                    existingTask.setPriority(updatedTask.getPriority());
                    existingTask.setStatus(updatedTask.getStatus());
                    if (updatedTask.getCategory() != null && updatedTask.getCategory().getId() != null) {
                        Category category = categoryRepository.findById(updatedTask.getCategory().getId())
                                .orElseThrow(() -> new RuntimeException("Category not found with id: " + updatedTask.getCategory().getId()));
                        existingTask.setCategory(category);
                    }

                    return taskRepository.save(existingTask);
                })
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    }
}

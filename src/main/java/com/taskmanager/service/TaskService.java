package com.taskmanager.service;

import com.taskmanager.model.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    void save(Task task);
    Optional<Task> findById(UUID id);
    List<Task> findAll();
    void delete(UUID id);
    void update(Task task);
}

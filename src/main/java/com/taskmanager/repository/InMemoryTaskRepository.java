package com.taskmanager.repository;

import com.taskmanager.model.Task;

import java.util.*;

public class InMemoryTaskRepository implements TaskRepository {

    private final Map<UUID, Task> tasks = new HashMap<>();

    @Override
    public void save(Task task) {
        tasks.put(task.getId(), task);
    }

    @Override
    public Optional<Task> findById(UUID id) {
        return Optional.ofNullable(tasks.get(id));
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public void delete(UUID id) {
        tasks.remove(id);
    }

    @Override
    public void update(Task task) {
        tasks.put(task.getId(), task);
    }
}

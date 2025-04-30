package com.example.task.manager.Service;


import com.example.task.manager.dal.Priority;
import com.example.task.manager.dal.Status;
import com.example.task.manager.dal.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaskService extends RuntimeException {

    private int sequence = 1;
    private final Map<Integer, Task> database = new HashMap<>();

    public void create(
            String title,
            String description,
            Priority priority
    ) {
        Task task = new Task(sequence, title, description, priority, Status.NEW);
        sequence++;
        database.put(task.getId(), task);
    }

    public Task read(Integer id) {
        return database.get(id);
    }

    public List<Task> read() {
        return database.values().stream().toList();
    }



}

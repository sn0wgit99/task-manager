package com.example.task.manager.controller;


import com.example.task.manager.Service.TaskService;
import com.example.task.manager.dal.Priority;
import com.example.task.manager.dal.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class TaskController {


    private final TaskService service;



    @PostMapping("/api/task")
    public void create(@RequestParam String title,
                       @RequestParam String description,
                       @RequestParam Priority priority
    ) {
        service.create(title, description, priority);

    }

    @GetMapping("api/task")
    public Task read(@RequestParam Integer id) {
        return service.read(id);
    }

    @GetMapping("api/tasks")
    public List<Task> read() {
        return service.read();
    }
    @DeleteMapping("/api/task")
    public void delete(@RequestParam Integer id) {
        service.delete(id);
    }

}

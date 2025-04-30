package com.example.task.manager.dal;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private Integer id;

    private String title;

    private String description;

    private Priority priority;

    private Status status;

}

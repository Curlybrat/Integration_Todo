package com.practice.integration.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class Todo {
    private int id;
    private boolean completed;
    private String title;
    private int userId;
}

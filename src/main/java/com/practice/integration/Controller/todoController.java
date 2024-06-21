package com.practice.integration.Controller;

import com.practice.integration.Entity.Todo;
import com.practice.integration.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class todoController {

    @Autowired
    TodoService service;
    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable int id){
        return this.service.getSingleTodo(id);
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return this.service.getAllTodos();
    }

    @PostMapping("/AddTodo")
    public Todo AddTodos(@RequestBody Todo todo){
        return this.service.AddTodo(todo);
    }
}

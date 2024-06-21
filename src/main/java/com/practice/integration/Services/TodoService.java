package com.practice.integration.Services;

import com.practice.integration.Entity.Todo;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class TodoService {

    RestClient restClient;
    public TodoService(RestClient restClient) {
        this.restClient = restClient;
    }

    public Todo getSingleTodo(int id){
        return restClient.get()
                .uri("/todos/{id}",id)
                .retrieve()
                .body(Todo.class);
    }

    public List<Todo> getAllTodos(){
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {
                });
    }

    public Todo AddTodo(Todo todo){
        return restClient.post()
                .uri("/todos")
                .contentType(MediaType.APPLICATION_JSON)
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }
}

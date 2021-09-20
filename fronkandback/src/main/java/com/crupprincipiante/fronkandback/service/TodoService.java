package com.crupprincipiante.fronkandback.service;

import com.crupprincipiante.fronkandback.entity.Todo;
import com.crupprincipiante.fronkandback.repository.TodoRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class TodoService implements TodoServiceI{

    @Autowired
    private TodoRepositoryI date;

    @Override
    public Iterable<Todo> list() {
        return date.findAll();
    }

    @Override
    public Todo listarid(int id) {
       Optional<Todo> td = date.findById(id);
       if(td.isEmpty()){
           System.out.println("Ocurrio un error al ingresar los datos");
       }
        return td.get();
    }

    @Override
    public Todo save(Todo todo) {
    if(todo == null){
        System.out.println("No ha agregado un opbjetp");
    }
        return date.save(todo);
    }

    @Override
    public void delete(int id) {
        date.delete(get(id));
    }

    @Override
    public Todo get(int id) {
        return date.findById(id).orElseThrow();
    }
}

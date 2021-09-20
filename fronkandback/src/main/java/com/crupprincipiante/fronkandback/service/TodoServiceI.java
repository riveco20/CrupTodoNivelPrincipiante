package com.crupprincipiante.fronkandback.service;

import com.crupprincipiante.fronkandback.entity.Todo;

import java.util.*;

public interface TodoServiceI {


    Iterable<Todo>list();
    Todo listarid(int id);
    Todo save(Todo tod0);
    void delete(int id);
    Todo get(int id);
}

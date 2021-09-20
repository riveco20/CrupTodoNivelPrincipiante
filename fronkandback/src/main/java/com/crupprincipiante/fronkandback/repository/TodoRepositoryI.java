package com.crupprincipiante.fronkandback.repository;

import com.crupprincipiante.fronkandback.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepositoryI extends CrudRepository<Todo,Integer>{

}

package com.hainet.doma.spring.boot.sample.dao;

import com.hainet.doma.spring.boot.sample.entity.Person;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface PersonDao {

    @Select
    List<Person> findAll();
}
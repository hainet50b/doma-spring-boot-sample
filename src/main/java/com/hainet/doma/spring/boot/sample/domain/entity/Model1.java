package com.hainet.doma.spring.boot.sample.domain.entity;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

@Entity
@Data
public class Model1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}

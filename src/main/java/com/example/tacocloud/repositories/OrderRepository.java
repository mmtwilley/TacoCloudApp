package com.example.tacocloud.repositories;

import com.example.tacocloud.models.TacoOrder;
import org.springframework.core.annotation.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    TacoOrder save(TacoOrder order);
}

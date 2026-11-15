package com.springbootorders.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<orders, Long> {
    List<orders> findByGiValue(Long giValue);
}

package com.example.persistence;

import com.example.controller.domain.OrderNo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maomao on 16/7/5.
 */
public interface OrderNoRepository extends JpaRepository<OrderNo,Long>{
}

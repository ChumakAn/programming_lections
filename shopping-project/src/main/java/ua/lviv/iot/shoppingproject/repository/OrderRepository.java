package ua.lviv.iot.shoppingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.shoppingproject.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}

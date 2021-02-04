package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.data.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

/*
This interface, though empty on the surface, packs a punch given it supports:

Creating new instances

Updating existing ones

Deleting

Finding (one, all, by simple or complex properties)
 */
}

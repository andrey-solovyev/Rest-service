package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.Model.Order;

interface OrdersRepository extends JpaRepository<Order, Long> {
    @Override
    default Order findOne(Long aLong) {
        return null;
    }
/*
This interface, though empty on the surface, packs a punch given it supports:

Creating new instances

Updating existing ones

Deleting

Finding (one, all, by simple or complex properties)
 */
}

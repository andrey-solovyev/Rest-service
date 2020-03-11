package payroll.Controller;

import org.springframework.web.bind.annotation.*;
import payroll.Model.Order;
import payroll.OrderRepository;

import java.util.List;

@RestController
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository repository) {
        this.orderRepository = repository;
    }

    @GetMapping("/orders")
    List<Order> all() {
        return orderRepository.findAll();
    }

    @PostMapping("/orders")
    Order newOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping("/orders/{id}")
    Order findById(@PathVariable Long id) {
        //maybe use try catch to NPE TEST IT TO NULL
        //or write code in interface
        return orderRepository.findOne(id);
    }
    @DeleteMapping("/orders/{id}")
    void deleteEmployee(@PathVariable Long id) {
        orderRepository.delete(id);
    }


}

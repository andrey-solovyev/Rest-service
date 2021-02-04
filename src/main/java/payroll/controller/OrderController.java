package payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import payroll.exception.OrderNotFoundException;
import payroll.data.entity.Order;
import payroll.repository.OrderRepository;

// tag::hateoas-imports[]
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
// end::hateoas-imports[]

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository repository) {
        this.orderRepository = repository;
    }

    @GetMapping(value = "/orders")
    public CollectionModel<EntityModel<Order>> all() {

        List<EntityModel<Order>> orders = orderRepository.findAll().stream()
                .map(order -> new EntityModel<>(order,
                        linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
                        linkTo(methodOn(OrderController.class).all()).withRel("order")))
                .collect(Collectors.toList());

        return new CollectionModel<>(orders,
                linkTo(methodOn(OrderController.class).all()).withSelfRel());
    }


    @PostMapping("/orders")
    Order newOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping(value = "/orders/{id}")
    EntityModel<Order> findById(@PathVariable Long id) {
        //maybe use try catch to NPE TEST IT TO NULL
        //or write code in interface
        Order order = orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException(id));
        return new EntityModel<Order>(order,
                linkTo(methodOn(OrderController.class).one(id)).withSelfRel(),
                linkTo(methodOn(OrderController.class).all()).withRel("order"));
    }

    @DeleteMapping("/orders/{id}")
    void deleteEmployee(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }


}

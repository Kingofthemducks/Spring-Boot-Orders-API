package com.springbootorders.orders;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<orders> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public orders getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with ID: " + id));
    }

    @GetMapping("/giValue/{giValue}")
    public List<orders> getOrdersByGiValue(@PathVariable Long giValue) {
        return orderRepository.findByGiValue(giValue);
    }

    @PostMapping
    public orders createOrder(@RequestBody orders order) {
        return orderRepository.save(order);
    }

    @PutMapping("/{id}")
    public orders updateOrder(@PathVariable Long id, @RequestBody orders order) {
        if (!orderRepository.existsById(id)) {
            throw new ResourceNotFoundException("Order not found with ID: " + id);
        }
        order.setId(id);
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteOrder(@PathVariable Long id) {
        if (!orderRepository.existsById(id)) {
            throw new ResourceNotFoundException("Order not found with ID: " + id);
        }
        orderRepository.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Order deleted successfully.");
        return response;
    }
}
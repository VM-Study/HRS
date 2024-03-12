package edu.ssc.hrs.rest;

import edu.ssc.hrs.entity.Order;
import edu.ssc.hrs.entity.service.DeliveryService;
import edu.ssc.hrs.entity.service.OrderService;
import edu.ssc.hrs.entity.service.ProductServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final ProductServiceService productServiceService;
    private final OrderService orderService;
    private final DeliveryService deliveryService;

    public CustomerController(ProductServiceService productServiceService, OrderService orderService, DeliveryService deliveryService) {
        this.productServiceService = productServiceService;
        this.orderService = orderService;
        this.deliveryService = deliveryService;
    }

    @GetMapping(value = "")
    public String index(Model model) {
        return "customer-panel";
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("productsServices", productServiceService.findAll());
        return "products";
    }

    @PostMapping("/createOrder")
    public String createOrder(@RequestParam("productServiceIds") List<Long> productServiceIds) {
        Order order = orderService.createOrder(productServiceIds);
        return "redirect:/customer/order/" + order.getOrderID();
    }

    @GetMapping("/order/{orderId}")
    public String viewOrder(@PathVariable Long orderId, Model model) {
        model.addAttribute("order", orderService.findById(orderId));
        return "order-details";
    }

    @GetMapping("/trackDelivery/{orderId}")
    public String trackDelivery(@PathVariable Long orderId, Model model) {
        model.addAttribute("delivery", deliveryService.findById(orderId));
        return "delivery-tracking";
    }
}

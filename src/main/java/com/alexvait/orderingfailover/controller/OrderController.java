package com.alexvait.orderingfailover.controller;

import com.alexvait.orderingfailover.service.OrderFailoverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(OrderController.BASE_URL)
public class OrderController {

    public static final String BASE_URL = "/orders-failover";

    private final OrderFailoverService orderFailoverService;

    public OrderController(OrderFailoverService orderFailoverService) {
        this.orderFailoverService = orderFailoverService;
    }

    @RequestMapping(path = {"/", ""})
    public ResponseEntity<Map<String, Object>> getAllOrders() {
        return orderFailoverService.getOrders();
    }
}

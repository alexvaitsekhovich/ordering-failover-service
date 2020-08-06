package com.alexvait.orderingfailover.service;

import com.alexvait.orderingfailover.error.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

@Component
public class OrderFailoverService {

    public ResponseEntity<Map<String, Object>> getOrders() {
        ApiError apiError = new ApiError(HttpStatus.SERVICE_UNAVAILABLE);
        apiError.setErrors(Arrays.asList("Order API is not available"));
        return new ResponseEntity<>(apiError.getErrorBody(), HttpStatus.OK);
    }

}

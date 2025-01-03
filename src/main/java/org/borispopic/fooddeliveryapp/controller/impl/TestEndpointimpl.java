package org.borispopic.fooddeliveryapp.controller.impl;

import org.borispopic.fooddeliveryapp.controller.TestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test/")
public class TestEndpointimpl implements TestController {
    @GetMapping(path = "get")
    @Override
    public ResponseEntity<String> getTestEndpoint() {
        return ResponseEntity.ok("Success");
    }
}

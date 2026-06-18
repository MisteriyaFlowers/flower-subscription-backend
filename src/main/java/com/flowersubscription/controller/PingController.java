package com.flowersubscription.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PingController {

    @GetMapping("/ping")
    public ResponseEntity<PingResponse> ping() {
        PingResponse response = new PingResponse(
                "ok",
                "flower-subscription-backend"
        );

        return ResponseEntity.ok(response);
    }

    public record PingResponse(
            String status,
            String application
    ) {
    }
}
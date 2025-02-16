package com.example.testtaskspring.adapter.tranche;

import com.example.testtaskspring.app.api.TrancheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrancheController {
    private final TrancheService trancheService;
    @GetMapping("/get")
    public void get() {
        trancheService.execute();
    }

    @GetMapping("/get-string")
    public String getString() {
        return "Hello";
    }
    @GetMapping("/get-long/{id}")
    public String getString(long id) {
        return "Hello "+ id;
    }

    @PostMapping
    public String getPost() {
        return "sdas";
    }
}

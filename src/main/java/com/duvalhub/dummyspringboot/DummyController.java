package com.duvalhub.dummyspringboot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dummy")
@RequiredArgsConstructor
@Slf4j
public class DummyController {
    private final DummyService dummyService;

    @GetMapping
    public List<DummyEntity> hello() {
        return this.dummyService.findAll();
    }

    @PostMapping
    public DummyEntity create(@RequestBody DummyEntity entity) {
        log.info("Creating user {}", entity);
        return this.dummyService.create(entity);
    }

    @PutMapping("/{id}")
    public DummyEntity update(@PathVariable Long id, @RequestBody DummyEntity entity) {
        log.info("Creating user {} with {}", id, entity);
        return this.dummyService.update(id, entity);
    }

}

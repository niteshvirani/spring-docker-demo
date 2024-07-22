package com.nv;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/demo")
@RequiredArgsConstructor
public class DemoController {

    private final DemoRepository demoRepository;

    @GetMapping
    public List<DemoEntity> findAll() {
        return demoRepository.findAll();
    }

    @PostMapping
    public DemoEntity save(@RequestBody DemoEntity demoEntity) {
        return demoRepository.save(demoEntity);
    }

    @GetMapping("/{id}")
    public DemoEntity findById(@PathVariable Long id) {
        return demoRepository.findById(id).orElseThrow();
    }
}

package com.joosa.msa.limit.limitservice.controller;

import com.joosa.msa.limit.limitservice.bean.Limits;
import com.joosa.msa.limit.limitservice.configuration.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitController {

    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}

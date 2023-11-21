package com.devjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/call")
public class Devjenkins {
@GetMapping(value="/find")
public String solve() {
	return "hello msg";
}
}

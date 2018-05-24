package com.example;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KillSwitch {

	Logger logger = LoggerFactory.getLogger(KillSwitch.class);
	
	@GetMapping("/kill")
	public String exitAbruptly() {
		logger.info("About to kill the application.");
		System.exit(-1);
		return "Should have killed the application.";
	}
	
	@GetMapping("/memory")
	public String fillUpMemory(@RequestParam(name="count", defaultValue="1000000") int count) {
		Map<Integer,Customer> map = new HashMap<>();
		for (int i=0; i<count; i++) {
			map.put(i, new Customer());
		}
		return "Successfully created " + map.size() + " object(s)";
	}
	
}

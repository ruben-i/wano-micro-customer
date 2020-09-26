package org.cronos.customer.rest;

import java.util.concurrent.TimeUnit;

import org.cronos.constant.Constant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Constant.API_SYSTEM)
public class SystemRestController {

	@GetMapping("/poweroff")
	public ResponseEntity<String> get() {
		System.exit(0);
		return ResponseEntity.ok("App poweroff");
	}
	
	@GetMapping("/health")
	public ResponseEntity<String> health() {
		try {
			TimeUnit.SECONDS.sleep(120);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok("App OK");
	}
}

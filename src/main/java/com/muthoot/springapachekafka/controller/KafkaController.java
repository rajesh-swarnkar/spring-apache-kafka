package com.muthoot.springapachekafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.muthoot.springapachekafka.producer.Producer;

@RestController
public class KafkaController {
	
	@Autowired
	private Producer producer;
	
	@PostMapping("/produceMsg")
	public String produceMsg(@RequestBody String msg) {
		producer.sendMessage(msg);
		return "msg: "+msg+" sent successfully!";
	}

}

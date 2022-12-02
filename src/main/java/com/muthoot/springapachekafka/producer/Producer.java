package com.muthoot.springapachekafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	@Value("${topicName}")
	private String topicName;

	public Producer(KafkaTemplate<String, String> template) {
		super();
		this.template = template;
	}
	
	public void sendMessage(String msg) {
		template.send(topicName, msg);
	}
	
}

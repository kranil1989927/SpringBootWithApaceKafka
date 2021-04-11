package learn.messaging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import learn.messaging.service.KafkaSender;

@RestController
@RequestMapping("/kafkamessage")
public class ApacheKafkaWebController {

	@Autowired
	private KafkaSender kafkaSender;

	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		this.kafkaSender.send(message);
		return "Message sent to the Kafka Topic : myfirst_topic is sent Successfully";
	}
}

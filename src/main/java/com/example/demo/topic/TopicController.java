package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	
	
	public List<Topic> getAllTopics(){
		//acctulay i have to connect to data base 
		// But right now i am hard coding the topics in Josn format
		return Arrays.asList(
				new Topic("core java", "arrays", "list description"),
				new Topic("adv java", "Hybernate", "Data Handling"),
				new Topic("Spring", "Spring Context","SpringFramework")			
// we didint write anything in Json
//But Spring Mvc did for us conversion work so response is Json format
				);
	}

}

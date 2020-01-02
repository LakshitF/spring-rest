package rest;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Skipping individual services for now, it will be handled by RestControllers only.

@RestController
public class TopicController {

	@Autowired
	private TopicRepository topics;

    @RequestMapping(method=RequestMethod.GET,value="/topics")
    public List<Topic> getAllTopics(){
		System.out.println("WORKING2");
		List <Topic> temp = new ArrayList<Topic>();
		topics.findAll().forEach(element->{
			temp.add(element);
		});
		//can be replaced by a lambda expression
		// topics.findAll().forEach(temp::add);
		return temp;
	}

	@RequestMapping(method=RequestMethod.POST,value="/topics/add")
	public String addTopic(@RequestBody Topic topic) {
		System.out.println("in post mapping "+topic.id);
		topics.save(topic);
		return "Done";
	}

	@RequestMapping(method=RequestMethod.POST,value="/topics/update")
	public void updateTopic(@RequestBody Topic topic) {
		topics.save(topic);
	}

	@RequestMapping(method=RequestMethod.GET,value="/topics/{id}")
    public Topic getTopic(String id){
        return topics.findById(id).get();

    }
	
	
}



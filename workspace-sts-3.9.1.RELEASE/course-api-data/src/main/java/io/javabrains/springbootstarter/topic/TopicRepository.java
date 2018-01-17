package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>  {

	//all these included in CrudRepository
	//getAllTopics
	
	//getTopic(String id)
	
	//updateTopic(Topic t)
	
	//deleteTopic(String id)
	
	
	
}

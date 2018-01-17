package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>  {
	

	//all these included in CrudRepository
	//This is where we will add functions
	
	//Take ID and return repository
	public List<Course> findByTopicId(String topicId);
	//getAllTopics
	
	//getTopic(String id)
	
	//updateTopic(Topic t)
	
	//deleteTopic(String id)
	
	
	
}

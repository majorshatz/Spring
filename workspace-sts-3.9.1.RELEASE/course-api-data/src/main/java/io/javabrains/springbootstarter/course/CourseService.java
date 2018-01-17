package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired //Causes it to inject topic Repository when called
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		// replaced return topics;
		List<Course> topics = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(topics::add);
		return topics;
	}
	public Course getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}
	public void addCourse(Course course) {
		//replaced topics.add(topic);
		courseRepository.save(course);
		
	}
	public void updateCourse(Course course) {
		//Save does both add and update
		courseRepository.save(course);
		
	}
	public void deleteCourse(String id) {
		courseRepository.delete(id);
		
	}
	
}

package io.java.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{

	// Spring JPA provide implementation for these filters as method name should be operation followed by condition followed by object followed by object field
	public List<Course> findByTopicId(String name);
	
	

}

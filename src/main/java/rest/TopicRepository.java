package rest;

import java.util.*;

import org.springframework.data.repository.CrudRepository;

//Imagine this as complete table 

public interface TopicRepository extends CrudRepository<Topic,String>{

	//for the time you dont connnect to real dbs
}



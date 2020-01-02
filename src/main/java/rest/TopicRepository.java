package rest;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Imagine this as complete table 
@Repository
public interface TopicRepository extends JpaRepository<Topic,String>{

	//for the time you dont connnect to real dbs
}



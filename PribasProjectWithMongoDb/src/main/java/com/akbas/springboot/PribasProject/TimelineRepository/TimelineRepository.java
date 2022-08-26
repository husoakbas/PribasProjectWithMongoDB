package com.akbas.springboot.PribasProject.TimelineRepository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.akbas.springboot.PribasProject.Entity.Timeline;

@Repository
public interface TimelineRepository extends MongoRepository<Timeline, String> {

	Timeline getByTitleAndDescription(String title, String description);

	List<Timeline> getByTitleOrDescription(String title, String description);

	List<Timeline> getByMomentsTitle(String title);

	List<Timeline> getByUserUserName(String name);

	Timeline getByUserUserid(String id);
	
	List<Timeline> getByDescriptionIsLike(String dsr);

	// @Query("{'user.userName':?0}") List<Timeline> getByUserName(String name);
	
	/*
	 * İlkinde Query alanına Users.userName yazdın çalışmadı. Class adını değil
	 * tablodaki alan adını vereceksin! user.userName. küçük u yani
	 */

	//@Query("{'moments.title':?0}") List<Timeline> getByMomentsTitle(String title);

	
	//@Query("{'user.userid':?0}") Timeline getByUserId(String id);
	 

}

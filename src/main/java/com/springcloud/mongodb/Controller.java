package com.springcloud.mongodb;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.BasicDBObject;

@RestController
public class Controller {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@RequestMapping("/test")
	public String test() {
		Query query = new Query();
		Criteria criteria = Criteria.where("UserId").is(207462);
		criteria.and("Action").is(0);
		query.addCriteria(criteria);
		List<BasicDBObject> find = mongoTemplate.find(query,BasicDBObject.class,"UserIdxDownloadLog");		
		
		return "SUCCESS-"+find;
	}
}

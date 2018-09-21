package com.example.Nio4j.Repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.Nio4j.Model.User;

public interface UserRepository extends Neo4jRepository<User, Long>
{

	@Query("MATCH (n:User) RETURN n LIMIT 25")
	Collection<User> getAllResource();
	

}

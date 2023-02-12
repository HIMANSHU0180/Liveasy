package com.example.liveasy.liveasy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.liveasy.liveasy.dao.payload;

public interface payLoadRepo extends CrudRepository<payload, Long> {
       
    payload findByLoadId(int t);
    @Query("select p from payload p where p.shipperId = ?1")
 List<payload> findAllByshipperId(String t);

    Long deleteUserByLoadId(String loadId); 

   
  

}
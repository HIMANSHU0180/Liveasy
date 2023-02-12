package com.example.liveasy.liveasy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.liveasy.liveasy.dao.payload;
import com.example.liveasy.liveasy.repo.payLoadRepo;

@RestController
public class payLoadController {
    @Autowired
     payLoadRepo payloadrepo;
    @PostMapping("load")
    public ResponseEntity<String> addPayLoad(@Validated @RequestBody payload p) {

        try{
            payloadrepo.save(p);
            return new ResponseEntity<>("added", HttpStatus.OK);

        }
		catch(Exception e){

        return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
		
	}
    
}
@GetMapping(value = "load", params = "loadid")
@ResponseBody
public ResponseEntity<payload> getFoos(@RequestParam String loadid) {
  long t=Long.parseLong(loadid);
  if(payloadrepo.findById(t)==null){
   return ResponseEntity.badRequest().build();
  }
  else {
  
 return ResponseEntity.of(payloadrepo.findById(t));}


}
@GetMapping(value = "load", params = "shipperid")
@ResponseBody
public ResponseEntity<List<payload>> getall(@RequestParam String shipperid) {
  
   try{
    List<payload> list=payloadrepo.findAllByshipperId(shipperid);
    return ResponseEntity.ok(list);
   }
   catch(Exception E){
    return ResponseEntity.of(Optional.of(null));
        
   }



}
@PutMapping("load")
public ResponseEntity<String> updatepayload(@RequestParam String loadid,@Validated @RequestBody payload p) {

   try{
      long t=Long.parseLong(loadid);
      payloadrepo.findById(t);
      payloadrepo.deleteById(t);
      payloadrepo.save(p);
      return new ResponseEntity<>("added", HttpStatus.OK);
      

   }
   catch(Exception e){
    return new ResponseEntity<>("Error", HttpStatus.OK);
   }
    
}


@DeleteMapping("load")
public ResponseEntity<String> Deleteload(@RequestParam String loadid) {

    
    long t=Long.parseLong(loadid);
    try{
        payloadrepo.findById(t);
        payloadrepo.deleteById(t);
       return new ResponseEntity<>("deleted", HttpStatus.BAD_REQUEST);
    }
    catch(Exception E){
       return new ResponseEntity<>("Error", HttpStatus.OK);
    }
   


}
}
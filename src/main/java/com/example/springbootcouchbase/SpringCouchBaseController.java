package com.example.springbootcouchbase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCouchBaseController {

  private SpringCouchBaseService springCouchBaseService;
   private SpringCouchBaseController(SpringCouchBaseService couchBaseService){
       this.springCouchBaseService=couchBaseService;
   }

    @GetMapping("/findall")
    public void findAll(){
        springCouchBaseService.findAll();
    }
}

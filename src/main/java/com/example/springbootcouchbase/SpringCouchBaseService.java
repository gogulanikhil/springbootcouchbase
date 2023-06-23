package com.example.springbootcouchbase;

import com.example.springbootcouchbase.BaseEntity;
import com.example.springbootcouchbase.SpringCouchBaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringCouchBaseService {

    private final SpringCouchBaseRepository springCouchBaseRepository;
    private SpringCouchBaseService(SpringCouchBaseRepository repository){
        this.springCouchBaseRepository=repository;
    }
    public List<BaseEntity> findAll(){
        return springCouchBaseRepository.findAll();
    }
}

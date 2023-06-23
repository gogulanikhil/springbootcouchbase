package com.example.springbootcouchbase;

import com.example.springbootcouchbase.BaseEntity;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringCouchBaseRepository extends CouchbaseRepository<BaseEntity ,String> {
}

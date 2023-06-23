package com.example.springbootcouchbase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity {
    String id;
    String name;
    String location;
    String role;
}

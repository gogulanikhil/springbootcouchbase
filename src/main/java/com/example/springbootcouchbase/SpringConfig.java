package com.example.springbootcouchbase;

import com.couchbase.client.core.env.SecurityConfig;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.ClusterOptions;
import com.couchbase.client.java.env.ClusterEnvironment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class SpringConfig {

        @Value("${spring.couchbase.connection-string}")
        private String connectionString;

        @Value("${spring.couchbase.username}")
        private String username;

        @Value("${spring.couchbase.password}")
        private String password;

        @Bean
        public Cluster couchbaseCluster() {
            ClusterEnvironment environment = ClusterEnvironment.builder()
                    .securityConfig(SecurityConfig.enableTls(true))
                    .build();

            return Cluster.connect(connectionString,
                    ClusterOptions.clusterOptions(username, password)
                            .environment(environment));
        }
    }


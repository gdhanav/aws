package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.endpoints.S3EndpointParams;
import software.amazon.awssdk.services.s3.endpoints.S3EndpointProvider;

@Configuration
public class AwsConfig {

    @Bean
    public S3Client s3Client() {

        return S3Client.builder()
                .endpointProvider(S3EndpointProvider.defaultProvider())
                .region(Region.AP_SOUTHEAST_2)
                .build();
    }

    @Bean
    public S3EndpointParams endpointParams() {
        return S3EndpointParams.builder()
                .endpoint("htt://localhost:4566")
                .region(Region.AP_SOUTHEAST_2)
                .build();
    }
}

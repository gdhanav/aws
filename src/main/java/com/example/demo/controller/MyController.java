package com.example.demo.controller;

import com.example.demo.config.AwsConfig;
import com.example.demo.model.S3BucketMetaData;
import com.example.demo.service.AwsS3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.services.s3.S3Client;

import java.util.List;

@RestController
@RequestMapping("/my-app")
public class MyController {

    @Autowired
    private AwsS3Service awsS3Service;
    @Autowired
    private S3Client s3Client;

    @GetMapping("/greet")
    public String greet() {
        return "Hello world!!";
    }

    @GetMapping("/list-bucket")
    public List<S3BucketMetaData> awsBuckets() {

        return  awsS3Service.listBucketObjects(s3Client, "test");
    }
}

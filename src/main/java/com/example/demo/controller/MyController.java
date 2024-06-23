package com.example.demo.controller;

import com.example.demo.service.AwsS3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.services.s3.S3Client;

@RestController
@RequestMapping("/my-app")
public class MyController {

    private AwsS3Service awsS3Service;

    private S3Client s3Client;

    @Autowired
    public MyController(AwsS3Service awsS3Service, S3Client s3Client) {
        this.awsS3Service = awsS3Service;
        this.s3Client = s3Client;
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello world!!";
    }

    @GetMapping("/list-bucket")
    public void awsBuckets() {

        awsS3Service.listBucket(s3Client);
    }
}

package com.example.homework_aws_hillel;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
@RequiredArgsConstructor
public class HomeworkAwsHillelApplication implements CommandLineRunner {
    private final AmazonS3 amazonS3;

    public static void main(String[] args) {
        SpringApplication.run(HomeworkAwsHillelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        amazonS3.putObject("folder123456", "test", new File("test.txt"));
        amazonS3.createBucket("folder654321");
    }
}

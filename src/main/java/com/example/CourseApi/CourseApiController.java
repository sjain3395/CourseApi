package com.example.CourseApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class CourseApiController {


        @RequestMapping("/course")
        public List<Course> getAllCourse(){
            return Arrays.asList(
                    new Course("Spring", "Spring Framework","Spring Framework Description"),
                    new Course("java", "Core Java", "Core Java Description"),
                    new Course("Angular","Angularjs","Angularjs Description")

            );

        }

    }


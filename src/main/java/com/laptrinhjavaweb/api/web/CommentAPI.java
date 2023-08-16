package com.laptrinhjavaweb.api.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentAPI {

    @PostMapping("/api/comments")
    public String getComments(@RequestBody String comment) {
        System.out.println(comment);
        return comment;
    }
}

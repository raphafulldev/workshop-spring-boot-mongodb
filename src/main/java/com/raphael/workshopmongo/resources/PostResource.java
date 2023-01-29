package com.raphael.workshopmongo.resources;

import com.raphael.workshopmongo.domain.Post;
import com.raphael.workshopmongo.domain.User;
import com.raphael.workshopmongo.dto.UserDTO;
import com.raphael.workshopmongo.services.PostService;
import com.raphael.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }



}
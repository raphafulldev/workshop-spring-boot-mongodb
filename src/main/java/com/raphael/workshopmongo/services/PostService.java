package com.raphael.workshopmongo.services;

import com.raphael.workshopmongo.domain.Post;
import com.raphael.workshopmongo.domain.User;
import com.raphael.workshopmongo.dto.UserDTO;
import com.raphael.workshopmongo.repositories.PostRepository;
import com.raphael.workshopmongo.repositories.UserRepository;
import com.raphael.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}

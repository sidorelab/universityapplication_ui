package com.softwareeng.universityapplication_ui.service.impl;

import com.softwareeng.universityapplication_ui.service.PostService;
import com.softwareeng.universityapplication_ui.service.ContentWrapper;
import com.softwareeng.universityapplication_ui.service.commentableAndLikeable.Post;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl extends BaseServiceImpl<Post, Long> implements PostService {
    public PostServiceImpl() {
        super(Post.class, Post[].class);
    }

    @Override
    public ResponseEntity<Void> addPost(ContentWrapper post) {
        return this.restCaller.postExchange(endpoint.getPost(), new HttpEntity<>(post), Void.class);
    }

    @Override
    public ResponseEntity<Post[]> postsToShowLoggedUser(int pageNumber) {
        return this.restCaller.getExchange(endpoint.getPostsToShowLoggedUser() + "/" + pageNumber, Post[].class);
    }
}

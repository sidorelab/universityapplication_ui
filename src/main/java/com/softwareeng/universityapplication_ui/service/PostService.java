package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.commentableAndLikeable.Post;
import org.springframework.http.ResponseEntity;

public interface PostService extends BaseService<Post, Long> {
    ResponseEntity<Void> addPost(ContentWrapper post);

    ResponseEntity<Post[]> postsToShowLoggedUser(int pageNumber);
}

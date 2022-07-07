package com.softwareeng.universityapplication_ui.service.impl;

import com.softwareeng.universityapplication_ui.service.CommentService;
import com.softwareeng.universityapplication_ui.service.ContentWrapper;
import com.softwareeng.universityapplication_ui.service.userInteractions.Comment;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment, Long> implements CommentService {
    public CommentServiceImpl() {
        super(Comment.class, Comment[].class);
    }

    @Override
    public ResponseEntity<Comment[]> getAllCommentsInAContent(Long idContent) {
        return restCaller.getExchange(endpoint.getCommentsOfAContent() + "/" + idContent, Comment[].class);
    }

    @Override
    public ResponseEntity<Void> addCommentInAContent(Long idContent, ContentWrapper contentWrapper) {
        return restCaller.postExchange(endpoint.getCommentsOfAContent() + "/" + idContent, new HttpEntity<>(contentWrapper), Void.class);
    }

    @Override
    public ResponseEntity<Boolean> findIfACommentIsAlreadyLiked(Long idComment) {
        return restCaller.getExchange(endpoint.getFindIfACommentIsAlreadyLiked() + "/" + idComment, Boolean.class);
    }


}

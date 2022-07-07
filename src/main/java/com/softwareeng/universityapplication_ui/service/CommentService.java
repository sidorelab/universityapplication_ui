package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.userInteractions.Comment;
import org.springframework.http.ResponseEntity;

public interface CommentService extends BaseService<Comment, Long> {

    ResponseEntity<Comment[]> getAllCommentsInAContent(Long idContent);

    ResponseEntity<Void> addCommentInAContent(Long idContent, ContentWrapper contentWrapper);

    ResponseEntity<Boolean> findIfACommentIsAlreadyLiked(Long idComment);
}

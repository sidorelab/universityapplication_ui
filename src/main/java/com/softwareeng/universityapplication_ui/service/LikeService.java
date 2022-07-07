package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.userInteractions.Like;
import org.springframework.http.ResponseEntity;

public interface LikeService extends BaseService<Like, Long> {
    ResponseEntity<Void> toggleLikeAComment(Long idComment);

    ResponseEntity<Like[]> getLikesOfAComment(Long idComment);

    ResponseEntity<Like[]> getLikesOfAContent(Long idContent);

    ResponseEntity<Boolean> findIfContentIsAlreadyLiked(Long idContent);

    ResponseEntity<Void> toggleLikeAContent(Long idContent);
}

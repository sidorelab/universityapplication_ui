package com.softwareeng.universityapplication_ui.service;

import org.springframework.http.ResponseEntity;

public interface FriendshipService extends BaseService<Friendship, Long> {

    ResponseEntity<Friendship> findIfFriendshipExists(Long idPossibleFriend);

    ResponseEntity<Void> sendFriendRequest(Long idRequestedTo);

    ResponseEntity<Void> acceptFriendRequest(Long idRequestedBy);

    ResponseEntity<Void> declineFriendRequest(Long idRequestedBy);

    ResponseEntity<Friendship[]> friendRequestsOfLoggedUser();
}

package com.softwareeng.universityapplication_ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/friendship")
public class FriendshipController {

    @Autowired
    private FriendshipService friendshipService;

    @ModelAttribute("friendRequests")
    public List<Friendship> friendships() {
        return Arrays.asList(this.friendshipService.friendRequestsOfLoggedUser().getBody());
    }

    @GetMapping("/friendRequests")
    public String friendRequests(Model model) {
        return "friendship/friendRequests";
    }
}

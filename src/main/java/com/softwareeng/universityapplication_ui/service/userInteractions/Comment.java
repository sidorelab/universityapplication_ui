package com.softwareeng.universityapplication_ui.service.userInteractions;

import com.softwareeng.universityapplication_ui.service.common.CommentableAndLikeable;
import com.softwareeng.universityapplication_ui.service.common.UserInteraction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Comment extends UserInteraction {
    private String content;

    private List<Like> likesOfComment;

    private CommentableAndLikeable commentedContent;
}

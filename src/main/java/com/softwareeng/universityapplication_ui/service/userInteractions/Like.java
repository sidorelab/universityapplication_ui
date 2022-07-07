package com.softwareeng.universityapplication_ui.service.userInteractions;

import com.softwareeng.universityapplication_ui.service.common.CommentableAndLikeable;
import com.softwareeng.universityapplication_ui.service.common.UserInteraction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Like extends UserInteraction {
    private Comment commentLiked;

    private CommentableAndLikeable likedContent;
}

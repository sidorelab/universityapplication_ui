package com.softwareeng.universityapplication_ui.service.commentableAndLikeable;

import com.softwareeng.universityapplication_ui.service.User;
import com.softwareeng.universityapplication_ui.service.common.CommentableAndLikeable;
import com.softwareeng.universityapplication_ui.service.userInteractions.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Post extends CommentableAndLikeable {
    private String content;

    private User postedBy;

    private Comment bornByComment;

    private Course bornByCourseEnrollment;
}

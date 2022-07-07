package com.softwareeng.universityapplication_ui.service.commentableAndLikeable;

import com.softwareeng.universityapplication_ui.service.common.CommentableAndLikeable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Announcment extends CommentableAndLikeable {
    private Course courseField;

    private String content;
}

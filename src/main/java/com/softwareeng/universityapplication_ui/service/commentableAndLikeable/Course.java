package com.softwareeng.universityapplication_ui.service.commentableAndLikeable;

import com.softwareeng.universityapplication_ui.service.Hall;
import com.softwareeng.universityapplication_ui.service.common.CommentableAndLikeable;
import com.softwareeng.universityapplication_ui.service.enums.CourseRepeatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Course extends CommentableAndLikeable {
    private String name;

    private String description;

    private Hall hall;

    private Date startDateTime;

    private int repeatCount;

    private CourseRepeatType repeatType;

}

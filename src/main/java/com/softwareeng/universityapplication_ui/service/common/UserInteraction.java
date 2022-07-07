package com.softwareeng.universityapplication_ui.service.common;

import com.softwareeng.universityapplication_ui.service.User;
import lombok.Data;

@Data
public abstract class UserInteraction extends BaseModel {
    private User interactedBy;
}

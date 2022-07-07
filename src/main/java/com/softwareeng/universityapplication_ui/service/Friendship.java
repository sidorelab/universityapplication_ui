package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.common.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Friendship extends BaseModel {
    private User requestedBy;
    private User requestedTo;
    private Boolean active;
}

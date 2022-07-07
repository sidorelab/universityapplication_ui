package com.softwareeng.universityapplication_ui.service.util;

import com.softwareeng.universityapplication_ui.service.User;

public interface AuthenticationFacade {
    User getAuthenticatedUser();

    String getToken();
}

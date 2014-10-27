package org.mial.secure.service;

import org.mial.secure.entity.User;

public interface UserService {

    User getUser(String login);
}

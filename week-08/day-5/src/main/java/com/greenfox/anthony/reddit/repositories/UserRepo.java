package com.greenfox.anthony.reddit.repositories;

import com.greenfox.anthony.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
}

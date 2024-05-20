package org.tutorials.springbootrestapiwithdto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tutorials.springbootrestapiwithdto.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

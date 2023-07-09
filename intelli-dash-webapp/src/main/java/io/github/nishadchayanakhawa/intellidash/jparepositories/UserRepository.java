package io.github.nishadchayanakhawa.intellidash.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.nishadchayanakhawa.intellidash.model.User;

public interface UserRepository extends JpaRepository<User,String>{
	public User findByUsername(String username);
}
package Main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Main.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

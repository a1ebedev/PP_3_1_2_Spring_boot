package ru.sashqa.PP_3_1_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sashqa.PP_3_1_2.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

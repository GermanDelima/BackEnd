package com.portfolio.jgd.jwt.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
  //metodo para requerrir metodo mas espesifico para buscar por username
  Optional<User> findByUsername(String username);


  @Modifying()
  @Query("update User u set u.firstname=:firstname, u.lastname=:lastname, u.profession=:profession where u.id = :id")
  void updateUser(@Param(value = "id") Integer id, @Param(value = "firstname") String firstname, @Param(value = "lastname") String lastname , @Param(value = "profession") String profession);
}

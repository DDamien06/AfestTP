package com.example.AfestTP.repositories;


import com.example.AfestTP.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

Users findByLogin(String login);

}

package mybudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mybudget.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{ }
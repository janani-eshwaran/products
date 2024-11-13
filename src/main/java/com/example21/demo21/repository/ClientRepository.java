package com.example21.demo21.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example21.demo21.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    public Client findByEmail(String email);

}

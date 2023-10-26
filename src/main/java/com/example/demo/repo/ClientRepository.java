package com.example.demo.repo;

import com.example.demo.models.ClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientInfo, Long> {
}

package com.finalprojectgroup4.users;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;
     String email;
     Integer phoneNumber;
     String password;
     String nickName;
     String fullName;
     String createdAt;
     String updatedAt;
}

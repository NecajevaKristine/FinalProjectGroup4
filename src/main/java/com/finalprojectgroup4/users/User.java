package com.finalprojectgroup4.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityScan
public class User {
    @Id
    private Long id;
    private String email;
    private Integer phoneNumber;
    private String password;
    private String nickName;
    private String fullName;
    private String createdAt;
    private String updatedAt;
}

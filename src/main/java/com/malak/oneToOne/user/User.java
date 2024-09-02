package com.malak.oneToOne.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document // to be persisted in mongodb DB
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
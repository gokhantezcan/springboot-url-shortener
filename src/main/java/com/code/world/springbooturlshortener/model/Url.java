package com.code.world.springbooturlshortener.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.LocalDateTime;

@Data
@Entity
@ToString
public class Url {

    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private String orinigalUrl;
    private String shortLink;
    private LocalDateTime creationDate;
    private LocalDateTime expirationDate;
}

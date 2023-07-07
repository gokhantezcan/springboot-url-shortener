package com.code.world.springbooturlshortener.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UrlDto {
    private String url;
    private String expirationDate;
}

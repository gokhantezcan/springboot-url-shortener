package com.code.world.springbooturlshortener.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UrlErrorResponseDto {
    private String status;
    private String error;
}

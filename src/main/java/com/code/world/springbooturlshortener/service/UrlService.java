package com.code.world.springbooturlshortener.service;

import com.code.world.springbooturlshortener.model.Url;
import com.code.world.springbooturlshortener.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public void deleteShortLink(Url url);
}

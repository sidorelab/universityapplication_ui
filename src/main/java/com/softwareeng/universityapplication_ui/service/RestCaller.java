package com.softwareeng.universityapplication_ui.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public interface RestCaller {
    <T> ResponseEntity<T> getExchange(String url,
                                      Class<T> responseType);

    <T, K> ResponseEntity<T> postExchange(String url, HttpEntity<K> requestEntity,
                                          Class<T> responseType);

    ResponseEntity<Void> deleteExchange(String url);

    <T, K> ResponseEntity<T> putExchange(String url, HttpEntity<K> requestEntity,
                                         Class<T> responseType);
}

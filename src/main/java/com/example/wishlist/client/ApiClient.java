package com.example.wishlist.client;

import com.example.wishlist.model.in.WishListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
@Slf4j
public class ApiClient {

    @Value("${bc.header.key}")
    private String authKey;
    @Value("${bc.header.value}")
    private String authValue;

    @Value("${bc.url}")
    private String bcUrl;
    private final WebClient webClient;
    public WishListDto getAllWishlist(){

        log.info("BC url to be called is {}", bcUrl);
        return webClient.get()
                .uri(bcUrl).header(authKey,authValue)
                .retrieve()
                .bodyToMono(WishListDto.class)
                .block();
    }
}

package com.example.wishlist.client;

import com.example.wishlist.model.in.OrceToken;
import com.example.wishlist.model.in.WishListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
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

    @Value("${orce.idcs.url}")
    private String idcsOrceUrl;

    @Value("${orce.idcs.token}")
    private String idcsOrceToken;

    private final WebClient webClient;
    public WishListDto getAllWishlist(){

        log.info("BC url to be called is {}", bcUrl);
        return webClient.get()
                .uri(bcUrl).header(authKey,authValue)
                .retrieve()
                .bodyToMono(WishListDto.class)
                .block();
    }

    public OrceToken getOrceToken(){

        log.info("url to be called is {}", idcsOrceUrl);
        String authValue = "Basic "+idcsOrceToken;
        return webClient.post()
                .uri(idcsOrceUrl)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .header("Authorization",authValue)
                .body(BodyInserters.fromFormData(prepareBody()))
                .retrieve()
                .bodyToMono(OrceToken.class)
                .block();
    }
    private MultiValueMap<String,String> prepareBody() {
        var formData = new LinkedMultiValueMap<String,String>();
        formData.add("grant_type","client_credentials");
        formData.add("scope","urn:opc:idm:__myscopes__");
        return formData;
    }
}

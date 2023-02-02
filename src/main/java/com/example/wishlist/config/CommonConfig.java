package com.example.wishlist.config;

import com.example.wishlist.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class CommonConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public WebClient getWebClient(){ return WebClient.builder().build();}
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        //marshaller.setContextPath("com.example.wishlist.customer.v3_1");
        marshaller.setPackagesToScan("com.example.wishlist.customer.v3_1");
        return marshaller;
    }
    @Bean
    public SoapClient soapClient(Jaxb2Marshaller marshaller){
        SoapClient soapClient = new SoapClient();
        soapClient.setMarshaller(marshaller);
        soapClient.setUnmarshaller(marshaller);
        return  soapClient;
    }
}

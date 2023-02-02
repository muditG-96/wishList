package com.example.wishlist.client;

import com.example.wishlist.customer.v3_1.AddWishlistItems;
import com.example.wishlist.customer.v3_1.AddWishlistItemsResponse;
import com.example.wishlist.customer.v3_1.WishlistItemRequestType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.bind.JAXBElement;
import javax.xml.soap.MimeHeaders;

@Slf4j
@RequiredArgsConstructor
public class SoapClient extends WebServiceGatewaySupport {

    @Value("${orce.url}")
    private String orceUrl;
    public AddWishlistItemsResponse addWishListItem (String token){

        AddWishlistItems addWishlistItems = new AddWishlistItems();
        WishlistItemRequestType wishlistItemRequestType = new WishlistItemRequestType();
        wishlistItemRequestType.setCustomerID("5");
        addWishlistItems.setWishlistData(wishlistItemRequestType);
        addWishlistItems.setSecurityUserId("RGBU_CECS_ELVAWCBUV_APPID");
        JAXBElement<AddWishlistItemsResponse> response = (JAXBElement<AddWishlistItemsResponse>)
                getWebServiceTemplate().marshalSendAndReceive(orceUrl, addWishlistItems, getMessageCallback(token));

    return response.getValue();
    }

    private static WebServiceMessageCallback getMessageCallback(String token){

        return (WebServiceMessage message) -> {
            SaajSoapMessage soapMessage = (SaajSoapMessage) message;
            MimeHeaders mimeHeader = soapMessage.getSaajMessage().getMimeHeaders();
            mimeHeader.setHeader("Authorization", "Bearer "+token);
        };
    }
}

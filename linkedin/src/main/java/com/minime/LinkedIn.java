package com.minime;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.LinkedInApi;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.scribe.builder.*;

public class LinkedIn {

    private static final String PROTECTED_RESOURCE_URL = "http://api.linkedin.com/v1/people/~/connections:(id,last-name)";

    private static String API_KEY = "h27dn3l50r49";
    private static String API_SECRET = "i7VnGeVhBDQSM3OJ";

    public String getLinked(){

        return "You are Linked!";

//        OAuthService service = getService();
//
//        Token requestToken = service.getRequestToken();
//
//        System.out.println(service.getAuthorizationUrl(requestToken));
//        String lURL = service.getAuthorizationUrl(requestToken);
//        return lURL;

        
//        Token accessToken = service.getAccessToken(requestToken,null);
//
//        String url = "http://api.linkedin.com/v1/people/~";
//        String url = "http://api.linkedin.com/v1/people/~";
//        OAuthRequest request = new OAuthRequest(Verb.GET, url);
//        service.signRequest(accessToken, request);
//        Response response = request.send();
//        System.out.println(response.getBody());


    }

    private OAuthService getService() {
        return new ServiceBuilder().provider(LinkedInApi.class).
                apiKey(API_KEY).apiSecret(API_SECRET).
                callback("evening-wind-4466.herokuapp.com/getProfile").
                build();
    }
}

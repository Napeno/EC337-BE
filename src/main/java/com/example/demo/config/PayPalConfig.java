package com.example.demo.config;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class PayPalConfig {

    @Value("${paypal.client.id}")
    private String clientId;

    @Value("${paypal.client.secret}")
    private String clientSecret;

    @Value("${paypal.mode}")
    private String mode;

    @Bean
    public APIContext apiContext() throws PayPalRESTException {
        Map<String, String> configMap = new HashMap<>();
        configMap.put("mode", mode);
        configMap.put("service.EndPoint", mode.equals("live")
                ? "https://api-m.paypal.com"
                : "https://api-m.sandbox.paypal.com");

        OAuthTokenCredential tokenCredential = new OAuthTokenCredential(clientId, clientSecret, configMap);
        String accessToken = tokenCredential.getAccessToken();

        APIContext apiContext = new APIContext(accessToken);
        apiContext.setConfigurationMap(configMap);
        return apiContext;
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

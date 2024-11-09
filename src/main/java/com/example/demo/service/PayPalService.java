package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class PayPalService {

    @Value("${paypal.client.id}")
    private String clientId;

    @Value("${paypal.client.secret}")
    private String clientSecret;

    @Value("${paypal.mode}")
    private String mode;

    @Value("${paypal.api.url}")
    private String paypalApiUrl;

    private final RestTemplate restTemplate;

//    private final InvoiceRepository invoiceRepository;

    private final String PAYPAL_OAUTH_URL = "https://api.sandbox.paypal.com/v1/oauth2/token";

    public PayPalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
//        this.invoiceRepository = invoiceRepository;
    }

    public String getAccessToken() {
        RestTemplate restTemplate = new RestTemplate();

        String auth = clientId + ":" + clientSecret;
        String base64Auth = new String(java.util.Base64.getEncoder().encode(auth.getBytes()));

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("grant_type", "client_credentials");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + base64Auth);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);

        // Gửi yêu cầu POST đến PayPal
        try {
            ResponseEntity<String> response = restTemplate.exchange(PAYPAL_OAUTH_URL, HttpMethod.POST, entity, String.class);
            return response.getBody(); // Trả về dữ liệu JSON chứa access_token
        } catch (Exception e) {
            throw new RuntimeException("Error fetching access token from PayPal: " + e.getMessage(), e);
        }
    }

//    public InvoiceRequestModel createInvoice(InvoiceRequestModel invoiceRequestModel, String bearerToken) {
//
//        String url = paypalApiUrl + "/v2/invoicing/invoices"; // PayPal API endpoint
//
//        // Create headers
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer " + bearerToken);
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("Prefer", "return=representation");
//
//        // Wrap request body in HttpEntity
//        HttpEntity<InvoiceRequestModel> requestEntity = new HttpEntity<>(invoiceRequestModel, headers);
//
//        // Send POST request
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
//
//        // For the sake of example, assuming PayPal returns invoice data in a specific format
//        // Save to DB (you can adapt this based on actual response structure)
//        invoiceRepository.save(invoiceRequestModel);
//
//        return invoiceRequestModel;  // You may modify this based on actual response from PayPal
//    }

//    public String createInvoice(InvoiceRequestModel invoiceRequest) throws PayPalRESTException {
//        // Get PayPal access token
//        Map<String, String> configMap = new HashMap<>();
//        configMap.put("mode", mode);
//        OAuthTokenCredential tokenCredential = new OAuthTokenCredential(clientId, clientSecret, configMap);
//        String accessToken = null;
//        try {
//            accessToken = tokenCredential.getAccessToken();
//        } catch (PayPalRESTException e) {
//            throw new RuntimeException(e);
//        }
//
//        // Initialize PayPal APIContext
//        APIContext apiContext = new APIContext(accessToken);
//        apiContext.setConfigurationMap(configMap);
//
//        // Make the API call to PayPal
//        String url = "https://api-m.sandbox.paypal.com/v2/invoicing/invoices";
//        String requestJson = convertInvoiceRequestToJson(invoiceRequest); // convert your object to JSON
//
//        // Call PayPal API
//        String response = PayPalResource.post(url, requestJson, apiContext);
//        return response;
//    }
//
//    private String convertInvoiceRequestToJson(InvoiceRequestModel invoiceRequest) {
//        try {
//            // Use Jackson's ObjectMapper to convert InvoiceRequest to JSON
//            ObjectMapper objectMapper = new ObjectMapper();
//            return objectMapper.writeValueAsString(invoiceRequest);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}


package com.example.Backend.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AlertaServicie {

    private final RestTemplate restTemplate;

    public AlertaServicie(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void enviarAlerta(List<String> alertas) {
        if (!alertas.isEmpty()) {
            String alertaMensaje = String.join(", ", alertas);
            String url = "http://localhost:7072/publish/alerta";
            
            ResponseEntity<String> response = restTemplate.postForEntity(url, alertaMensaje, String.class);
            
            System.out.println("Alerta enviada: " + alertaMensaje + " - Respuesta: " + response.getStatusCode());
        }
    }
    
}

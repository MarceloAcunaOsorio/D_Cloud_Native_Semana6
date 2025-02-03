package com.example.Backend.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class IndicadorService {

    private final AlertaServicie alertaService;

    public IndicadorService(AlertaServicie alertaService) {
        this.alertaService = alertaService;
    }

    public List<String> getAlertasMedicas(double presionSistolica, double presionDiastolica, double oxigeno, double FrecuenciaCardiaca, double temperatura, double glucosa) {
        List<String> alertas = new ArrayList<>();

        if (presionSistolica < 90 || presionDiastolica < 60) {
            alertas.add("Hipotensión detectada");
        } else if (presionSistolica > 140 || presionDiastolica > 90) {
            alertas.add("Hipertensión detectada");
        }

        if (oxigeno < 90) {
            alertas.add("Niveles de oxígeno críticos");
        } else if (oxigeno < 95) {
            alertas.add("Niveles de oxígeno bajos");
        }

        if (FrecuenciaCardiaca < 60) {
            alertas.add("Bradicardia detectada");
        } else if (FrecuenciaCardiaca > 100) {
            alertas.add("Taquicardia detectada");
        }

        if (temperatura < 35) {
            alertas.add("Hipotermia detectada");
        } else if (temperatura > 38) {
            alertas.add("Fiebre detectada");
        }

        if (glucosa < 70) {
            alertas.add("Hipoglucemia detectada");
        } else if (glucosa > 180) {
            alertas.add("Hiperglucemia detectada");
        }

        // Enviar alerta si hay valores fuera de lo normal
        alertaService.enviarAlerta(alertas);

        return alertas;
    }
    
}

package com.rabbitmq.rabbit_publisher.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RabbitMQMessage {

    private String Nombre;
    private String Descripcion;
    
}


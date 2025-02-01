
CREATE TABLE Paciente (
            rut VARCHAR2(12) PRIMARY KEY ,
            Nombre VARCHAR2(100) NOT NULL,
            Apellido VARCHAR2(100) NOT NULL,
            Edad NUMBER(3) NOT NULL,
            Habitacion VARCHAR2(50) NOT NULL,
            Condicion VARCHAR2(255) 
        );

CREATE TABLE HistorialMedico (
            id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
            rut VARCHAR2(12),
            FrecuenciaCardiaca NUMBER(10,2),
            Oxigeno NUMBER(10,2),
            PresionSistolica NUMBER(10,2),
            PresionDiastolica NUMBER(10,2),
            PresionArterial NUMBER(10,2),
            Temperatura NUMBER(10,2),
            Observaciones VARCHAR2(255),
            Detalle VARCHAR2(255),
            UltimoControl TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
            UltimaActualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
            CONSTRAINT fk_historial_paciente FOREIGN KEY (rut) REFERENCES Paciente(rut) ON DELETE CASCADE
        );

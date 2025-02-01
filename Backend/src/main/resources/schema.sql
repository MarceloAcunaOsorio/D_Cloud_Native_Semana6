CREATE TABLE Paciente (
    rut VARCHAR2(12) PRIMARY KEY,
    Nombre VARCHAR2(255),
    Apellido VARCHAR2(255),
    Edad NUMBER(3),
    Habitacion VARCHAR2(50),
    Condicion VARCHAR2(255)
);

CREATE TABLE HistorialMedico (
    rut VARCHAR2(12),
    FrecuenciaCardiaca NUMBER(10,2),
    Oxigeno NUMBER(10,2),
    PresionSistolica NUMBER(10,2),
    PresionDiastolica NUMBER(10,2),
    PresionArterial NUMBER(10,2),
    Temperatura NUMBER(10,2),
    Observaciones VARCHAR2(255),
    Detalle VARCHAR2(255),
    UltimoControl TIMESTAMP,
    UltimaActualizacion TIMESTAMP,
    FOREIGN KEY (rut) REFERENCES Paciente(rut)
);
DROP DATABASE IF EXISTS gestorlibros; 

CREATE DATABASE gestorlibros;

\c gestorlibros

CREATE TABLE usuario (
    id_usuario SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    contrasena VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    numero_telefono BIGINT
);

CREATE TABLE libro (
    id_libro SERIAL PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    autor VARCHAR(50) NOT NULL,
    ano_publicacion INT NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    cantidad_disponible INT NOT NULL
);


CREATE TABLE prestamo (
    id_prestamo SERIAL PRIMARY KEY,
    id_libro INT REFERENCES Libro(id_libro),
    id_usuario INT REFERENCES Usuario(id_usuario),
    fecha_prestamo DATE NOT NULL,
    fecha_devolucion DATE NOT NULL CHECK (fecha_devolucion>fecha_prestamo)
);


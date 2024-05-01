DROP DATABASE IF EXISTS gestor_Libros;

CREATE DATABASE gestor_Libros;

CREATE TABLE Usuario (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    numeroTelefono BIGINT NOT NULL
);

CREATE TABLE Libro (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(50) NOT NULL,
    autor VARCHAR(50) NOT NULL,
    anoPublicacion INT NOT NULL,
    cantidadDisponible INT NOT NULL
);


CREATE TABLE Prestamo(
    id SERIAL PRIMARY KEY,
    idLibro INT NOT NULL,
    idUsuario INT NOT NULL,
    fechaPrestamo DATE NOT NULL,
    fechaDevolucion DATE NOT NULL,
    FOREIGN KEY (idLibro) REFERENCES Libro(id),
    FOREIGN KEY (idUsuario) REFERENCES Usuario(id)
);
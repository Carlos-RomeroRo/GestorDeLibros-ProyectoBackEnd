--CREATE TABLE Usuario (
--    id SERIAL PRIMARY KEY,
--    nombre VARCHAR(50) NOT NULL,
--    email VARCHAR(50) NOT NULL,
--    numeroTelefono BIGINT NOT NULL
--);

INSERT INTO Usuario(nombre, email, numeroTelefono)VALUES('Carlos Romero', 'CarRR@example.com', 3114557899),
('Pedro Anaya', 'PedAn@eEXTINC.com', 3214212112),('Ana Barbosa', 'BBosa@eEXTINC.com', 3144559908),
('Maria Granados', 'MGra@pink.com', 3254456789),('Luisa Gutierrez', 'LGut@eEXTINC.com', 3224456789);

--CREATE TABLE Libro (
--  id SERIAL PRIMARY KEY,
--    titulo VARCHAR(50) NOT NULL,
--    autor VARCHAR(50) NOT NULL,
--    anoPublicacion INT NOT NULL,
--    cantidadDisponible INT NOT NULL
--);

INSERT INTO Libro(titulo, autor, anoPublicacion, cantidadDisponible) VALUES
('El Principito', 'Antoine de Saint-Exupéry', 1943, 5),
('La Guerra de los Mundos', 'Lev Nikolayevich Tolstoy', 1869, 10),
('Harry Potter I', 'J.K. Rowling', 1997, 7),
('Cien años de soledad','Gabriel García Marquez', 1967, 4),
('El Alquimista', 'Paulo Coelho', 1988, 3);


--CREATE TABLE Prestamo(
--    id SERIAL PRIMARY KEY,
--    idLibro INT NOT NULL,
--    idUsuario INT NOT NULL,
--    fechaPrestamo DATE NOT NULL,
--    fechaDevolucion DATE NOT NULL,
--    FOREIGN KEY (idLibro) REFERENCES Libro(id),
--    FOREIGN KEY (idUsuario) REFERENCES Usuario(id)
--);


INSERT INTO Prestamo(idUsuario, idLibro, fechaPrestamo, fechaDevolucion) VALUES
(1, 1, '2023-04-09', '2023-04-12'),
(2, 2, '2024-01-11', '2024-01-22'),
(3, 3, '2022-10-01', '2022-10-05');

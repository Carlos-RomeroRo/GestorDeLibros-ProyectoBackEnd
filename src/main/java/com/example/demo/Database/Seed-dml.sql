INSERT INTO Usuario(nombre, email, numero_telefono)VALUES('Carlos Romero', 'CarRR@example.com', 3114557899),
('Pedro Anaya', 'PedAn@eEXTINC.com', 3214212112),('Ana Barbosa', 'BBosa@eEXTINC.com', 3144559908),
('Maria Granados', 'MGra@pink.com', 3254456789),('Luisa Gutierrez', 'LGut@eEXTINC.com', 3224456789);

INSERT INTO Libro(titulo, autor, ano_publicacion, cantidad_disponible) VALUES
('El Principito', 'Antoine de Saint-Exupéry', 1943, 5),
('La Guerra de los Mundos', 'Lev Nikolayevich Tolstoy', 1869, 10),
('Harry Potter I', 'J.K. Rowling', 1997, 7),
('Cien años de soledad','Gabriel García Marquez', 1967, 4),
('El Alquimista', 'Paulo Coelho', 1988, 3);

INSERT INTO Prestamo(id_usuario, id_libro, fecha_prestamo, fecha_devolucion) VALUES
(1, 1, '2023-04-09', '2023-04-12'),
(2, 2, '2024-01-11', '2024-01-22'),
(3, 3, '2022-10-01', '2022-10-05');

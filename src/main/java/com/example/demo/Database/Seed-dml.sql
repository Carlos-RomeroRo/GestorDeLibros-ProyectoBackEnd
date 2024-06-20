INSERT INTO Usuario(nombre, apellido, contrasena, email, numero_telefono) 
VALUES 
('Carlos', 'Romero', 'pass123', 'CarRR@example.com', 3114557899),
('Pedro', 'Anaya', 'pass456', 'PedAn@eEXTINC.com', 3214212112),
('Ana', 'Barbosa', 'pass789', 'BBosa@eEXTINC.com', 3144559908),
('Maria', 'Granados', 'pass101', 'MGra@pink.com', 3254456789),
('Luisa', 'Gutierrez', 'pass202', 'LGut@eEXTINC.com', 3224456789);


INSERT INTO Libro(titulo, autor, ano_publicacion, descripcion, cantidad_disponible) 
VALUES
('El Principito', 'Antoine de Saint-Exupéry', 1943, 'Una obra clásica que narra la historia de un niño y sus aventuras a través del universo.', 5),
('La Guerra de los Mundos', 'H.G. Wells', 1898, 'Una novela de ciencia ficción sobre una invasión alienígena a la Tierra.', 10),
('Harry Potter I', 'J.K. Rowling', 1997, 'El inicio de la serie mágica de Harry Potter, donde descubre su identidad como mago.', 7),
('Cien años de soledad', 'Gabriel García Márquez', 1967, 'Una obra maestra del realismo mágico que sigue la historia de la familia Buendía.', 4),
('El Alquimista', 'Paulo Coelho', 1988, 'Una novela filosófica sobre un joven pastor en busca de su leyenda personal.', 3);


INSERT INTO Prestamo(id_usuario, id_libro, fecha_prestamo, fecha_devolucion) VALUES
(1, 1, '2023-04-09', '2023-04-12'),
(2, 2, '2024-01-11', '2024-01-22'),
(3, 3, '2022-10-01', '2022-10-05');



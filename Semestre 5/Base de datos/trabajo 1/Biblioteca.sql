CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE `usuario` (
  `id_usuario` int(100) PRIMARY KEY,
  `nombre_usuario` varchar(40),
  `telefono_usuario` int(10) ,
  `documento_usuario` int(15) 
); 

CREATE TABLE prestamo (
  `id_prestamo` int(100) PRIMARY KEY,
  `id_usuario` int(100),
  `fecha_prestamo` date ,
  `fecha_entrega` date ,
  `fecha_limite` date ,
  `cantidad_libros` int(10),
    FOREIGN key (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE `autor` (
  `id_autor` int(100) PRIMARY KEY,
  `nombre_autor` varchar(50),
  `pais_autor` varchar(30),
  `año` int(5) 
);

CREATE TABLE `libro` (
   id_libro int(100) PRIMARY KEY,  
  `id_prestamo` int(100),
  `id_autor` int(100),
  `nombre_libro` varchar(50),
  `editorial_libro` varchar(50),
  `disponible_libro` bit(1),
   FOREIGN KEY (id_prestamo) REFERENCES prestamo(id_prestamo),
   FOREIGN KEY (id_autor) REFERENCES autor(id_autor)
);



CREATE TABLE `multa` (
   id_multa int(100) PRIMARY KEY,  
  `id_usuario` int(100),
  `dias_retraso` date,
  `libro_posecion` int(10),
  `valor` int(6),
    
   FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);


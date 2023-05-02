CREATE DATABASE red_social;
USE red_social;


CREATE TABLE usuario(
	id_usuario int(100) PRIMARY KEY,
    nombre_usuario varchar(50),
    correo_usuario varchar(120),
    fecha_nacimiento_usuario date,
    ultima_conexion_usuario date
);

create table comentario(
	id_comentario int(100) PRIMARY KEY,
    id_usuario int(100),
    fecha date,
    archivo blob,
    descripcion varchar(400),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)    
);

create table publicacion(
	id_publicacion int(100) PRIMARY KEY,
    id_usuario int(100),
    id_comentario int(100),
	descripcion varchar(500),
    imagen blob,
    fecha date,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN key (id_comentario) REFERENCES comentario(id_comentario)
);

CREATE TABLE amigo(
	id_amigo int(100) PRIMARY KEY,
    nombre_amigo varchar(50),
    estado bit,
    fecha date
);

create table usuario_amigo(
	id_usuario_amigo int(100) PRIMARY KEY,
    id_usuario int(100),
    id_amigo int(100),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN key (id_amigo) REFERENCES amigo(id_amigo)
);
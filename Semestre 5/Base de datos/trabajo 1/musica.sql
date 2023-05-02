CREATE DATABASE musica;
use musica;

CREATE TABLE album(
	id_album int(100) PRIMARY KEY,
    nombre varchar(50),
    Fecha_creacion varchar(40)
);

CREATE TABLE artista(
	id_artista int(100) PRIMARY KEY,
    nombre varchar(50),
    descipcion varchar(40)
);

CREATE TABLE cancion(
    id_cancion int(100) PRIMARY KEY,
    id_album int(100),
    id_artista int(100),
    nombre varchar(30),
	duracion varchar(10),
    genero varchar(10),
    FOREIGN key (id_album) REFERENCES album(id_album),
    FOREIGN key (id_artista) REFERENCES artista(id_artista)
);


CREATE TABLE lista_reproducion(
    id_cancion int(100),
	id_lis_reproduccion int(100) PRIMARY key,
    nombre varchar(20),
    descripcion varchar(200),
    FOREIGN KEY(id_cancion) REFERENCES cancion(id_cancion)
);

CREATE TABLE usuario(
	id_usuario int(100) PRIMARY KEY,
    id_lis_reproduccion int(100),
    nombre varchar(56),
    usuario varchar(20),
    contraseña blob,
    FOREIGN KEY(id_lis_reproduccion) REFERENCES lista_reproducion(id_lis_reproduccion)
);


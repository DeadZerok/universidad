CREATE DATABASE tienda;
USE tienda;

CREATE TABLE cliente(
	id_cliente int(100) PRIMARY KEY,
    nombre_cliente varchar(30),
    apellido_cliente varchar(30),
    correo_cliente varchar(100),
    telefono int(12)
);
CREATE TABLE pedido(
	id_pedido int(100) PRIMARY KEY,
    id_cliente int(100),
    fecha_pedido date,
    estado_pedido bit,
    valor_pedido int(10),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);
CREATE TABLE pago(
    id_pago int(100) PRIMARY KEY,
    id_pedido int(100),
    fecha date,
	descripccion varchar(50),
    FOREIGN key (id_pedido) REFERENCES pedido(id_pedido)
);
create table producto(
	id_producto int(100) PRIMARY KEY,
    nombre_producto varchar(50),
    descripcion varchar(100),
    cantida_disponible int(100),
    precio int(10)
);
CREATE TABLE producto_pedido(
	id_producto_pedido int(100) PRIMARY KEY,
    id_pedido int(100),
    id_producto int(100), 
    FOREIGN KEY (id_pedido) REFERENCES pedido(id_pedido),
    FOREIGN key (id_producto) REFERENCES producto(id_producto)
    
);
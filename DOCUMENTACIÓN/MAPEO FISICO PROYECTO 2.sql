CREATE DATABASE DAILYBUGLE;
USE DAILYBUGLE;

CREATE TABLE Costo_Diario (
	Id_Costo_Diario INT AUTO_INCREMENT NOT NULL,
    Nombre_Revista_Costo_Diario VARCHAR(100) NOT NULL,
    Monto DOUBLE NOT NULL,
    Fecha_Modificación DATE NOT NULL,
    CONSTRAINT PK_costo_diario PRIMARY KEY (Id_Costo_Diario),
    CONSTRAINT FK_nombre_revista_costo_diario FOREIGN KEY (Nombre_Revista_Costo_Diario) REFERENCES Revista(Nombre_Revista)
    );
    
    CREATE TABLE Comentario (
	Id_Comentario INT AUTO_INCREMENT NOT NULL,
    Nombre_Revista_Comentario VARCHAR(100) NOT NULL,
    Suscriptor VARCHAR(100) NOT NULL,
    Fecha_Comentario DATE NOT NULL,
    Contenido VARCHAR(500) NOT NULL,
    CONSTRAINT PK_comentario PRIMARY KEY (Id_Comentario),
	CONSTRAINT FK_nombre_revista_comentario FOREIGN KEY (Nombre_Revista_Comentario) REFERENCES Revista(Nombre_Revista),
	CONSTRAINT FK_suscriptor FOREIGN KEY (Suscriptor) REFERENCES Suscriptor(Usuario)
    );
    
	CREATE TABLE Pago (
	Id_Pago INT AUTO_INCREMENT NOT NULL,
    Nombre_Revista_Pago VARCHAR(100) NOT NULL,
    Nombre_Suscriptor_Pago VARCHAR(100) NOT NULL,
    Monto DOUBLE NOT NULL,
    Fecha_Pago DATE NOT NULL,
    CONSTRAINT PK_pago PRIMARY KEY (Id_Pago),
    CONSTRAINT FK_nombre_revista_pago FOREIGN KEY (Nombre_Revista_Pago) REFERENCES Revista(Nombre_Revista),
	CONSTRAINT FK_nombre_suscriptor_pago FOREIGN KEY (Nombre_Suscriptor_Pago) REFERENCES Suscriptor(Usuario)
    );
    
	CREATE TABLE Numero_De_Revista (
	Id_Numero_Revista INT AUTO_INCREMENT NOT NULL,
    Nombre_Revista_Numero VARCHAR(100) NOT NULL,
    Nombre_Numero VARCHAR(100) NOT NULL,
    Fecha_Carga DATE NOT NULL,
    Archivo MEDIUMBLOB NOT NULL,
    CONSTRAINT PK_numero_de_revista PRIMARY KEY (Id_Numero_Revista),
	CONSTRAINT FK_nombre_revista_numero FOREIGN KEY (Nombre_Revista_Numero) REFERENCES Revista(Nombre_Revista)
    );
    
	CREATE TABLE Suscriptor (
	Id_Suscriptor INT AUTO_INCREMENT NOT NULL,
    Nombre_Revista_Suscripcion VARCHAR(100) NOT NULL,
    Usuario VARCHAR(100) NOT NULL,
    Solvente BOOLEAN NOT NULL,
    Fecha_Suscripcion DATE NOT NULL,
    CONSTRAINT PK_suscriptor PRIMARY KEY (Id_Suscriptor),
	CONSTRAINT FK_nombre_revista_suscripcion FOREIGN KEY (Nombre_Revista_Suscripcion) REFERENCES Revista(Nombre_Revista),
    CONSTRAINT FK_usuario FOREIGN KEY (Usuario) REFERENCES Usuario(Miembro)
    );
    
    CREATE TABLE Anuncio (
	Id_Anuncio INT AUTO_INCREMENT NOT NULL,
    Nombre_Anunciante VARCHAR(100) NOT NULL, 
    Tipo VARCHAR(1) NOT NULL,
    Costo_Anuncio DOUBLE NOT NULL,
    Tiempo_Visualizacion INT NOT NULL,
    Etiquetas VARCHAR(500),
    Fecha_Carga DATE NOT NULL,
    Archivo MEDIUMBLOB NOT NULL,
    CONSTRAINT PK_anuncio PRIMARY KEY (Id_Anuncio)
    );
    
	CREATE TABLE Miembro (
	Nombre_Miembro VARCHAR(100) NOT NULL,
    Descripcion_Miembro VARCHAR(250) NOT NULL,
    Contraseña VARCHAR(15) NOT NULL,
    Tipo VARCHAR(1) NOT NULL,
    Cantidad_Capital DOUBLE NOT NULL,
    CONSTRAINT PK_miembro PRIMARY KEY (Nombre_Miembro)
    );
    
	CREATE TABLE Usuario (
	Id_Usuario VARCHAR(100) NOT NULL,
    Miembro VARCHAR(100) NOT NULL,
	Etiquetas VARCHAR(500),
    Categoria VARCHAR(100), 
    CONSTRAINT PK_usuario PRIMARY KEY (Miembro),
	CONSTRAINT FK_miembro FOREIGN KEY (Miembro) REFERENCES Miembro(Nombre_Miembro)
    );
    
	CREATE TABLE Revista (
	Nombre_Revista VARCHAR(100) NOT NULL,
    Nombre_Editor VARCHAR(100) NOT NULL,
    Descripcion VARCHAR(250) NOT NULL,
    Fecha_Creacion DATE NOT NULL,
    Etiquetas VARCHAR(500),
    Categoria VARCHAR(100),
    Costo_Suscripcion_Mensual DOUBLE NOT NULL,
    Cantidad_Me_Gusta INT NOT NULL,
    CONSTRAINT PK_revista PRIMARY KEY (Nombre_Revista),
    CONSTRAINT FK_nombre_editor FOREIGN KEY (Nombre_Editor) REFERENCES Miembro(Nombre_Miembro)
    );
    

    
    
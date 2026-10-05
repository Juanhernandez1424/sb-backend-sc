package com.org.sc.models.usuario;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idUsuario;
    public String nombreUsuario;
    public String apellidoUsuario;
    public String correoUsuario;
    public String telefonoUsuario;
    public String direccionUsuario;
    public String emailUsuario;
}

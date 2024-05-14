package com.ipn.mx.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Donador")
public class Donador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDonador;

    @NotBlank(message = "El nombre del donador no puede estar vacío")
    @Size(min = 4, max = 150, message = "El nombre de la categoría debe tener entre 4 y 150 caracteres")
    @Column(name = "nombreCategoria", length = 50, nullable = false)
    private String nombreDonador;

    @NotBlank(message = "El telefono del donador no puede estar vacío")
    @Column(name = "descripcionCategoria", length = 100, nullable = false)
    private int TelefonoDonador;

    @NotBlank(message = "El correo del donador no puede estar vacío")
    @Size(min = 4, max = 100, message = "El correo del donador debe tener entre 4 y 100 caracteres")
    @Column(name = "correoDonador", length = 100, nullable = false)
    private String correoDonador;

    @NotBlank(message = "La edad del donador no puede estar vacía")
    @Column(name = "edadDonador", nullable = false)
    private int edadDonador;

    @NotBlank(message = "El peso del donador no puede estar vacío")
    @Column(name = "pesoDonador", nullable = false)
    private int pesoDonador;

    @NotBlank(message = "La altura del donador no puede estar vacío")
    @Size(min = 1, max = 10, message = "El genero del donador debe tener entre 1 y 10 caracteres")
    @Column(name = "generoDonador", length = 10, nullable = false)
    private String generoDonador;

    @NotBlank(message = "El tipo de sangre del donador no puede estar vacío")
    @Size(min = 1, max = 10, message = "El tipo de sangre del donador debe tener entre 1 y 10 caracteres")
    @Column(name = "tipoSangreDonador", length = 10, nullable = false)
    private String tipoSangreDonador;

    @NotBlank(message = "Las alergias del donador no pueden estar vacías")
    @Size(min = 1, max = 100, message = "Las alergias del donador deben tener entre 1 y 100 caracteres")
    @Column(name = "alergiasDonador", length = 100, nullable = false)
    private String alergiasDonador;

    @NotBlank(message = "Los padecimientos del donador no pueden estar vacíos")
    @Size(min = 1, max = 100, message = "Los padecimientos del donador deben tener entre 1 y 100 caracteres")
    @Column(name = "padecimientosDonador", length = 100, nullable = false)
    private String padecimientosDonador;

    @NotBlank(message = "Las enfermedades del donador no pueden estar vacías")
    @Size(min = 1, max = 100, message = "Las enfermedades del donador deben tener entre 1 y 100 caracteres")
    @Column(name = "enfermedadesDonador", length = 100, nullable = false)
    private String enfermedadesDonador;

    @NotBlank(message = "La ultima vacuna del donador no puede estar vacía")
    @Size(min = 1, max = 100, message = "La ultima vacuna del donador debe tener entre 1 y 100 caracteres")
    @Column(name = "ultimaVacunaDonador", length = 100, nullable = false)
    private String ultimaVacunaDonador;
}

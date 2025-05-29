package com.Perfumelandia.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Optional;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)                                                                                                                            
    private Long id;

    private String nombre;
    private String email;
    private String asunto;

    public static Optional<Reporte> map(Object o){
    throw new UnsupportedOperationException("Unimplemented method 'map'");

    }
}

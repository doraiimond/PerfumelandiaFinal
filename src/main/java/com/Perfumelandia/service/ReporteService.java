package com.Perfumelandia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Perfumelandia.model.Reporte;
import com.Perfumelandia.repository.ReporteRepository;

@Service
public class ReporteService {

    @Autowired
    private ReporteRepository reporteRepo;

    public Reporte obtenerReporte(Long id) {
        return reporteRepo.findById(id).orElseThrow(() -> new RuntimeException("Reporte no encontrado"));
    }

    public Reporte guardarReporte(Reporte r) {
        return reporteRepo.save(r);
    }

}
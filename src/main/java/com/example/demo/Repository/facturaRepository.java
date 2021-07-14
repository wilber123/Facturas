package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Factura;

@Repository
public interface facturaRepository extends JpaRepository<Factura, Long> {

}

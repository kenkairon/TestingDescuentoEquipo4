package cl.kibernumacademy.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class servicioDescuentoTest {

    private servicioDescuento servicioDescuento;

    @BeforeEach
    void setUp() {
        servicioDescuento = new servicioDescuento();
    }

    @Test
    void descuentoDel15PorcientoSiMayorA100Mil() {
        double result = servicioDescuento.aplicarDescuento(150_000);
        assertThat(result).isEqualTo(127_500.0);
    }

    @Test
    void descuentoDel10PorcientoSiEntre50MilY100Mil() {
        double result = servicioDescuento.aplicarDescuento(75_000);
        assertThat(result).isEqualTo(67_500.0);
    }

    @Test
    void sinDescuentoSiMenorA50Mil() {
        double result = servicioDescuento.aplicarDescuento(30_000);
        assertThat(result).isEqualTo(30_000.0);
    }

    @Test
    void bordeExacto50MilAplica10Porciento() {
        double result = servicioDescuento.aplicarDescuento(50_000);
        assertThat(result).isEqualTo(45_000.0);
    }

    @Test
    void bordeExacto100MilAplica10Porciento() {
        double result = servicioDescuento.aplicarDescuento(100_000);
        assertThat(result).isEqualTo(90_000.0);
    }
}

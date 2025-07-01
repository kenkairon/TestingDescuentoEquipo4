package cl.kibernumacademy.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiscountServiceTest {

    private DiscountService discountService;

    @BeforeEach
    void setUp() {
        discountService = new DiscountService();
    }

    @Test
    void descuentoDel15PorcientoSiMayorA100Mil() {
        double result = discountService.applyDiscount(150_000);
        assertThat(result).isEqualTo(127_500.0);
    }

    @Test
    void descuentoDel10PorcientoSiEntre50MilY100Mil() {
        double result = discountService.applyDiscount(75_000);
        assertThat(result).isEqualTo(67_500.0);
    }

    @Test
    void sinDescuentoSiMenorA50Mil() {
        double result = discountService.applyDiscount(30_000);
        assertThat(result).isEqualTo(30_000.0);
    }

    @Test
    void bordeExacto50MilAplica10Porciento() {
        double result = discountService.applyDiscount(50_000);
        assertThat(result).isEqualTo(45_000.0);
    }

    @Test
    void bordeExacto100MilAplica10Porciento() {
        double result = discountService.applyDiscount(100_000);
        assertThat(result).isEqualTo(90_000.0);
    }
}

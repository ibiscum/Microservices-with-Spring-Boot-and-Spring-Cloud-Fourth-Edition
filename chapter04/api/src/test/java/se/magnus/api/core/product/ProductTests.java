package se.magnus.api.core.product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTests {

    @Test
    void testNoArgConstructor() {
        Product p = new Product();
        assertEquals(0, p.getProductId());
        assertNull(p.getName());
        assertEquals(0, p.getWeight());
        assertNull(p.getServiceAddress());
    }

    @Test
    void testAllArgConstructor() {
        int id = 123;
        String name = "Test Product";
        int weight = 500;
        String address = "http://service-address:8080";

        Product p = new Product(id, name, weight, address);

        assertEquals(id, p.getProductId());
        assertEquals(name, p.getName());
        assertEquals(weight, p.getWeight());
        assertEquals(address, p.getServiceAddress());
    }
}

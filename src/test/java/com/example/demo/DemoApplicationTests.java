package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.ByteBuffer;
import java.util.Arrays;

import com.example.demo.model.CheeseShop;
import com.example.demo.model.Customer;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.print("test................");
    }

    @Test
    void emptyShop() throws Exception {
        CheeseShop shop = new CheeseShop();
        assertEquals(0, shop.customers().size());
    }

    @Test
    void canEnterShop() throws Exception {
        CheeseShop shop = new CheeseShop();
        String name = "John";
        Customer customer = new Customer(name);
        shop.enter(customer);
        assertEquals(1, shop.customers().size());
    }

    @Test
    void lotsOfCustomers() throws Exception {
        CheeseShop shop = new CheeseShop();
        int number = 101;

        for (int i = 0; i < number; i++) {
            Customer customer = new Customer("John" + i);
            shop.enter(customer);
        }
        assertEquals(number, shop.customers().size());
    }

    @Test
    void byteBuffer() throws Exception {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        System.out.println("---------------------20 byte to byteBuffer");

        System.out.println("----------------------base byteBuffer");
        System.out.println(byteBuffer);
        System.out.println(Arrays.toString(byteBuffer.array()));
    }
}

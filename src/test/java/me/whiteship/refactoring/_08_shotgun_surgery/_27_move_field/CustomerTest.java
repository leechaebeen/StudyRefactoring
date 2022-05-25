package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void applyDiscount() {
        Customer customer = new Customer("keesun", 0.5);
        assertEquals(50, customer.getContract().applyDiscount(100));

        customer.getContract().becomePreferred();
        assertEquals(47, customer.getContract().applyDiscount(100));
    }

}
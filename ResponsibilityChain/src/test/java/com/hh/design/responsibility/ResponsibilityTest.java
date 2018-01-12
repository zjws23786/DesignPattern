package com.hh.design.responsibility;

import com.hh.design.client.Customer;
import com.hh.design.factory.PriceHandlerFactory;

import java.util.Random;

/**
 * Created by hjz on 2018/1/12 0012.
 */
public class ResponsibilityTest {

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();
        for (int i=0; i<=100; i++){
            System.out.println("\n *********************");
            System.out.println(i+":");
            customer.requestDiscount(random.nextFloat());
        }
    }
}

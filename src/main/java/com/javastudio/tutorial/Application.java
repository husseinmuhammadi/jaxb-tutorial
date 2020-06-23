package com.javastudio.tutorial;

import com.javastudio.tutorial.model.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Application {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Customer.class);
            Customer customer = new Customer();
            customer.setFirstName("Jane");
            customer.setLastName("Doe");
            customer.setID(123);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customer, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

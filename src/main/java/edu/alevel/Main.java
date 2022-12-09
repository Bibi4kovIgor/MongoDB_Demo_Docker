package edu.alevel;

import edu.alevel.entity.Product;
import edu.alevel.mongodb.MongoProductRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Product> mockedData = List.of(
                new Product("Cheese", 14, new BigDecimal("123.12")),
                new Product("Milk", 14, new BigDecimal("143.12")),
                new Product("Cheese", 14,new BigDecimal("223.12"))
        );

        MongoProductRepository<Product> mongoProductRepository =
                new MongoProductRepository<>(Product.class);

        if (Objects.nonNull(mongoProductRepository.getAllData())) {
            mongoProductRepository.clearAllData();
        }
        mongoProductRepository.addMultipleData(mockedData);
        System.out.println(mongoProductRepository.getDataByParameter("Cheese"));
        System.out.println(mongoProductRepository.getAllData());


    }
}
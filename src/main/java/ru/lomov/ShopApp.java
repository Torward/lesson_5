package ru.lomov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import ru.lomov.config.DbConfig;
import ru.lomov.config.HibernateConfig;
import ru.lomov.dao.ProductDao;
import ru.lomov.entity.Product;

public class ShopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        ProductDao productDao = context.getBean(ProductDao.class);
//        System.out.println(productDao.findTitleById(5L));
        for (Product product:productDao.findAll()) {
            System.out.println(product);
        }
        System.out.println(productDao.findTitleById(8L));
    }
}

package com.UniversiteBilgiYonetimi;

import com.UniversiteBilgiYonetimi.main.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

//@ComponentScan(basePackages = {"com.UniversiteBilgiYonetimi.Controller",
//        "com.UniversiteBilgiYonetimi.Service"
//        })
//@EntityScan("com.UniversiteBilgiYonetimi.Model")
//@EnableJpaRepositories("com.UniversiteBilgiYonetimi.Repository")

public class springBootApplication {

    public static void main(String[] args) {

        System.setProperty("spring.config.name", "com.UniversiteBilgiYonetimi");
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();


            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        SpringApplication.run(springBootApplication.class, args);
    }

}

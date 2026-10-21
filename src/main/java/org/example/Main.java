package org.example;

import org.example.entity.Student;
import org.example.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class Main {

        public static void main(String[] args) {
//        Student obj=new Student(101,"Sujoy","CSE",78);
//        System.out.println(obj);
            EntityManager entityManager = JPAUtil.getEntityManager();
            System.out.println("JPA Connect Susscesfuly");
            entityManager.close();
            JPAUtil.close();
        }
    }

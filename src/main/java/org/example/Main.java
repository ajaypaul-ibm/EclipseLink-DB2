package org.example;

import com.example.model.Coordinate;
import com.example.model.MyEntity;
import com.example.repositories.CoordinateRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        MyEntity entity = new MyEntity();
        entity.setName("");
        em.persist(entity);
//        Coordinate coordinate = new Coordinate();
//        System.out.println("going to create coordinate");
//        coordinate.setX(10);
//        coordinate.setY(15);
//        coordinate.setTest("name");
//        em.persist(coordinate);
//        System.out.println("created corodinate");
//        System.out.println("going to insert INTO coordinate");
//        coordinate.setX(10);
//      	coordinate.setY(15);
//      	coordinate.setTest("name");
//      	em.persist(coordinate);

        em.getTransaction().commit();

        MyEntity foundEntity = em.find(MyEntity.class, entity.getId());
        System.out.println("Found entity: " + foundEntity.getName());
        // Update the coordinate
//        CoordinateRepository coordinateRepository = new CoordinateRepository(em);
//        coordinateRepository.updateCoordinate(2L, 20, 2);
        em.close();
        emf.close();
    }
}
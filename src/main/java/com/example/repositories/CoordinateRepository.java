package com.example.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CoordinateRepository {

    private final EntityManager entityManager;

    public CoordinateRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void updateCoordinate(Long id, int newX, int yDivisor) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        entityManager.createQuery("UPDATE Coordinate  SET x = :newX, y = y / :yDivisor WHERE id = :id")
//                .setParameter("newX", newX)
//                .setParameter("yDivisor", yDivisor)
//                .setParameter("id", id)
//                .executeUpdate();

        transaction.commit();

    }

    // Other methods as needed
}

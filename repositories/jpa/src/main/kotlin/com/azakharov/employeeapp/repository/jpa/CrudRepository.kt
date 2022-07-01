package com.azakharov.employeeapp.repository.jpa

import java.util.Optional

/**
 * Kotlin Copy of
 * <a href="https://github.com/artemzakharovbelarus/employee-module-app/blob/master/repositories/jpa/src/main/java/com/azakharov/employeeapp/repository/jpa/CrudRepository.java">https://github.com/artemzakharovbelarus/employee-module-app/blob/master/repositories/jpa/src/main/java/com/azakharov/employeeapp/repository/jpa/CrudRepository.java</a>
 */
interface CrudRepository<E, ID> {

    fun find(id: ID): Optional<E>
    fun findAll(): List<E>
    fun save(entity: E): E
    fun update(entity: E): E
    fun delete(id: ID)
}
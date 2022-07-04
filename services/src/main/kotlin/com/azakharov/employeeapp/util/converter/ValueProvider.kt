package com.azakharov.employeeapp.util.converter

import com.azakharov.employeeapp.repository.jpa.entity.EmployeeEntity
import com.azakharov.employeeapp.repository.jpa.entity.EmployeePositionEntity

internal fun provideNotNullId(id: Long?, entity: Any): Long {
    return id?: throw BidirectionalDomainConverterException("Id can''t be null in $entity, during converting")
}

internal fun provideNotNullPositionEntity(position: EmployeePositionEntity?, employee: EmployeeEntity): EmployeePositionEntity {
    return position?: throw BidirectionalDomainConverterException("Position can''t be null in $employee, during converting")
}
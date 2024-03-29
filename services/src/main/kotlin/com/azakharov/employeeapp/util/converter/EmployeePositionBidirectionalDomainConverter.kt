package com.azakharov.employeeapp.util.converter

import com.azakharov.employeeapp.domain.EmployeePosition
import com.azakharov.employeeapp.domain.id.EmployeePositionId
import com.azakharov.employeeapp.repository.jpa.entity.EmployeePositionEntity

/**
 * Kotlin Copy of
 * <a href="https://github.com/artemzakharovbelarus/employee-module-app/blob/master/services/src/main/java/com/azakharov/employeeapp/util/converter/EmployeePositionBidirectionalDomainConverter.java">https://github.com/artemzakharovbelarus/employee-module-app/blob/master/services/src/main/java/com/azakharov/employeeapp/util/converter/EmployeePositionBidirectionalDomainConverter.java</a>
 */
class EmployeePositionBidirectionalDomainConverter : BidirectionalDomainConverter<EmployeePosition, EmployeePositionEntity> {

    override fun convertToDomain(entity: EmployeePositionEntity): EmployeePosition {
        val idValue = provideId(entity.id, entity)
        return EmployeePosition(EmployeePositionId(idValue), entity.name)
    }

    override fun convertToEntity(domain: EmployeePosition): EmployeePositionEntity {
        val id = if (domain.id != null) domain.id.value else null
        return EmployeePositionEntity(id, domain.name)
    }
}
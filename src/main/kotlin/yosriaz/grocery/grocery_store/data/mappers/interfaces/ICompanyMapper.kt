package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.CompanyDto
import yosriaz.grocery.grocery_store.data.models.Company
interface ICompanyMapper {
      fun mapToDto(company: Company): CompanyDto

    fun mapToEntity(companyDto: CompanyDto): Company
}

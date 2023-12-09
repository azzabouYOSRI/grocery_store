package yosriaz.grocery.grocery_store.data.mappers.component

import org.springframework.stereotype.Component
import yosriaz.grocery.grocery_store.data.dto.CompanyDto
import yosriaz.grocery.grocery_store.data.mappers.interfaces.ICompanyMapper
import yosriaz.grocery.grocery_store.data.models.Card
import yosriaz.grocery.grocery_store.data.models.Company

@Component
class CompanyMapper : ICompanyMapper {

      override fun mapToDto(company: Company): CompanyDto {
        val companyDto = CompanyDto(
        company.id,
        company.name,
        company.card?.id,
        company.companyType)
        return companyDto
        }

        override fun mapToEntity(companyDto: CompanyDto): Company {
        val company = Company(
        companyDto.id,
        companyDto.name,
        Card(companyDto.cardId, '0','0'))
        companyDto.companyType
        return company
        }
}

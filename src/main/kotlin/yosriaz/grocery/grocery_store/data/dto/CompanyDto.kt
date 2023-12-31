package yosriaz.grocery.grocery_store.data.dto

import lombok.Data
import yosriaz.grocery.grocery_store.data.enums.CompanyType
import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Company}
 */
@Data
data class CompanyDto(
    val id: Long? = null,
    val name: String? = null,
    val cardId: Long? = null,
    val companyType: CompanyType? = null,
) : Serializable

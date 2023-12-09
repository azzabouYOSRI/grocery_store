package yosriaz.grocery.grocery_store.data.dto

import jakarta.persistence.*
import java.io.Serializable
import java.time.LocalDate

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.User}
 */
data class UserDto(
    val id: Long? = null,
    val name: String? = null,
    val familyName: String? = null,
    val birthDate: LocalDate? = null,
    val cardID: Long? = null,
    val locationID: Long? = null,
    val stocksID: Long? = null
) : Serializable

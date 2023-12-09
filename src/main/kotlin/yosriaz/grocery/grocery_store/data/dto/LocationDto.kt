package yosriaz.grocery.grocery_store.data.dto

import lombok.Data
import yosriaz.grocery.grocery_store.data.enums.Cities
import yosriaz.grocery.grocery_store.data.enums.States
import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Location}
 */
@Data
data class LocationDto(val id: Long? = null, val city: Cities? = null, val state: States? = null) : Serializable

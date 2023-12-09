package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*
import yosriaz.grocery.grocery_store.data.enums.cities
import yosriaz.grocery.grocery_store.data.enums.states

@Entity
@Table(name = "location")
open class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Enumerated
    @Column(name = "city", nullable = false)
    open var city: cities? = null
        protected set

    @Enumerated
    @Column(name = "state", nullable = false)
    open var state: states? = null
        protected set
}

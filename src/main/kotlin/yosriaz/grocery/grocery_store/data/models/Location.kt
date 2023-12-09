package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*
import yosriaz.grocery.grocery_store.data.enums.Cities
import yosriaz.grocery.grocery_store.data.enums.States


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
    open var city: Cities? = null
        protected set

    @Enumerated
    @Column(name = "state", nullable = false)
    open var state: States? = null
        protected set

    @OneToMany(mappedBy = "location", orphanRemoval = true)
    open var invoices: MutableSet<Invoice> = mutableSetOf()

    @OneToMany(mappedBy = "location", orphanRemoval = true)
    open var brands: MutableSet<Card> = mutableSetOf()

    @OneToOne(mappedBy = "location", optional = false, orphanRemoval = true)
    open var user: User? = null
}

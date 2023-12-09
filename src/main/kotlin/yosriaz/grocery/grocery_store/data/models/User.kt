package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "user")
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Column(name = "name", nullable = false)
    open var name: String? = null
        protected set

    @Column(name = "family_name", nullable = false)
    open var familyName: String? = null
        protected set

    @Column(name = "birth_date", nullable = false)
    open var birthDate: LocalDate? = null
        protected set

    @OneToOne(cascade = [CascadeType.ALL], optional = false, orphanRemoval = true)
    @JoinColumn(name = "card_id", nullable = false)
    open var card: Card? = null
        protected set

    @OneToOne(cascade = [CascadeType.ALL], optional = false, orphanRemoval = true)
    @JoinColumn(name = "location_id", nullable = false)
    open var location: Location? = null
        protected set

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    open var stocks: MutableSet<Stock> = mutableSetOf()
}

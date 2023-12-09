package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*
import lombok.Data
import yosriaz.grocery.grocery_store.data.enums.CompanyType

@Entity
@Data
@Table(name = "company")
open class Company(id: Long?, name: String?, card: Card) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Column(name = "name", nullable = false)
    open var name: String? = null
        protected set

    @ManyToOne(cascade = [CascadeType.REMOVE], optional = false)
    @JoinColumn(name = "card_id", nullable = false)
    open var card: Card? = null
        protected set

    @Enumerated
    @Column(name = "company_type", nullable = false)
    open var companyType: CompanyType? = null
        protected set

    @OneToMany(mappedBy = "company", orphanRemoval = true)
    open var stocks: MutableSet<Stock> = mutableSetOf()
}

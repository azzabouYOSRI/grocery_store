package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*
import lombok.Data

@Entity
@Data
@Table(name = "actual_stock")
open class ActualStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Column(name = "actualstock", nullable = false)
    open var actualStock: Int? = null
        protected set

    @OneToOne(cascade = [CascadeType.ALL], optional = false, orphanRemoval = true)
    @JoinColumn(name = "stock_id", nullable = false)
    open var stock: Stock? = null
}

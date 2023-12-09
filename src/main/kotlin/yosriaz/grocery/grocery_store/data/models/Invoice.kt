package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.time.LocalDateTime

@Entity
@Table(name = "invoice")
open class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Column(name = "ht", nullable = false)
    open var ht: Double? = null
        protected set

    @Column(name = "date", nullable = false)
    open var date: LocalDateTime? = null
        protected set




}

package querydsl.entity

import jakarta.persistence.*

@Entity
@Table(name = "user")
class User(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
  val name: String? = null,
  val age: Int? = null,
  val email: String? = null,
)

package model

import java.util.Date
import javax.persistence._

@Entity
@Table(name = "contents")
case class Content(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  id: Int = 0,

  title: String,

  @Column(length = 10000)
  body: String,

  author: String,

  @Temporal(TemporalType.TIMESTAMP)
  createdAt: Date
)

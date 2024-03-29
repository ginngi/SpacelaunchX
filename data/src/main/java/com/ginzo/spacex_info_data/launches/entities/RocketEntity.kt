package com.ginzo.spacex_info_data.launches.entities

import com.ginzo.spacex_info_domain.entities.Rocket
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RocketEntity(
  @Json(name = "rocket_id")
  val id: String,
  @Json(name = "rocket_name")
  val name: String,
  @Json(name = "rocket_type")
  val type: String
) {
  fun toDomain(): Rocket {
    return Rocket(id, name, type)
  }
}
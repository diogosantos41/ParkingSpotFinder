package com.dscoding.parkingspotfinder.domain

data class ParkingSpot(
    val lat: Double,
    val lng: Double,
    val id: Int? = null
)
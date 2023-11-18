package com.dscoding.parkingspotfinder.presentation

import com.dscoding.parkingspotfinder.domain.ParkingSpot
import com.google.android.gms.maps.model.LatLng

sealed class MapEvent {
    data object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}

package com.example.pedalpartnerapp


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState


@Composable
fun Map() {


    val uiSettings by remember { mutableStateOf(MapUiSettings(zoomControlsEnabled = true)) }
    val properties by remember { mutableStateOf(MapProperties(mapType = MapType.NORMAL)) }
    val military = LatLng(-33.404170, -70.567126)
   // val cameraPositionState by remember { mutableStateOf(CameraPositionState = rememberCameraPositionState())}
    map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15f))

    Box(modifier = Modifier.fillMaxSize()
    ) {
        GoogleMap(
            properties = properties,
            uiSettings = uiSettings,
            cameraPositionState = military,

        )
        {Marker(position = military,
                snippet = "Casa Jovi")}


    }

}

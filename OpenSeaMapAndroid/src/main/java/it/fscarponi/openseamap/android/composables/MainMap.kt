package it.fscarponi.openseamap.android.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState

@Composable
fun MainMap(){
    val cameraPositionState = remember {
        CameraPositionState(CameraPosition(LatLng(42.543594, 14.126249),16f,0f,0f))
    }

    Column() {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            Marker(
                state = MarkerState(position = LatLng(42.543594, 14.126249)),
                title = "Silvi",
                snippet = "Marker in Silvi"
            )
        }
    }
}
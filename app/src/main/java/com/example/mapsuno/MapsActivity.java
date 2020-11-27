package com.example.mapsuno;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback , GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private Marker markerPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // marcador simple y descrpcion
        LatLng lima = new LatLng(-12.0621065, -77.0365256);
        mMap.addMarker(new MarkerOptions().position(lima).title("Marcador Lima").snippet("Ciudad de lima, Capital del Perú").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        // marcador simple y descrpcion
        LatLng tacna = new LatLng(-18.0138521, -70.2511614);
        mMap.addMarker(new MarkerOptions().position(tacna).title("Marcador tacna").snippet("Ciudad de Tacna, Ciudad de las aceitunas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        // marcador simple y descrpcion
        LatLng ayacucho = new LatLng(-7, -76.833333);
        mMap.addMarker(new MarkerOptions().position(ayacucho).title("Marcador ayacucho").snippet("Ciudad de ayacucho, friooo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


        // marcador simple y descrpcion
        LatLng san_martin = new LatLng(-7, -76.833333);
        mMap.addMarker(new MarkerOptions().position(san_martin).draggable(true).title("Marcador San martin").snippet("Ciudad de martin, friooo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


        LatLng pruebaTrujillo = new LatLng(-8.1116778,-79.0287742);
        markerPrueba=googleMap.addMarker(new MarkerOptions().position(pruebaTrujillo).title("prueba"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lima,7));

        googleMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {

        if (marker.equals(markerPrueba)){
            String lat,lng;
            lat=Double.toString(marker.getPosition().latitude);
            lng=Double.toString(marker.getPosition().latitude);

            Toast.makeText(this,lat + "," + lng,Toast.LENGTH_LONG).show();

        }
        return false;
    }
}

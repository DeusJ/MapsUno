package com.example.mapsuno;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityTipos extends FragmentActivity implements OnMapReadyCallback {
       private Button btn_hi, btn_nor, btn_sate, btn_terr;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_tipos);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        btn_hi=(Button)findViewById(R.id.btnHibrido);
        btn_nor=(Button)findViewById(R.id.btnNormal);
        btn_sate=(Button)findViewById(R.id.btnSatelital);
        btn_terr=(Button)findViewById(R.id.btnTerreno);




    }

    public void cambairHibrido (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
    public void cambairNormal (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void cambairSatelital (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
    public void cambairTerreno (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Markerts in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}

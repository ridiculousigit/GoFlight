package binar.academy.flightgo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.flightgo.R
import binar.academy.flightgo.adapter.AdapterFlight
import binar.academy.flightgo.adapter.AdapterPlaces
import binar.academy.flightgo.data.DataFlight
import binar.academy.flightgo.data.DataPlaces
import binar.academy.flightgo.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //available flight
        val listFlight = arrayListOf(
            DataFlight(R.drawable.garuda,"RP 1000.000"),
            DataFlight(R.drawable.garuda,"RP 1000.000"),
            DataFlight(R.drawable.garuda,"RP 1000.000"),
            DataFlight(R.drawable.garuda,"RP 1000.000"),
        )
        var adapterFlight = AdapterFlight(listFlight)
        val viewFlight = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.rvAvalableFlight.layoutManager = viewFlight
        binding.rvAvalableFlight.adapter = adapterFlight



//places
        val listPlaces = arrayListOf(
            DataPlaces(R.drawable.monumen_nasional, "Monumen Nasional", "DKI, Jakarta, INA"),
            DataPlaces(R.drawable.monumen_nasional, "Monumen Nasional", "DKI, Jakarta, INA"),
            DataPlaces(R.drawable.monumen_nasional, "Monumen Nasional", "DKI, Jakarta, INA"),
            DataPlaces(R.drawable.monumen_nasional, "Monumen Nasional", "DKI, Jakarta, INA"),
            DataPlaces(R.drawable.monumen_nasional, "Monumen Nasional", "DKI, Jakarta, INA"),
            DataPlaces(R.drawable.monumen_nasional, "Monumen Nasional", "DKI, Jakarta, INA"),

            )

        var adapterPlaces = AdapterPlaces(listPlaces)
        val viewPlaces = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.rvPopularPlaces.layoutManager = viewPlaces
        binding.rvPopularPlaces.adapter = adapterPlaces



    }
}
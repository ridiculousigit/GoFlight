package binar.academy.flightgo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import binar.academy.flightgo.R
import binar.academy.flightgo.data.DataPlaces

class AdapterPlaces (val listPlaces : ArrayList<DataPlaces>)
    : RecyclerView.Adapter<AdapterPlaces.ViewHolder>() {


    class ViewHolder(itemData : View) : RecyclerView.ViewHolder(itemData) {
        var namePlaces = itemData.findViewById<TextView>(R.id.name_places)
        var location = itemData.findViewById<TextView>(R.id.lokasi)
        var imgPlaces =itemData.findViewById<ImageView>(R.id.img_places)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_places, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.namePlaces.text = listPlaces[position].namePlaces
        holder.location.text = listPlaces[position].lokasiPlaces
        holder.imgPlaces.setImageResource(listPlaces[position].imagePlaces)

    }

    override fun getItemCount(): Int {
        return listPlaces.size
    }
}



package com.example.agenciaviaje

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class PlacesAdapter(private val places: List<Place>) : RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder>() {

    inner class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.place_name)
        private val priceTextView: TextView = itemView.findViewById(R.id.place_price)
        private val placeImageView: ImageView = itemView.findViewById(R.id.place_image)
        private val reserveButton: Button = itemView.findViewById(R.id.reserve_button)

        fun bind(place: Place) {
            nameTextView.text = place.name
            priceTextView.text = place.price
            placeImageView.setImageResource(place.imageResId)

            reserveButton.setOnClickListener {
                val dialog = ReservationDialogFragment()
                dialog.show((itemView.context as AppCompatActivity).supportFragmentManager, "ReservationDialog")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_place, parent, false) // Make sure to create item_place.xml
        return PlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(places[position])
    }

    override fun getItemCount() = places.size
}

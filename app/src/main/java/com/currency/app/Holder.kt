package com.currency.app

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.StringBuilder

class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var image: ImageView
    val name: TextView
    val year: TextView


    init {
        image = itemView.findViewById(R.id.imageRecycler)
        name = itemView.findViewById(R.id.nameRecyclerLine)
        year = itemView.findViewById(R.id.yearRecyclerLine)
    }

    fun bind(data: Currency_obj) {
        image.setImageResource(data.image)
        name.text = data.name
        year.text = StringBuilder("Year of creation: " + data.year.toString())

    }
}
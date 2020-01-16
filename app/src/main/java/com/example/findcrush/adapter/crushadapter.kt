package com.example.findcrush.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.findcrush.R
import com.example.findcrush.model.crush
import kotlinx.android.synthetic.main.findcrush.view.*

class CrushViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    var imro = ItemView.findViewById<ImageView>(R.id.parkimage) //round
    var parkshin = ItemView.findViewById<TextView>(R.id.txtpark)  //txt
    var purpimage = ItemView.findViewById<ImageView>(R.id.pupleimage) //under
}

class CrushAdapter(val crushlist: ArrayList<crush>) : RecyclerView.Adapter<CrushViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrushViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.findcrush, parent, false)
        return CrushViewHolder(view)
    }

    override fun getItemCount(): Int {
        return crushlist.size

    }

    override fun onBindViewHolder(holder: CrushViewHolder, position: Int) {
        holder.imro.setImageResource(crushlist[position].imageround)
        holder.parkshin.text = crushlist[position].name
        holder.purpimage.setImageResource(crushlist[position].image)

    }

}
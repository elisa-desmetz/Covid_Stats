package com.example.covidstats.adaptaters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.covidstats.R

class CountriesAdapter(private val countriesList: List<MyCountry>) :RecyclerView.Adapter<CountriesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {

        return countriesList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("Response", "List Count :${countriesList.size} ")


        return holder.bind(countriesList[position])

    }
    class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {


        var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        var tvCases = itemView.findViewById<TextView>(R.id.tvCases)
        fun bind(country: MyCountry) {

            val name ="Cases :${country.data?.summary?.active_cases}"
            tvTitle.text = country.toString()
            tvCases.text = name
        }

    }
}
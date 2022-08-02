package com.example.dependencyinjectionpractice.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dependencyinjectionpractice.R
import com.example.dependencyinjectionpractice.data.Dog

class DogsAdapter(private val dogs: List<Dog>): RecyclerView.Adapter<DogsAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_dog,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dogs[position])
    }

    override fun getItemCount(): Int {
        return dogs.size
    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){

        fun bind(dog: Dog){
            Glide.with(itemView.context)
                .load(dog.image)
                .into(itemView.findViewById(R.id.image))
            itemView.findViewById<TextView>(R.id.breed).text = dog.breed

        }

    }

}
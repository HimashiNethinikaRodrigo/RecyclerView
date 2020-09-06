package com.example.android.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.astronomy_recycler_view_item.view.*


class DataAdapter(private val data: ArrayList<Data>) :
    RecyclerView.Adapter<DataAdapter.DataHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DataHolder {
        return DataHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.astronomy_recycler_view_item, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
        val itemData: Data = data[position]
        holder.bindData(itemData)
    }

    class DataHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v

        fun bindData(data: Data) {
            Glide.with(view.context).load(data.url).into(view.itemImage)
            view.itemDate.text = data.humanDate
            view.itemDescription.text = data.explanation
        }

    }
}


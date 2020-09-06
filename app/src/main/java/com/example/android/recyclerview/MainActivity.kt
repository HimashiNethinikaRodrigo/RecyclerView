package com.example.android.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var dataAdapter: DataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayoutManager = LinearLayoutManager(this)
        astronomyRecyclerView.layoutManager = linearLayoutManager
        dataAdapter = DataAdapter(receivedNewData())
        astronomyRecyclerView.adapter = dataAdapter
    }

    fun receivedNewData(): ArrayList<Data> {
        val list: ArrayList<Data> = ArrayList()
        for (x in 1..5) {
            val newData: Data = Data(
                "https://i.imgur.com/DvpvklR.png",
                "2020 September " + x,
                "This is the mess that is left when a star explodes. " +
                        "The Crab Nebula, the result of a supernova seen in 1054 AD, " +
                        "is filled with mysterious filaments. The filaments are not only tremendously complex, " +
                        "but appear to have less mass than expelled in the original supernova and a higher speed than expected from a free explosion. " +
                        "The featured image, taken by the Hubble Space Telescope, is presentedi in three colors chosen for scientific interest." +
                        " The Crab Nebula spans about 10 light-years. In the nebula's very center lies a " +
                        "pulsar: a neutron star as massive as the Sun but with only the size of a small town. The Crab Pulsar rotates about 30 times each second."
            )
            list.add(newData)
        }
        return list
    }
}
package com.example.kobifit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.util.ArrayList


class TrainingListAdapter(private val ct: Context, resource: Int, objects: List<TrainingList>) :
    ArrayAdapter<TrainingList?>(
        ct, resource, objects
    ) {

    private val listPower: ArrayList<TrainingList>

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            val i = ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = i.inflate(R.layout.training_list, null)
        }
        if (listPower.size > 0) {
            val d = listPower[position]
            val txt = convertView!!.findViewById<TextView>(R.id.customTrainingText)
            txt.text = d.nameOfTheTraining
        }
        return convertView!!
    }

    init {
        listPower = ArrayList(objects)
    }
}


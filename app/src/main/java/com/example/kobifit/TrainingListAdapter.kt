package com.example.kobifit

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter


class TrainingListAdapter(context: Context, resource: Int, objects: MutableList<TrainingList>) :
    ArrayAdapter<TrainingList>(context, resource, objects) {

        private lateinit var ct : Context
        private lateinit var Lista : ArrayAdapter<TrainingList>


}


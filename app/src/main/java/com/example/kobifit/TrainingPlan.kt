package com.example.kobifit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import java.util.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TrainingPlan.newInstance] factory method to
 * create an instance of this fragment.
 */
class TrainingPlan : Fragment(){
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /*
        val listTraining: ListView

        listTraining = requireView().findViewById(R.id.listOfTrainings)

        val listPower = ArrayList<TrainingList>()

        listPower.add(TrainingList("Klata"))
        listPower.add(TrainingList("Plecy"))
        listPower.add(TrainingList("Barki"))
        listPower.add(TrainingList("Brzuch"))
        listPower.add(TrainingList("Klata"))
        listPower.add(TrainingList("Plecy"))
        listPower.add(TrainingList("Barki"))
        listPower.add(TrainingList("Brzuch"))
        listPower.add(TrainingList("Klata"))
        listPower.add(TrainingList("Plecy"))
        listPower.add(TrainingList("Barki"))
        listPower.add(TrainingList("Brzuch"))

        val adapter = TrainingListAdapter(requireActivity(), 0, listPower)
        listTraining.adapter = adapter


         */


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_training_plan, container, false)
        }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TrainingPlan.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TrainingPlan().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
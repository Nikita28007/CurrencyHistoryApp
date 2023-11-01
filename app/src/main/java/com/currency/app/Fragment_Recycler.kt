package com.currency.app

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.ByteArrayOutputStream

class Fragment_Recycler : Fragment() {
    var pos = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.recycler_fragment, container, false)
        val data = addDAta()
        initRecycler(view, data)
        view.findViewById<Button>(R.id.quizButton).setOnClickListener{
            findNavController().navigate(R.id.action_fragment_Recycler_to_fragmentQuiz)
        }
        return view
    }

    private fun initRecycler(view: View, data: ArrayList<Currency_obj>) {
        val recycler = view.findViewById<RecyclerView>(R.id.recylerViewMain)
        val adapter = Adapter(data, view.context)
        recycler.adapter = adapter

        adapter.setOnClickListener {
            pos = recycler.getChildAdapterPosition(it)
            val bundle = Bundle()
            bundle.putInt("pos", pos)

            findNavController().navigate(R.id.action_fragment_Recycler_to_fragmentDetails, bundle)
        }
        recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

    }

    private fun addDAta(): ArrayList<Currency_obj> {
        val arr = ArrayList<Currency_obj>()
        arr.add(Currency_obj(R.drawable.dollar, "Dollar", 1786))
        arr.add(Currency_obj(R.drawable.euro, "Euro", 1999))
        arr.add(Currency_obj(R.drawable.ruble, "Ruble", 1654))
        arr.add(Currency_obj(R.drawable.pounds, "Pound Sterling", 1489))
        arr.add(Currency_obj(R.drawable.tenge, "Tenge", 1993))
        arr.add(Currency_obj(R.drawable.zloty, "Zloty", 1528))
        arr.add(Currency_obj(R.drawable.bitcoin, "Bitcoin", 2009))
        return arr
    }

}
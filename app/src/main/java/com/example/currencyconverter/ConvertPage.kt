package com.example.currencyconverter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ConvertPage : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_convert_page, container, false)

//        val currency = resources.getStringArray(R.array.Currency)
//        val arrayadapter = ArrayAdapter(requireContext(), R.layout.currency_item, currency)
//        binding.autoCompleteTextview.setAdapter(arrayadapter)


    }
}
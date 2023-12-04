package com.example.currencyconverter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.currencyconverter.databinding.FragmentConvertPageBinding

class ConvertPage : Fragment() {
    private lateinit var binding: FragmentConvertPageBinding
    override fun onResume() {
        super.onResume()
        val currency = resources.getStringArray(R.array.Currency)
        val arrayadapter = ArrayAdapter(requireContext(), R.layout.currency_item, currency)
        binding.autoCompleteTextView.setAdapter(arrayadapter)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentConvertPageBinding.inflate(layoutInflater)
        return binding.root

    }

}

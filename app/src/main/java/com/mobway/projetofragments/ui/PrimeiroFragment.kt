package com.mobway.projetofragments.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.mobway.projetofragments.DetalhesActivity
import com.mobway.projetofragments.R

class PrimeiroFragment : Fragment() {

    companion object {
        fun newInstance() = PrimeiroFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.primeiro_fragment, container, false)

        val buttonNavigation = view.findViewById<Button>(R.id.buttonNavigation)
        buttonNavigation.setOnClickListener {
            Intent(requireContext(), DetalhesActivity::class.java).apply {
                startActivity(this)
            }
        }
        return view
    }

}
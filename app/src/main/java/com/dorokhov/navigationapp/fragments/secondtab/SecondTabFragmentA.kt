package com.dorokhov.navigationapp.fragments.secondtab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dorokhov.navigationapp.R
import com.dorokhov.navigationapp.fragments.SecondTabBaseFragment
import kotlinx.android.synthetic.main.fragment_second_tab_a.*

class SecondTabFragmentA : SecondTabBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_tab_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateToFragmentB.setOnClickListener {
            findNavController().navigate(R.id.action_secondTabFragmentA_to_secondTabFragmentB)
        }
    }
}

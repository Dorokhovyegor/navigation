package com.dorokhov.navigationapp.fragments.firsttab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dorokhov.navigationapp.R
import com.dorokhov.navigationapp.fragments.FirstTabBaseFragment
import kotlinx.android.synthetic.main.fragment_first_tab_b.*

class FirstTabFragmentB : FirstTabBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_tab_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        navigateToFragmentC.setOnClickListener {
            findNavController().navigate(R.id.action_firstTabFragmentB_to_firstTabFragmentC)
        }
    }
}

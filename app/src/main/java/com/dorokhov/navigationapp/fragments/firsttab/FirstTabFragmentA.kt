package com.dorokhov.navigationapp.fragments.firsttab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.dorokhov.navigationapp.R
import com.dorokhov.navigationapp.fragments.FirstTabBaseFragment
import kotlinx.android.synthetic.main.fragment_ferst_tab_a.*

class FirstTabFragmentA : FirstTabBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ferst_tab_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateToFragmentB.setOnClickListener {
            // навигация на следуюший фрагмент
            // можно пихнуть сюда аргументы, но лучше юзать viewModel для целого таба
            findNavController().navigate(R.id.action_ferstTabFragmentA_to_firstTabFragmentB, bundleOf())
        }
    }
}

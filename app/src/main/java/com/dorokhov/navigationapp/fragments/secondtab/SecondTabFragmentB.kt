package com.dorokhov.navigationapp.fragments.secondtab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dorokhov.navigationapp.R
import com.dorokhov.navigationapp.fragments.SecondTabBaseFragment

class SecondTabFragmentB : SecondTabBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_tab_ftagment_b, container, false)
    }
}

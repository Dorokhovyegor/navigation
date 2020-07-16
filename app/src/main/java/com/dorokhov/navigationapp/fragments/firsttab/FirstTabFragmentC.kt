package com.dorokhov.navigationapp.fragments.firsttab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dorokhov.navigationapp.R
import com.dorokhov.navigationapp.fragments.FirstTabBaseFragment

class FirstTabFragmentC : FirstTabBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_tab_c, container, false)
    }

}

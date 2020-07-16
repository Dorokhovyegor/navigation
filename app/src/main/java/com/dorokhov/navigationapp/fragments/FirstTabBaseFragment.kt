package com.dorokhov.navigationapp.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class FirstTabBaseFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //setUpActionBarWithNavController(R.id.firstTabFragmentA, activity as AppCompatActivity)
    }


}
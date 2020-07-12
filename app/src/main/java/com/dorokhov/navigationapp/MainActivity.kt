package com.dorokhov.navigationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.dorokhov.navigationapp.fragments.firsttab.FirstTabFragmentB
import com.dorokhov.navigationapp.fragments.firsttab.FirstTabFragmentC
import com.dorokhov.navigationapp.fragments.secondtab.SecondTabFtagmentB
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    NavigationController.NavGraphProvider,
    NavigationController.OnNavigationGraphChanged,
    NavigationController.OnNavigationReselectedListener {

    private val navigationController: NavigationController by lazy(LazyThreadSafetyMode.NONE) {
        NavigationController(
            this,
            R.id.main_nav_host_fragment,
            R.id.first_tab_graph,
            this,
            this
        )
    }

    override fun getNavGraphId(itemId: Int) = when (itemId) {
        R.id.first_tab_menu -> {
            R.navigation.first_tab_graph
        }
        R.id.second_tab_menu -> {
            R.navigation.second_tab_graph
        }
        else -> R.navigation.first_tab_graph
    }

    override fun onGraphChange() {
        //
    }

    override fun onReselectNavItem(navController: NavController, fragment: Fragment) {
        when (fragment) {
            is FirstTabFragmentB -> {
                navController.navigate(R.id.action_firstTabFragmentB_to_ferstTabFragmentA)
            }
            is FirstTabFragmentC -> {
                navController.navigate(R.id.action_firstTabFragmentC_to_ferstTabFragmentA)
            }
            is SecondTabFtagmentB -> {
                navController.navigate(R.id.action_secondTabFtagmentB_to_secondTabFragmentA)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation_view.setUpNavigation(navigationController, this)
    }
}

package mariana.lzry.finanzas.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.MainActivityBinding
import mariana.lzry.finanzas.presentation.view.home.HomeFragment
import mariana.lzry.finanzas.presentation.view.details.DetailsFragment
import mariana.lzry.finanzas.presentation.view.income.IncomeFragment
import mariana.lzry.finanzas.presentation.view.outcome.OutcomeFragment
import mariana.lzry.finanzas.presentation.view.settings.SettingsFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding
    private lateinit var homeFragment: HomeFragment
    private lateinit var incomeFragment: IncomeFragment
    private lateinit var outcomeFragment: OutcomeFragment
    private lateinit var detailsFragment: DetailsFragment
    private lateinit var settingsFragment: SettingsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appbar_items, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_settings -> {
                setFragment(settingsFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initView(){
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragmentView()
        initBottomNavigationView()
    }

    //instancia de Fragmentos
    private fun initFragmentView(){
       homeFragment = HomeFragment.newInstance()
        incomeFragment = IncomeFragment.newInstance()
        outcomeFragment = OutcomeFragment.newInstance()
        detailsFragment = DetailsFragment.newInstance()
        settingsFragment = SettingsFragment.newInstance()
        setFragment(detailsFragment)
    }

    //
    private fun initBottomNavigationView() {
        binding.navigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.action_home ->{
                    setFragment(homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.action_income -> {
                    setFragment(incomeFragment)
                    return@setOnItemSelectedListener true
                }

                R.id.action_outcome -> {
                    setFragment(outcomeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.action_details -> {
                    setFragment(detailsFragment)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }

    private fun setFragment(fragment: Fragment){
        val transaction =  supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
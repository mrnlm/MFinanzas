package mariana.lzry.finanzas.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.MainActivityBinding
import mariana.lzry.finanzas.presentation.view.details.DetailsFragment
import mariana.lzry.finanzas.presentation.view.income.IncomeFragment
import mariana.lzry.finanzas.presentation.view.outcome.OutcomeFragment
import mariana.lzry.finanzas.presentation.view.settings.SettingsFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding
    private lateinit var detailsFragment: DetailsFragment
    private lateinit var incomeFragment: IncomeFragment
    private lateinit var outcomeFragment: OutcomeFragment
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

    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finish()
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Presiona BACK de nuevo para salir", Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed(
            { doubleBackToExitPressedOnce = false },
            2000
        )
    }

    private fun initView(){
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFragmentView()
        initBottomNavigationView()
    }

    private fun initFragmentView(){
        detailsFragment = DetailsFragment.newInstance()
        incomeFragment = IncomeFragment.newInstance()
        outcomeFragment = OutcomeFragment.newInstance()
        settingsFragment = SettingsFragment.newInstance()
        setFragment(detailsFragment)
    }

    private fun initBottomNavigationView() {
        binding.navigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.action_details -> {
                    setFragment(detailsFragment)
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
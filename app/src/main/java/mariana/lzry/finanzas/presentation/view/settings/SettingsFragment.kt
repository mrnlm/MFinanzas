package mariana.lzry.finanzas.presentation.view.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.databinding.SettingsFragmentBinding
import mariana.lzry.finanzas.presentation.controller.SettingsController
import javax.inject.Inject

@AndroidEntryPoint
class SettingsFragment @Inject constructor(): Fragment() {

    @Inject
    lateinit var settingsController: SettingsController

    private var _binding : SettingsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SettingsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.incomeCategoriesRecyclerview.adapter =
            IncomeCategoriesAdapter(settingsController.getAllIncomeCategories())
        val outcomeCategories = settingsController.getAllOutcomeCategories()
        android.util.Log.d("MarianaDebug", "size="+outcomeCategories.size)
        binding.outcomeCategoriesRecyclerview.adapter =
            OutcomeCategoriesAdapter(outcomeCategories)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): SettingsFragment = SettingsFragment()
    }
}
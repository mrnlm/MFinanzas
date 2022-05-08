package mariana.lzry.finanzas.presentation.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.HomeFragmentBinding
import mariana.lzry.finanzas.presentation.controller.HomeController
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment: Fragment() {

    @Inject
    lateinit var homeController : HomeController

    private var _binding : HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val totalIncome = homeController.getAllIncomeEntries().sumOf { it.amount }
        val totalOutcome = homeController.getAllOutcomeEntries().sumOf { it.amount }
        binding.textViewTotalIncome.text = getString(R.string.title_home_total_income, totalIncome)
        binding.textViewTotalOutcome.text = getString(R.string.title_home_total_outcome, totalOutcome)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }


}

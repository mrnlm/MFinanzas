package mariana.lzry.finanzas.presentation.view.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.DetailsFragmentBinding
import mariana.lzry.finanzas.presentation.controller.DetailsController
import javax.inject.Inject

@AndroidEntryPoint
class DetailsFragment: Fragment() {

    @Inject
    lateinit var detailsController: DetailsController

    private var _binding : DetailsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DetailsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.detailsIncomeEntriesRecyclerview.adapter =
            IncomeEntriesAdapter(detailsController.getAllIncomeEntries())
        binding.detailsOutcomeEntriesRecyclerview.adapter =
            OutcomeEntriesAdapter(detailsController.getAllOutcomeEntries())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): DetailsFragment = DetailsFragment()
    }
}
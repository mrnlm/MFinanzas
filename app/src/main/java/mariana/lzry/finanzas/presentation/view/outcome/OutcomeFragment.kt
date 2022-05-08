package mariana.lzry.finanzas.presentation.view.outcome

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.OutcomeFragmentBinding
import mariana.lzry.finanzas.presentation.controller.OutcomeController
import javax.inject.Inject

@AndroidEntryPoint
class OutcomeFragment : Fragment(),
    AdapterView.OnItemSelectedListener
{

    @Inject
    lateinit var outcomeController: OutcomeController

    private var _binding: OutcomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = OutcomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        createOutcomeCategorySpinner()
        setSaveOutcomeClickListener()
        setOutcomeAmountTextWatcher()
    }

    private fun createOutcomeCategorySpinner(){
        val arrayList: ArrayList<String> = ArrayList(
            outcomeController.getAllCategories().map { it.title }
        )
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            arrayList
        )
        binding.outcomeCategoriesSpinner.adapter = arrayAdapter
        binding.outcomeCategoriesSpinner.onItemSelectedListener = this
    }

    private fun setOutcomeAmountTextWatcher() {
        binding.textInputLayout.editText?.addTextChangedListener(
            outcomeController.textWatcher
        )
    }

    private fun setSaveOutcomeClickListener(){
        android.util.Log.d("Mariana debug", "onClickSaveOutcome")
        binding.saveOutcome.setOnClickListener {
            hideKeyboard()
            val isAmountFieldVerified = outcomeController.verifyAmountSet()
            if(isAmountFieldVerified) {
                binding.textInputLayout.error = null
                Toast.makeText(requireContext(), R.string.outcome_succesfully_saved, Toast.LENGTH_SHORT).show()
            } else{
                binding.textInputLayout.error = getString(R.string.outcome_unsuccesfully_saved)
            }
        }
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        outcomeController.selectOutcomeCategory(p2)
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {}

    private fun hideKeyboard() {
        val inputManager = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE)
        (inputManager as InputMethodManager).hideSoftInputFromWindow(view?.windowToken, 0)
    }


    companion object {
        fun newInstance(): OutcomeFragment = OutcomeFragment()
    }
}
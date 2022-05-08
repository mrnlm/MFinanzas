package mariana.lzry.finanzas.presentation.view.income

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
import mariana.lzry.finanzas.databinding.IncomeFragmentBinding
import mariana.lzry.finanzas.presentation.controller.IncomeController
import javax.inject.Inject

@AndroidEntryPoint
class IncomeFragment : Fragment(),
    AdapterView.OnItemSelectedListener
{
    @Inject
    lateinit var  incomeController: IncomeController

    private var _binding : IncomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = IncomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        createIncomeCategorySpinner()
        setIncomeAmountTextWatcher()
        setSaveIncomeClickListener()
    }

    private fun createIncomeCategorySpinner(){
        val arrayList: ArrayList<String> = ArrayList(
            incomeController.getAllCategories().map { it.title }
        )
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            arrayList
        )
        binding.incomeCategoriesSpinner.adapter = arrayAdapter
        binding.incomeCategoriesSpinner.onItemSelectedListener = this
    }

    private fun setIncomeAmountTextWatcher(){
        binding.textInputLayout.editText?.addTextChangedListener(
            incomeController.textWatcher
        )
    }

    private fun setSaveIncomeClickListener(){
        binding.saveIncome.setOnClickListener(){
            hideKeyboard()
            val fieldsAreVerified = incomeController.verifyAmountAndCategoryAreSet()
            if(fieldsAreVerified){
                binding.textInputLayout.error = null
                Toast.makeText(requireContext(), R.string.income_succesfully_saved, Toast.LENGTH_SHORT).show()
            } else {
                binding.textInputLayout.error = getString(R.string.income_unsuccesfully_saved)
            }
        }
    }

    private fun hideKeyboard(){
        val inputManager = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE)
        (inputManager as InputMethodManager).hideSoftInputFromWindow(view?.windowToken, 0)
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        incomeController.selectIncomeCategory(p2)
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {}

    companion object {
        fun newInstance(): IncomeFragment = IncomeFragment()
    }
}
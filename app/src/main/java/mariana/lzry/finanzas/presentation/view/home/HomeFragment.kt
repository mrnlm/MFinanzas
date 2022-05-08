package mariana.lzry.finanzas.presentation.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.databinding.HomeFragmentBinding
import mariana.lzry.finanzas.presentation.controller.HomeController
import mariana.lzry.finanzas.presentation.view.details.DetailsFragment
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment: Fragment() {

    @Inject
    lateinit var homeController : HomeController
    //TODO  1:25

    private var _binding : HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }


}

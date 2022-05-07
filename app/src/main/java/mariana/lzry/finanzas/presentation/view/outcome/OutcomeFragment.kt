package mariana.lzry.finanzas.presentation.view.outcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.R

@AndroidEntryPoint
class OutcomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.outcome_fragment, container, false)
    }

    companion object {
        fun newInstance(): OutcomeFragment = OutcomeFragment()
    }
}
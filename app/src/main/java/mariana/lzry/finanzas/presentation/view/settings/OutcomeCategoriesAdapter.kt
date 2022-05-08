package mariana.lzry.finanzas.presentation.view.settings

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.ItemIncomeCategoryBinding
import mariana.lzry.finanzas.presentation.model.Category

class OutcomeCategoriesAdapter(
    private val data: List<Category>
): RecyclerView.Adapter<OutcomeCategoriesAdapter.OutcomeCategoryViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OutcomeCategoryViewHolder {
        val binding = ItemIncomeCategoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OutcomeCategoryViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(
        holder: OutcomeCategoryViewHolder,
        position: Int
    ) {
        holder.textViewTitle.text = data[position].title
    }

    class OutcomeCategoryViewHolder(
        itemBinding: ItemIncomeCategoryBinding
    ): RecyclerView.ViewHolder(itemBinding.root){
        val textViewTitle: TextView = itemView.findViewById(R.id.title)
    }
}
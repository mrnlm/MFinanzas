package mariana.lzry.finanzas.presentation.view.details

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.ItemIncomeEntryBinding
import mariana.lzry.finanzas.presentation.model.IncomeEntry

class IncomeEntriesAdapter(
    private val data: List<IncomeEntry>
): RecyclerView.Adapter<IncomeEntriesAdapter.IncomeEntryViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IncomeEntryViewHolder {
        val binding = ItemIncomeEntryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return IncomeEntryViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(
        holder: IncomeEntryViewHolder,
        position: Int
    ) {
        holder.textViewTitle.text =
            holder.textViewTitle.context.getString(
                R.string.item_category_string,
                data[position].amount,
                data[position].category,
                data[position].date,
            )
    }

    class IncomeEntryViewHolder(
        itemBinding: ItemIncomeEntryBinding
    ): RecyclerView.ViewHolder(itemBinding.root){
        val textViewTitle: TextView = itemView.findViewById(R.id.title)
    }
}
package mariana.lzry.finanzas.presentation.view.details

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.ItemOutcomeEntryBinding
import mariana.lzry.finanzas.presentation.model.OutcomeEntry

class OutcomeEntriesAdapter(
    private val allOutcomeEntries: List<OutcomeEntry>
) : RecyclerView.Adapter<OutcomeEntriesAdapter.OutcomeEntryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutcomeEntryViewHolder {
        val binding = ItemOutcomeEntryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OutcomeEntriesAdapter.OutcomeEntryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OutcomeEntryViewHolder, position: Int)  {
        holder.textViewTitle.text =
            holder.textViewTitle.context.getString(
                R.string.item_category_string,
                allOutcomeEntries[position].amount,
                allOutcomeEntries[position].category,
                allOutcomeEntries[position].date,
            )
    }

    override fun getItemCount(): Int = allOutcomeEntries.size

    class OutcomeEntryViewHolder(
        itemBinding: ItemOutcomeEntryBinding
    ) : RecyclerView.ViewHolder(itemBinding.root){
        val textViewTitle: TextView = itemView.findViewById(R.id.title)
    }
}

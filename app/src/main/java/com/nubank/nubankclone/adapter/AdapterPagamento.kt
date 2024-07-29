package com.nubank.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nubank.nubankclone.databinding.PagamentoItemBinding
import com.nubank.nubankclone.model.Pagamento

class AdapterPagamento(private val context: Context, private val listaPagamentos: List<Pagamento>) :
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding = PagamentoItemBinding.inflate(inflater, parent, false)
        return PagamentoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
        val pagamento = listaPagamentos[position]
        holder.bind(pagamento)
    }

    override fun getItemCount(): Int {
        return listaPagamentos.size
    }

    inner class PagamentoViewHolder(private val binding: PagamentoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pagamento: Pagamento) {
            pagamento.icone?.let { binding.icPagamento.setImageResource(it) }
            binding.txtTituloPagamento.text = pagamento.titulo
        }
    }
}
package com.example.retrofit.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import com.example.retrofit.databinding.DataItemBinding
import com.example.retrofit.model.FakeStore
import com.willy.ratingbar.ScaleRatingBar


class DataAdapter(
        private var datas:List<FakeStore>
):RecyclerView.Adapter<DataAdapter.MyViewHolder>() {
        class MyViewHolder(val binding:DataItemBinding):RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
                val binding:DataItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                        R.layout.data_item,
                        parent,
                        false)

                return MyViewHolder(binding)

        }

        override fun getItemCount(): Int {
                return asyncListDiffer.currentList.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
                holder.binding.data = asyncListDiffer.currentList[position]
        }
//        fun updateData(newData: List<FakeStore>) {
//                datas = newData
//                notifyDataSetChanged()
//        }
        private val diffUtil = object : DiffUtil.ItemCallback<FakeStore>(){
                override fun areItemsTheSame(oldItem: FakeStore, newItem: FakeStore): Boolean {
                        return oldItem.id == newItem.id
                }

                override fun areContentsTheSame(oldItem: FakeStore, newItem: FakeStore): Boolean {
                        return oldItem == newItem
                }
        }
        private val asyncListDiffer = AsyncListDiffer(this,diffUtil)
        fun saveData(dataResponse:List<FakeStore>){
                asyncListDiffer.submitList(dataResponse)
        }



}
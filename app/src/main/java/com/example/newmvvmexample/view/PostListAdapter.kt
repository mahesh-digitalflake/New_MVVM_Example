package com.example.newmvvmexample.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newmvvmexample.R
import com.example.newmvvmexample.model.Post

class PostListAdapter(private val postList:ArrayList<Post>):RecyclerView.Adapter<PostViewHolder>()
{
    fun updatePostList(newUpdatedPosts:List<Post>)
    {
        postList.clear()
        postList.addAll(newUpdatedPosts)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
    val inflater=LayoutInflater.from(parent.context)
    val view=inflater.inflate(R.layout.post_item,parent,false)
    return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.useridTxt.text=postList[position].userid.toString()
        holder.idTxt.text=postList[position].id.toString()
        holder.titleTxt.text=postList[position].title
        holder.bodyTxt.text=postList[position].body
    }

    override fun getItemCount(): Int {
    return postList.size
    }

}

class PostViewHolder(view:View):RecyclerView.ViewHolder(view)
{
    val useridTxt=view.findViewById<TextView>(R.id.useridTxt)
    val idTxt=view.findViewById<TextView>(R.id.idTxt)
    val titleTxt=view.findViewById<TextView>(R.id.titleTxt)
    val bodyTxt=view.findViewById<TextView>(R.id.bodyTxt)
}
package kg.geektech.instapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.instapp.R
import kg.geektech.instapp.data.entity.Post

class PostsAdapter(private val postsList: ArrayList<Post>) :
    RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {

    inner class PostsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val avatarIcon: ImageView = itemView.findViewById(R.id.avatar_icon)
        val postImage: ImageView = itemView.findViewById(R.id.postImage)
        val nickname: TextView = itemView.findViewById(R.id.nickname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.posts_item, parent, false)
        return PostsViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        val post = postsList[position]
        holder.nickname.text = post.nickname
        holder.avatarIcon.setImageResource(post.avatarIcon)
        holder.postImage.setImageResource(post.postImage)
    }

    override fun getItemCount(): Int {
        return postsList.size
    }


}

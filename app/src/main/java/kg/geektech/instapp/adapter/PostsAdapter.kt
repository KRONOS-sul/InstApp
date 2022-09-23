package kg.geektech.instapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kg.geektech.instapp.data.entity.Post
import kg.geektech.instapp.databinding.PostsItemBinding

class PostsAdapter(private val postsList: List<Post>) :
    RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {

//    private val nicks = arrayOf(
//        "Pасстояние в несколько нажатий\n    от следующей процедуры",
//        "Найди свой лучший салон", "Сделай свою запись-легкой"
//    )


    inner class PostsViewHolder(val binding: PostsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

//        fun bind(position: Int) {
//            nickname.text = nicks[position]
//            Glide.with(avatarIcon).load(R.drawable.shallty).circleCrop().into(avatarIcon)
//        }
//
//        private val avatarIcon: ImageView = itemView.findViewById(R.id.avatar_icon)
//        private val postImage: ImageView = itemView.findViewById(R.id.postImage)
//        private val nickname: TextView = itemView.findViewById(R.id.nickname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val binding = PostsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        with(holder) {
            binding.nickname.text = postsList[position].nicknamePost
            val avatarURLs = postsList[position].avatarIconPost
            val postURLs = postsList[position].postImagePost

            Glide.with(binding.avatarIcon)
                .load(avatarURLs)
                .skipMemoryCache(true).into(binding.avatarIcon)
            Glide.with(binding.postImage)
                .load(postURLs)
                .skipMemoryCache(false).into(binding.postImage)
        }
    }

    override fun getItemCount(): Int {
        return postsList.size
    }


}

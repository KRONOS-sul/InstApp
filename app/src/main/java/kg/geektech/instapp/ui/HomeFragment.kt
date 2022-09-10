package kg.geektech.instapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geektech.instapp.R
import kg.geektech.instapp.adapter.PostsAdapter
import kg.geektech.instapp.data.entity.Post
import kg.geektech.instapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var postAdapter: PostsAdapter
    private lateinit var postList: ArrayList<Post>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.recycler.layoutManager = LinearLayoutManager(context)

        postList = ArrayList()

        postList.add(Post("jhgjhg", R.drawable.shallty, R.drawable.shallty))
        postList.add(Post("cultan_dz", R.drawable.shallty, R.drawable.shallty))
        postList.add(Post("konus-0i", R.drawable.shallty, R.drawable.shallty))


        postAdapter = PostsAdapter(postList)
        binding.recycler.adapter = postAdapter

        return binding.root
    }

}
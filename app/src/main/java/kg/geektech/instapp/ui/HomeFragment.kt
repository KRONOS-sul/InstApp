package kg.geektech.instapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kg.geektech.instapp.adapter.PostsAdapter
import kg.geektech.instapp.data.entity.Post
import kg.geektech.instapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var postAdapter: PostsAdapter
    private lateinit var postList: List<Post>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        loadPost()

        postAdapter = PostsAdapter(postList)
        binding.recycler.adapter = postAdapter

//        postList = ArrayList()

//        postList.add(Post("jhgjhg", R.drawable.shallty, R.drawable.shallty))
//        postList.add(Post("cultan_dz", R.drawable.shallty, R.drawable.shallty))
//        postList.add(Post("konus-0i", R.drawable.shallty, R.drawable.shallty))

        //ПОНЯТЬ КАК ЗАПОЛНИТЬ АЙТЕМЫ БЕЗ ADDD

//        postAdapter = PostsAdapter(postList)
//        binding.recycler.adapter = postAdapter

        return binding.root
    }

    private fun loadPost() {
        postList = listOf(
            Post(
                "jhgjhg",
                "https://preview.redd.it/70ipwwq2df361.jpg?auto=webp&s=2122f18b164eaaa99084304c8a2de0204cf5c6bc",
                "https://i.scdn.co/image/ab67616d0000b273f080f366a8186c65f821eb94"
            ),
            Post(
                "Cultan_dz",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyT1jfblljnZB6DouFld7JK-Ma8KGVXgXzdqkwUDVwKlTuiM0-AnxEw0Xa5fucaxD4KcI&usqp=CAU",
                "https://deadline.com/wp-content/uploads/2021/07/Travolta.jpg?crop=0px%2C1px%2C400px%2C224px&resize=681%2C383"
            )
        )
    }

}
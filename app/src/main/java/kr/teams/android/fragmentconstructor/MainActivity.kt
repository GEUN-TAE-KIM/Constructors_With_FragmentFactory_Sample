package kr.teams.android.fragmentconstructor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import kr.teams.android.fragmentconstructor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        // FragmentFactory 설정
        supportFragmentManager.fragmentFactory = HomeFragmentFactory("Test")

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // HomeFragment를 동적으로 추가
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace(R.id.nav_host_fragment_activity_main, HomeFragment::class.java, null)
            }
        }
    }

}
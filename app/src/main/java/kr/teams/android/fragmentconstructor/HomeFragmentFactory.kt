package kr.teams.android.fragmentconstructor

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class HomeFragmentFactory(private val message: String) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            HomeFragment::class.java.name -> HomeFragment(message)
            else -> super.instantiate(classLoader, className)
        }
    }
}
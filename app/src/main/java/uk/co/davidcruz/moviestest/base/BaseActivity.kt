package uk.co.davidcruz.moviestest.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import uk.co.davidcruz.moviestest.App
import uk.co.davidcruz.moviestest.di.ApplicationComponent

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    protected lateinit var binding: VB

    private var _appComponent: ApplicationComponent? = null
    protected val appComponent get() = _appComponent!!

    abstract fun createViewBinding(): VB

    abstract fun initLifeCycleScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        _appComponent = (application as App).applicationComponent
        super.onCreate(savedInstanceState)
        binding = createViewBinding()
        setContentView(binding.root)
        initLifeCycleScope()
    }

}
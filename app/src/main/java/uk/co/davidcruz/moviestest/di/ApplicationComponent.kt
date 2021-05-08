package uk.co.davidcruz.moviestest.di

import android.app.Application
import uk.co.davidcruz.moviestest.di.modules.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import uk.co.davidcruz.moviestest.di.modules.ApplicationModule
import uk.co.davidcruz.moviestest.di.modules.ViewModelModule
import uk.co.davidcruz.moviestest.ui.main.MainActivity
import uk.co.davidcruz.moviestest.di.modules.ServiceModule
import uk.co.davidcruz.moviestest.di.modules.UseCasesModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        ViewModelModule::class,
        ServiceModule::class,
        RepositoryModule::class,
        UseCasesModule::class
    ]
)
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): ApplicationComponent
    }

}
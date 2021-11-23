package dev.petedoyle.snappy

import android.content.Context
import dev.petedoyle.snappy.cart.CartStore
import dev.petedoyle.snappy.cart.LocalCartStore
import dev.petedoyle.snappy.common.coroutines.DefaultDispatcherProvider
import dev.petedoyle.snappy.common.coroutines.DispatcherProvider
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    companion object {
        @Provides
        @Singleton
        fun provideApplicationContext(@ApplicationContext appContext: Context): Context = appContext

        @Provides
        @Singleton
        fun provideAppUpdateManager(context: Context): AppUpdateManager =
            AppUpdateManagerFactory.create(context)

        @Provides
        @Singleton
        fun provideDispatcherProvider(): DispatcherProvider = DefaultDispatcherProvider()

        @Provides
        @Singleton
        fun provideCartStore(): CartStore = LocalCartStore()
    }
}
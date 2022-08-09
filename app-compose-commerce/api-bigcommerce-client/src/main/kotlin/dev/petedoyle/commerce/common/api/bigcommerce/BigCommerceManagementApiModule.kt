package dev.petedoyle.commerce.common.api.bigcommerce

import android.content.Context
import android.content.res.Resources
import android.util.Log
import dev.petedoyle.commerce.common.api.moshi.BigDecimalAdapter
import dev.petedoyle.commerce.common.api.moshi.LocalDateAdapter
import dev.petedoyle.commerce.common.api.moshi.OffsetDateTimeAdapter
import com.slack.eithernet.ApiResultCallAdapterFactory
import com.slack.eithernet.ApiResultConverterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.addAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class BigCommerceManagementApiModule {
    companion object {

        private const val MODULE_NAME = "bigcommerce-management"

        @Provides
        @Singleton
        @Named(MODULE_NAME)
        fun provideResources(@ApplicationContext context: Context): Resources =
            context.resources

        @ExperimentalStdlibApi
        @Provides
        @Singleton
        @Named(MODULE_NAME)
        fun providesMoshi(): Moshi = Moshi.Builder()
            .addAdapter(BigDecimalAdapter)
            .addAdapter(OffsetDateTimeAdapter)
            .addAdapter(LocalDateAdapter)
            .build()

        @Provides
        @Singleton
        @Named(MODULE_NAME)
        fun providesOkHttpLoggingInterceptor(): HttpLoggingInterceptor =
            HttpLoggingInterceptor { message ->
                Log.d("OkHttp", message)
            }.apply {
                level = HttpLoggingInterceptor.Level.BODY
            }

        @Provides
        @Singleton
        @Named(MODULE_NAME)
        fun providesOkHttpClient(
            @Named(MODULE_NAME) httpLoggingInterceptor: HttpLoggingInterceptor,
            @Named(MODULE_NAME) resources: Resources,
        ): OkHttpClient =
            OkHttpClient.Builder()
                .addInterceptor {
                    it.proceed(
                        it.request()
                            .newBuilder()
                            .addHeader("X-Auth-Token", resources.getString(R.string.bigcommerce_access_token))
                            .build()
                    )
                }
                .addInterceptor(httpLoggingInterceptor)
                .build()

        @Provides
        @Singleton
        @Named(MODULE_NAME)
        fun providesRetrofit(
            @Named(MODULE_NAME) okHttpClient: OkHttpClient,
            @Named(MODULE_NAME) moshi: Moshi,
            @Named(MODULE_NAME) resources: Resources,
        ): Retrofit =
            Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(ApiResultConverterFactory)
                .addCallAdapterFactory(ApiResultCallAdapterFactory)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .baseUrl(resources.getString(R.string.bigcommerce_base_url))
                .build()

        @Provides
        @Singleton
        fun provideBigCommerceManagementApi(@Named(MODULE_NAME) retrofit: Retrofit): BigCommerceManagementApi =
            retrofit.create(BigCommerceManagementApi::class.java)
    }
}
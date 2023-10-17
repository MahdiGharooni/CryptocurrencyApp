package com.plcoding.cryptocurrencyapp.di

import com.plcoding.cryptocurrencyapp.common.Constants.BASE_URL
import com.plcoding.cryptocurrencyapp.data.CoinPaprikaApi
import com.plcoding.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.plcoding.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

//    @Singleton
//    @Provides
//    fun provideARepo(api: CoinPaprikaApi): CoinRepository {
//        return CoinRepositoryImpl(api)
//    }


}
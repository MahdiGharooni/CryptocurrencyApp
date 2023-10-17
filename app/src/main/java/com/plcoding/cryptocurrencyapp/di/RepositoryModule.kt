package com.plcoding.cryptocurrencyapp.di

import com.plcoding.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.plcoding.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindRepository(repo: CoinRepositoryImpl): CoinRepository


}
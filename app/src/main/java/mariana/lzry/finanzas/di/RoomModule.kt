package mariana.lzry.finanzas.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import mariana.lzry.finanzas.data.database.FinanzasDatabase
import javax.inject.Singleton
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val INCOME_CATEGORIES_NAME = "income_categories_database"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            FinanzasDatabase::class.java,
            INCOME_CATEGORIES_NAME
        )
            .createFromAsset("db/incomecategories.db")
            .fallbackToDestructiveMigration()
            .build()

    @Singleton
    @Provides
    fun provideIncomeCategoriesDao(db: FinanzasDatabase) =
        db.getIncomeCategoryDao()

    @Singleton
    @Provides
    fun provideIncomeEntityDao(db: FinanzasDatabase) =
        db.insertIncomeEntryDao()

    @Singleton
    @Provides
    fun providegetIncomeEntityDao(db: FinanzasDatabase) =
        db.getAllIncomeEntriesDao()
}
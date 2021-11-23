package dev.petedoyle.snappy.ui

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import app.cash.turbine.test
import dev.petedoyle.snappy.common.test.android.AndroidTestBase
import dev.petedoyle.snappy.cart.CartStore
import dev.petedoyle.snappy.cart.LocalCartStore
import dev.petedoyle.snappy.ui.MainActivityActions.AppStarting
import dev.petedoyle.snappy.ui.MainViewModelEffects.AppUpdateNotAvailableEffect
import dev.petedoyle.snappy.ui.MainViewModelEffects.AppUpdateAvailableEffect
import com.google.android.play.core.appupdate.testing.FakeAppUpdateManager
import com.google.android.play.core.install.model.AppUpdateType
import com.nhaarman.expect.expect
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

@ExperimentalCoroutinesApi
class MainActivityViewModelTest : AndroidTestBase() {
    private lateinit var viewModel: MainViewModel
    private val context: Context = ApplicationProvider.getApplicationContext()
    private val fakeAppUpdateManager = FakeAppUpdateManager(context)
    private val cartStore: CartStore = LocalCartStore()

    @Before
    fun setup() {
        viewModel = MainViewModel(
            appUpdateManager = fakeAppUpdateManager,
            cartStore = cartStore,
            dispatcherProvider = coroutinesTestRule.testDispatcherProvider,
        )
    }

    @Test
    fun actionAppStartingShouldEmitWhenAppIsUpToDate() = runTest {
        // Given
        fakeAppUpdateManager.setUpdateNotAvailable()

        viewModel.effectFlow.test {
            // When
            viewModel.onAction(AppStarting)

            // Then
            expect(awaitItem()).toBe(AppUpdateNotAvailableEffect)
        }
    }

    @Test
    @Ignore
    fun actionAppStartingShouldEmitWhenAppUpdateAvailable() = runTest {
        // Given
        fakeAppUpdateManager.setUpdateAvailable(FAKE_VERSION_CODE)

        viewModel.effectFlow.test {
            // When
            viewModel.onAction(AppStarting)

            // Then
            expect(awaitItem()).toBeInstanceOf<AppUpdateAvailableEffect> { effect ->
                expect(effect.appUpdateInfo.availableVersionCode()).toBe(FAKE_VERSION_CODE)
            }
        }
    }

    @Test
    @Ignore
    fun actionAppStartingShouldEmitWhenFlexibleAppUpdateAvailable() = runTest {
        // Given
        fakeAppUpdateManager.setUpdateAvailable(FAKE_VERSION_CODE, AppUpdateType.FLEXIBLE)

        viewModel.effectFlow.test {
            // When
            viewModel.onAction(AppStarting)

            // Then
            expect(awaitItem()).toBeInstanceOf<AppUpdateAvailableEffect> { effect ->
                expect(effect.appUpdateInfo.availableVersionCode()).toBe(FAKE_VERSION_CODE)
            }
        }
    }

    @Test
    @Ignore
    fun actionAppStartingShouldEmitWhenImmediateAppUpdateAvailable() = runTest {
        // Given
        fakeAppUpdateManager.setUpdateAvailable(FAKE_VERSION_CODE, AppUpdateType.IMMEDIATE)

        viewModel.effectFlow.test {
            // When
            viewModel.onAction(AppStarting)

            // Then
            expect(awaitItem()).toBeInstanceOf<AppUpdateAvailableEffect> { effect ->
                expect(effect.appUpdateInfo.availableVersionCode()).toBe(FAKE_VERSION_CODE)
            }
        }
    }

    companion object {
        private const val FAKE_VERSION_CODE = 9999
    }
}
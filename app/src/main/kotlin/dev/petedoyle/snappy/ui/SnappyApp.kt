package dev.petedoyle.snappy.ui

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import dev.petedoyle.snappy.ui.cart.CartScreen
import dev.petedoyle.snappy.ui.home.HomeScreen
import dev.petedoyle.snappy.ui.productdetail.ProductDetailScreen
import dev.petedoyle.snappy.ui.productdetail.ProductDetailScreenViewModel
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object ProductDetail : Screen("product/{productId}") {
        fun createRoute(productId: Int) = "product/$productId"
    }

    object Cart : Screen("cart")
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun SnappyApp(appState: SnappyAppState = rememberAppState()) {
    ProvideWindowInsets {
        AnimatedNavHost(
            navController = appState.navController,
            startDestination = Screen.Home.route,
            enterTransition = {
                slideIntoContainer(AnimatedContentScope.SlideDirection.Left, tween(400))
            },
            exitTransition = {
                slideOutOfContainer(AnimatedContentScope.SlideDirection.Left, tween(400))
            },
            popEnterTransition = {
                slideIntoContainer(AnimatedContentScope.SlideDirection.Right, tween(400))
            },
            popExitTransition = {
                slideOutOfContainer(AnimatedContentScope.SlideDirection.Right, tween(400))
            },
        ) {
            composable(Screen.Home.route) {
                HomeScreen(hiltViewModel(), appState.navController)
            }
            composable(Screen.ProductDetail.route) {
                val viewModel: ProductDetailScreenViewModel = hiltViewModel()
                viewModel.init(productId = it.arguments?.getString("productId")?.toInt() ?: 0)
                ProductDetailScreen(viewModel, appState.navController)
            }
            composable(Screen.Cart.route) {
                CartScreen(hiltViewModel(), appState.navController)
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun rememberAppState(
    navController: NavHostController = rememberAnimatedNavController(),
) = remember(navController) {
    SnappyAppState(navController)
}

class SnappyAppState(
    val navController: NavHostController,
)
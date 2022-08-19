import java.net.URI

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenLocal {
      mavenContent {
        snapshotsOnly() // only pull `-SNAPSHOT` versions from mavenLocal()
      }
    }
    google()
    mavenCentral()
    maven { url = URI.create("https://jitpack.io") }
  }
}

rootProject.name = "Compose Samples"
include(":apps:compose-commerce:app")
include(":apps:compose-commerce:api:bigcommerce-models-carts-v3")
include(":apps:compose-commerce:api:bigcommerce-models-catalog-v3")
include(":apps:compose-commerce:api:bigcommerce-client")
include(":apps:compose-movie-search:app")
include(":common:coroutine-dispatchers")
include(":common:design-system")
include(":common:flux")
include(":common:mvi")
include(":common:mvi-test")
include(":common:test-android")
include(":common:test-unit")

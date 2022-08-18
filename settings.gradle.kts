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

rootProject.name = "Samples - Pete Doyle"
include(":app:compose-commerce:app")
include(":app:compose-commerce:api-bigcommerce-catalog-v3")
include(":app:compose-commerce:api-bigcommerce-carts-v3")
include(":app:compose-commerce:api-bigcommerce-client")
include(":app:compose-movie-search:app")
include(":core:coroutine-dispatchers")
include(":core:design-system")
include(":core:flux")
include(":core:mvi")
include(":core:mvi-test")
include(":core:test-android")
include(":core:test-unit")

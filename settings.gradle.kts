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

rootProject.name = "Snappy"
include(":app")
include(":common-api-bigcommerce-catalog-v3")
include(":common-api-bigcommerce-carts-v3")
include(":common-api-bigcommerce-client")
include(":common-coroutine-dispatchers")
include(":common-flux")
include(":common-mvi")
include(":common-mvi-test")
include(":common-test-android")
include(":common-test-unit")
include(":common-design-system")

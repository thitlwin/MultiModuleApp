pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "YawKi"
include(":app")
include(":core")
include(":core:ui")
include(":core:util")
include(":feature")
include(":feature:splash")
include(":core:domain")
include(":core:domain")
include(":data")
include(":feature:onboarding")
include(":feature:auth")
include(":feature:signin")
include(":core:component")
include(":feature:signup")
include(":feature:home")

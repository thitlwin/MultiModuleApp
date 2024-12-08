plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    //    Hilt
    alias(libs.plugins.hilt.android.gradle)
    kotlin("kapt")
}

android {
    namespace = "com.thit.home"
    compileSdk = ProjectProperties.COMPILE_SDK

    defaultConfig {
        minSdk = ProjectProperties.MIN_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
//  Feature
    implementation(project(":core:util"))
    implementation(project(":core:component"))
    implementation(project(":core:domain"))
    implementation(project(":data"))

//    Default
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material3)
    implementation(libs.ui)
    implementation(libs.androidx.ui.tooling.preview)

//    Paging3
    implementation(libs.androidx.paging.runtime)
    implementation(libs.androidx.paging.compose)

    // Accompanist Pager
    implementation(libs.accompanist.pager)
    implementation(libs.accompanist.pager.indicators)


//    Coil
    implementation(libs.coil.compose)

//    Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

//    Test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //    Hilt
    implementation(libs.hilt.android)
    implementation(libs.androidx.hilt.navigation.compose)
    kapt(libs.hilt.android.compiler)

    //    Firebase
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.firestore.ktx)
}
kapt {
    correctErrorTypes = true
}
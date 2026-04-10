import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.ksp)
    alias(libs.plugins.room)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            // Coroutines
            implementation(libs.kotlinx.coroutines.core)

            // Date/Time
            implementation(libs.kotlinx.datetime)

            // Serialization
            implementation(libs.kotlinx.serialization.json)

            // Room
            implementation(libs.androidx.room.runtime)
            implementation(libs.androidx.sqlite.bundled)

            // DataStore
            implementation(libs.androidx.datastore.preferences)

            // Koin
            implementation(libs.koin.core)

            // ViewModel
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.prekogdevs.plantogether.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

// Room schema export directory (for migrations)
room {
    schemaDirectory("$projectDir/schemas")
}

// Room KSP - must run on each target
dependencies {
    ksp(libs.androidx.room.compiler)
}

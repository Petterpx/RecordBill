package com.petterp.plugin

object Versions {
    const val ktLint = "0.41.0"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0"
    const val ktLint = "com.pinterest:ktlint:${Versions.ktLint}"

    object GoogleMaps {
        const val maps = "com.google.android.libraries.maps:maps:3.1.0-beta"
        const val mapsKtx = "com.google.maps.android:maps-v3-ktx:2.2.0"
    }

    object Volley {
        const val volley = "com.android.volley:volley:1.2.0"
    }

    object Google {
        const val material = "com.google.android.material:material:1.4.0"
    }

    object Accompanist {
        private const val version = "0.18.0"
        const val insets = "com.google.accompanist:accompanist-insets:$version"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:$version"
        const val coli = "com.google.accompanist:accompanist-coil:0.15.0"
        const val swiperefresh = "com.google.accompanist:accompanist-swiperefresh:$version"
        const val flowlayout = "com.google.accompanist:flowlayout:$version"
        const val insetUi = "com.google.accompanist:insets-ui:$version"
        const val pager = "com.google.accompanist:pager:$version"
        const val drawblePainter = "com.google.accompanist:drawablePainter:$version"
        const val imageloadingCore = "com.google.accompanist:imageloading-core:0.15.0"
        const val navigationMaterial = "com.google.accompanist:navigation-material:$version"
        const val navigationAnimation = "com.google.accompanist:navigation-animation:$version"
        const val placeholder = "com.google.accompanist:placeholder:$version"
        const val placeholderMaterial = "com.google.accompanist:placeholder-material:$version"
        const val permissions = "com.google.accompanist:permissions:$version"
    }

    object Kotlin {
        private const val version = "1.5.21"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"

        object Coroutines {
            private const val version = "1.5.0"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
        }
    }

    object AndroidX {
        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.3.1"
        }

        const val appcompat = "androidx.appcompat:appcompat:1.3.0"

        object Compose {
            const val snapshot = ""
            const val version = "1.0.1"
            private const val navigationVersion = "2.4.0-alpha06"

            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val material = "androidx.compose.material:material:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val animation = "androidx.compose.animation:animation:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
            const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"
        }

        object Lifecycle {
            private const val version = "2.3.1"
            const val viewModelCompose =
                "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val runtTimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
            const val liveData = "androidx.compose.runtime:runtime-livedata:1.0.1"
        }

        object Test {
            private const val version = "1.4.0"
            const val core = "androidx.test:core:$version"
            const val runner = "androidx.test:runner:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }
    }

    object Hilt {
        private const val version = "2.38.1"

        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-compiler:$version"
        const val testing = "com.google.dagger:hilt-android-testing:$version"
    }

    object JUnit {
        private const val version = "4.13"
        const val junit = "junit:junit:$version"
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:1.3.0"
    }
}

object Urls {
    const val mavenCentralSnapshotRepo = "https://oss.sonatype.org/content/repositories/snapshots/"
    const val composeSnapshotRepo = "https://androidx.dev/snapshots/builds/" +
            "${Libs.AndroidX.Compose.snapshot}/artifacts/repository/"
}

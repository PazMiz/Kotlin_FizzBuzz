plugins {
    kotlin("android") version "1.6.10"
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.example.fizzbuzzkmm"
        minSdkVersion(16)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(enforcedPlatform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

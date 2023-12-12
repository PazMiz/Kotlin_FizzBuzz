# FizzBuzzKMM

FizzBuzzKMM is a Kotlin Multiplatform Mobile (KMM) project that demonstrates a simple FizzBuzz application shared between Android and iOS platforms.

## Project Structure

- `shared`: Contains the shared Kotlin code for FizzBuzz logic.
- `androidApp`: Android application module.
- `iosApp`: iOS application module.
- `build.gradle.kts`: Gradle build file for the entire project.

## Shared Module

### `FizzBuzz.kt`

- `getFizzBuzzValue(i: Int): String`: Returns the FizzBuzz value for a given number.
- `getColoredFizzBuzzValue(i: Int): String`: Returns a colored FizzBuzz value for a given number.

### Platform-Specific Implementations

- `FizzBuzzJvm.kt`: JVM-specific implementation of FizzBuzz functions.
- `FizzBuzzIos.kt`: iOS-specific implementation of FizzBuzz functions.

## Android Module

### `MainActivity.kt`

- `MainActivity`: Android main activity that utilizes the shared FizzBuzz logic.

## iOS Module

### `MainViewController.swift`

- `MainViewController`: iOS view controller that utilizes the shared FizzBuzz logic.

## Build and Run

To build and run the Android app:
```bash
./gradlew :androidApp:installDebug

To build and run the iOS app:

Open iosApp/iosApp.xcodeproj in Xcode.
Build and run the project in Xcode.
Requirements
Android Studio for Android development.
Xcode for iOS development.

Notes
This project is a basic example and may require additional setup for a production environment.
Ensure that your Kotlin and KMM plugins in Android Studio and Xcode are up to date.


By Paz Mizrahi

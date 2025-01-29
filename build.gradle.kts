// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.spotless)
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        ktlint("1.5.0")
            .setEditorConfigPath("$projectDir/.editorconfig")
            .editorConfigOverride(
                mapOf(
                    "package-name" to "disabled",
                ),
            )
        target("**/*.kt")
        targetExclude("**/build/**")
        // trimTrailingWhitespace()
        // endWithNewline()
    }
    kotlinGradle {
        target("*.gradle.kts")
        ktlint("1.5.0")
            .setEditorConfigPath("$projectDir/.editorconfig")
    }
}

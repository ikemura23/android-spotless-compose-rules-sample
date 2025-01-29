// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.spotless)
}

buildscript {
    dependencies {
        classpath(libs.ktlint)
    }
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        ktlint("1.5.0")
            .setEditorConfigPath("$projectDir/.editorconfig")
            .editorConfigOverride(
                mapOf(
                    "ktlint_standard_package-name" to "disabled",
                    "ktlint_standard_no-wildcard-imports" to "disabled",
                    "ktlint_standard_function-naming" to "disabled",
                ),
            )
            .customRuleSets(
                listOf(
                    "io.nlopez.compose.rules:ktlint:0.4.22"
                )
            )
        target("**/*.kt")
        targetExclude("**/build/**")
    }
    kotlinGradle {
        target("*.gradle.kts")
        ktlint("1.5.0")
            .setEditorConfigPath("$projectDir/.editorconfig")
    }
}

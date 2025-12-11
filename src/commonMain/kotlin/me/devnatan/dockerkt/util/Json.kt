package me.devnatan.dockerkt.util

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

private val json: Json =
    Json {
        ignoreUnknownKeys = true
        isLenient = true
        allowStructuredMapKeys = true
    }

public fun toJsonEncodedString(value: Any): String = json.encodeToString(value)

public fun fromJsonEncodedString(value: String): Map<String, String?> = json.decodeFromString(value)

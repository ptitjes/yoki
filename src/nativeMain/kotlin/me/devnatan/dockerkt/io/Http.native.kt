package me.devnatan.dockerkt.io

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.HttpClientEngineFactory
import me.devnatan.dockerkt.DockerClient

internal actual val defaultHttpClientEngine: HttpClientEngineFactory<*>? get() = null

internal actual fun <T : HttpClientEngineConfig> HttpClientConfig<out T>.configureHttpClient(client: DockerClient) {
    TODO("Native HTTP client is not supported for now")
}

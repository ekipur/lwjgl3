/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "meshoptimizer.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateVertexRemap(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong verticesAddress, jlong vertex_count, jlong vertex_size) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    void const *vertices = (void const *)(uintptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_generateVertexRemap(destination, indices, (size_t)index_count, vertices, (size_t)vertex_count, (size_t)vertex_size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateVertexRemapMulti(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_count, jlong streamsAddress, jlong stream_count) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    struct meshopt_Stream const *streams = (struct meshopt_Stream const *)(uintptr_t)streamsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_generateVertexRemapMulti(destination, indices, (size_t)index_count, (size_t)vertex_count, streams, (size_t)stream_count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateVertexRemapCustom(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong callbackAddress, jlong contextAddress) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    int (*callback) (void *, unsigned int, unsigned int) = (int (*) (void *, unsigned int, unsigned int))(uintptr_t)callbackAddress;
    void *context = (void *)(uintptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_generateVertexRemapCustom(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, callback, context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1remapVertexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong verticesAddress, jlong vertex_count, jlong vertex_size, jlong remapAddress) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    void const *vertices = (void const *)(uintptr_t)verticesAddress;
    unsigned int const *remap = (unsigned int const *)(uintptr_t)remapAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_remapVertexBuffer(destination, vertices, (size_t)vertex_count, (size_t)vertex_size, remap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1remapIndexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong remapAddress) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    unsigned int const *remap = (unsigned int const *)(uintptr_t)remapAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_remapIndexBuffer(destination, indices, (size_t)index_count, remap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateShadowIndexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong verticesAddress, jlong vertex_count, jlong vertex_size, jlong vertex_stride) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    void const *vertices = (void const *)(uintptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_generateShadowIndexBuffer(destination, indices, (size_t)index_count, vertices, (size_t)vertex_count, (size_t)vertex_size, (size_t)vertex_stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateShadowIndexBufferMulti(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_count, jlong streamsAddress, jlong stream_count) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    struct meshopt_Stream const *streams = (struct meshopt_Stream const *)(uintptr_t)streamsAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_generateShadowIndexBufferMulti(destination, indices, (size_t)index_count, (size_t)vertex_count, streams, (size_t)stream_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateAdjacencyIndexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_generateAdjacencyIndexBuffer(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateTessellationIndexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_generateTessellationIndexBuffer(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1generateProvokingIndexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong reorderAddress, jlong indicesAddress, jlong index_count, jlong vertex_count) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int *reorder = (unsigned int *)(uintptr_t)reorderAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_generateProvokingIndexBuffer(destination, reorder, indices, (size_t)index_count, (size_t)vertex_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1optimizeVertexCache(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_count) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_optimizeVertexCache(destination, indices, (size_t)index_count, (size_t)vertex_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1optimizeVertexCacheStrip(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_count) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_optimizeVertexCacheStrip(destination, indices, (size_t)index_count, (size_t)vertex_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1optimizeVertexCacheFifo(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_count, jint cache_size) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_optimizeVertexCacheFifo(destination, indices, (size_t)index_count, (size_t)vertex_count, (unsigned int)cache_size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1optimizeOverdraw(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jfloat threshold) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_optimizeOverdraw(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, threshold);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1optimizeVertexFetch(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong verticesAddress, jlong vertex_count, jlong vertex_size) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    unsigned int *indices = (unsigned int *)(uintptr_t)indicesAddress;
    void const *vertices = (void const *)(uintptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_optimizeVertexFetch(destination, indices, (size_t)index_count, vertices, (size_t)vertex_count, (size_t)vertex_size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1optimizeVertexFetchRemap(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_count) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_optimizeVertexFetchRemap(destination, indices, (size_t)index_count, (size_t)vertex_count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1encodeIndexBuffer(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buffer_size, jlong indicesAddress, jlong index_count) {
    unsigned char *buffer = (unsigned char *)(uintptr_t)bufferAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_encodeIndexBuffer(buffer, (size_t)buffer_size, indices, (size_t)index_count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1encodeIndexBufferBound(JNIEnv *__env, jclass clazz, jlong index_count, jlong vertex_count) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_encodeIndexBufferBound((size_t)index_count, (size_t)vertex_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1encodeIndexVersion(JNIEnv *__env, jclass clazz, jint version) {
    UNUSED_PARAMS(__env, clazz)
    meshopt_encodeIndexVersion(version);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeIndexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong index_count, jlong index_size, jlong bufferAddress, jlong buffer_size) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    unsigned char const *buffer = (unsigned char const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)meshopt_decodeIndexBuffer(destination, (size_t)index_count, (size_t)index_size, buffer, (size_t)buffer_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeIndexVersion(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buffer_size) {
    unsigned char const *buffer = (unsigned char const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)meshopt_decodeIndexVersion(buffer, (size_t)buffer_size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1encodeIndexSequence(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buffer_size, jlong indicesAddress, jlong index_count) {
    unsigned char *buffer = (unsigned char *)(uintptr_t)bufferAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_encodeIndexSequence(buffer, (size_t)buffer_size, indices, (size_t)index_count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1encodeIndexSequenceBound(JNIEnv *__env, jclass clazz, jlong index_count, jlong vertex_count) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_encodeIndexSequenceBound((size_t)index_count, (size_t)vertex_count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeIndexSequence(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong index_count, jlong index_size, jlong bufferAddress, jlong buffer_size) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    unsigned char const *buffer = (unsigned char const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)meshopt_decodeIndexSequence(destination, (size_t)index_count, (size_t)index_size, buffer, (size_t)buffer_size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1encodeVertexBuffer(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buffer_size, jlong verticesAddress, jlong vertex_count, jlong vertex_size) {
    unsigned char *buffer = (unsigned char *)(uintptr_t)bufferAddress;
    void const *vertices = (void const *)(uintptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_encodeVertexBuffer(buffer, (size_t)buffer_size, vertices, (size_t)vertex_count, (size_t)vertex_size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1encodeVertexBufferBound(JNIEnv *__env, jclass clazz, jlong vertex_count, jlong vertex_size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_encodeVertexBufferBound((size_t)vertex_count, (size_t)vertex_size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1encodeVertexBufferLevel(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buffer_size, jlong verticesAddress, jlong vertex_count, jlong vertex_size, jint level, jint version) {
    unsigned char *buffer = (unsigned char *)(uintptr_t)bufferAddress;
    void const *vertices = (void const *)(uintptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_encodeVertexBufferLevel(buffer, (size_t)buffer_size, vertices, (size_t)vertex_count, (size_t)vertex_size, level, version);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1encodeVertexVersion(JNIEnv *__env, jclass clazz, jint version) {
    UNUSED_PARAMS(__env, clazz)
    meshopt_encodeVertexVersion(version);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeVertexBuffer(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong vertex_count, jlong vertex_size, jlong bufferAddress, jlong buffer_size) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    unsigned char const *buffer = (unsigned char const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)meshopt_decodeVertexBuffer(destination, (size_t)vertex_count, (size_t)vertex_size, buffer, (size_t)buffer_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeVertexVersion(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buffer_size) {
    unsigned char const *buffer = (unsigned char const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)meshopt_decodeVertexVersion(buffer, (size_t)buffer_size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeFilterOct(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong count, jlong stride) {
    void *buffer = (void *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_decodeFilterOct(buffer, (size_t)count, (size_t)stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeFilterQuat(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong count, jlong stride) {
    void *buffer = (void *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_decodeFilterQuat(buffer, (size_t)count, (size_t)stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1decodeFilterExp(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong count, jlong stride) {
    void *buffer = (void *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_decodeFilterExp(buffer, (size_t)count, (size_t)stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1encodeFilterOct(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong count, jlong stride, jint bits, jlong dataAddress) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    float const *data = (float const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_encodeFilterOct(destination, (size_t)count, (size_t)stride, bits, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1encodeFilterQuat(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong count, jlong stride, jint bits, jlong dataAddress) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    float const *data = (float const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_encodeFilterQuat(destination, (size_t)count, (size_t)stride, bits, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1encodeFilterExp(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong count, jlong stride, jint bits, jlong dataAddress, jint mode) {
    void *destination = (void *)(uintptr_t)destinationAddress;
    float const *data = (float const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_encodeFilterExp(destination, (size_t)count, (size_t)stride, bits, data, (enum meshopt_EncodeExpMode)mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1simplify(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong target_index_count, jfloat target_error, jint options, jlong result_errorAddress) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    float *result_error = (float *)(uintptr_t)result_errorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_simplify(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, (size_t)target_index_count, target_error, (unsigned int)options, result_error);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1simplifyWithAttributes(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong vertex_attributesAddress, jlong vertex_attributes_stride, jlong attribute_weightsAddress, jlong attribute_count, jlong vertex_lockAddress, jlong target_index_count, jfloat target_error, jint options, jlong result_errorAddress) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    float const *vertex_attributes = (float const *)(uintptr_t)vertex_attributesAddress;
    float const *attribute_weights = (float const *)(uintptr_t)attribute_weightsAddress;
    unsigned char const *vertex_lock = (unsigned char const *)(uintptr_t)vertex_lockAddress;
    float *result_error = (float *)(uintptr_t)result_errorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_simplifyWithAttributes(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, vertex_attributes, (size_t)vertex_attributes_stride, attribute_weights, (size_t)attribute_count, vertex_lock, (size_t)target_index_count, target_error, (unsigned int)options, result_error);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1simplifySloppy(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong target_index_count, jfloat target_error, jlong result_errorAddress) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    float *result_error = (float *)(uintptr_t)result_errorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_simplifySloppy(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, (size_t)target_index_count, target_error, result_error);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1simplifyPrune(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jfloat target_error) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_simplifyPrune(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, target_error);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1simplifyPoints(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong vertex_colorsAddress, jlong vertex_colors_stride, jfloat color_weight, jlong target_vertex_count) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    float const *vertex_colors = (float const *)(uintptr_t)vertex_colorsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_simplifyPoints(destination, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, vertex_colors, (size_t)vertex_colors_stride, color_weight, (size_t)target_vertex_count);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1simplifyScale(JNIEnv *__env, jclass clazz, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride) {
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)meshopt_simplifyScale(vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1stripify(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_count, jint restart_index) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_stripify(destination, indices, (size_t)index_count, (size_t)vertex_count, (unsigned int)restart_index);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1stripifyBound(JNIEnv *__env, jclass clazz, jlong index_count) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_stripifyBound((size_t)index_count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1unstripify(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jint restart_index) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_unstripify(destination, indices, (size_t)index_count, (unsigned int)restart_index);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1unstripifyBound(JNIEnv *__env, jclass clazz, jlong index_count) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_unstripifyBound((size_t)index_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1analyzeVertexCache(JNIEnv *__env, jclass clazz, jlong indicesAddress, jlong index_count, jlong vertex_count, jint cache_size, jint warp_size, jint primgroup_size, jlong __result) {
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct meshopt_VertexCacheStatistics*)(uintptr_t)__result) = meshopt_analyzeVertexCache(indices, (size_t)index_count, (size_t)vertex_count, (unsigned int)cache_size, (unsigned int)warp_size, (unsigned int)primgroup_size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1analyzeVertexFetch(JNIEnv *__env, jclass clazz, jlong indicesAddress, jlong index_count, jlong vertex_count, jlong vertex_size, jlong __result) {
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct meshopt_VertexFetchStatistics*)(uintptr_t)__result) = meshopt_analyzeVertexFetch(indices, (size_t)index_count, (size_t)vertex_count, (size_t)vertex_size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1analyzeOverdraw(JNIEnv *__env, jclass clazz, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong __result) {
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct meshopt_OverdrawStatistics*)(uintptr_t)__result) = meshopt_analyzeOverdraw(indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1analyzeCoverage(JNIEnv *__env, jclass clazz, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong __result) {
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct meshopt_CoverageStatistics*)(uintptr_t)__result) = meshopt_analyzeCoverage(indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1buildMeshlets(JNIEnv *__env, jclass clazz, jlong meshletsAddress, jlong meshlet_verticesAddress, jlong meshlet_trianglesAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong max_vertices, jlong max_triangles, jfloat cone_weight) {
    struct meshopt_Meshlet *meshlets = (struct meshopt_Meshlet *)(uintptr_t)meshletsAddress;
    unsigned int *meshlet_vertices = (unsigned int *)(uintptr_t)meshlet_verticesAddress;
    unsigned char *meshlet_triangles = (unsigned char *)(uintptr_t)meshlet_trianglesAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_buildMeshlets(meshlets, meshlet_vertices, meshlet_triangles, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, (size_t)max_vertices, (size_t)max_triangles, cone_weight);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1buildMeshletsScan(JNIEnv *__env, jclass clazz, jlong meshletsAddress, jlong meshlet_verticesAddress, jlong meshlet_trianglesAddress, jlong indicesAddress, jlong index_count, jlong vertex_count, jlong max_vertices, jlong max_triangles) {
    struct meshopt_Meshlet *meshlets = (struct meshopt_Meshlet *)(uintptr_t)meshletsAddress;
    unsigned int *meshlet_vertices = (unsigned int *)(uintptr_t)meshlet_verticesAddress;
    unsigned char *meshlet_triangles = (unsigned char *)(uintptr_t)meshlet_trianglesAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_buildMeshletsScan(meshlets, meshlet_vertices, meshlet_triangles, indices, (size_t)index_count, (size_t)vertex_count, (size_t)max_vertices, (size_t)max_triangles);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_meshopt_1buildMeshletsBound(JNIEnv *__env, jclass clazz, jlong index_count, jlong max_vertices, jlong max_triangles) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_buildMeshletsBound((size_t)index_count, (size_t)max_vertices, (size_t)max_triangles);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1buildMeshletsFlex(JNIEnv *__env, jclass clazz, jlong meshletsAddress, jlong meshlet_verticesAddress, jlong meshlet_trianglesAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong max_vertices, jlong min_triangles, jlong max_triangles, jfloat cone_weight, jfloat split_factor) {
    struct meshopt_Meshlet *meshlets = (struct meshopt_Meshlet *)(uintptr_t)meshletsAddress;
    unsigned int *meshlet_vertices = (unsigned int *)(uintptr_t)meshlet_verticesAddress;
    unsigned char *meshlet_triangles = (unsigned char *)(uintptr_t)meshlet_trianglesAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_buildMeshletsFlex(meshlets, meshlet_vertices, meshlet_triangles, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, (size_t)max_vertices, (size_t)min_triangles, (size_t)max_triangles, cone_weight, split_factor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1buildMeshletsSpatial(JNIEnv *__env, jclass clazz, jlong meshletsAddress, jlong meshlet_verticesAddress, jlong meshlet_trianglesAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong max_vertices, jlong min_triangles, jlong max_triangles, jfloat fill_weight) {
    struct meshopt_Meshlet *meshlets = (struct meshopt_Meshlet *)(uintptr_t)meshletsAddress;
    unsigned int *meshlet_vertices = (unsigned int *)(uintptr_t)meshlet_verticesAddress;
    unsigned char *meshlet_triangles = (unsigned char *)(uintptr_t)meshlet_trianglesAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_buildMeshletsSpatial(meshlets, meshlet_vertices, meshlet_triangles, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, (size_t)max_vertices, (size_t)min_triangles, (size_t)max_triangles, fill_weight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1optimizeMeshlet(JNIEnv *__env, jclass clazz, jlong meshlet_verticesAddress, jlong meshlet_trianglesAddress, jlong triangle_count, jlong vertex_count) {
    unsigned int *meshlet_vertices = (unsigned int *)(uintptr_t)meshlet_verticesAddress;
    unsigned char *meshlet_triangles = (unsigned char *)(uintptr_t)meshlet_trianglesAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_optimizeMeshlet(meshlet_vertices, meshlet_triangles, (size_t)triangle_count, (size_t)vertex_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1computeClusterBounds(JNIEnv *__env, jclass clazz, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong __result) {
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct meshopt_Bounds*)(uintptr_t)__result) = meshopt_computeClusterBounds(indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1computeMeshletBounds(JNIEnv *__env, jclass clazz, jlong meshlet_verticesAddress, jlong meshlet_trianglesAddress, jlong triangle_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong __result) {
    unsigned int const *meshlet_vertices = (unsigned int const *)(uintptr_t)meshlet_verticesAddress;
    unsigned char const *meshlet_triangles = (unsigned char const *)(uintptr_t)meshlet_trianglesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct meshopt_Bounds*)(uintptr_t)__result) = meshopt_computeMeshletBounds(meshlet_vertices, meshlet_triangles, (size_t)triangle_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1computeSphereBounds(JNIEnv *__env, jclass clazz, jlong positionsAddress, jlong count, jlong positions_stride, jlong radiiAddress, jlong radii_stride, jlong __result) {
    float const *positions = (float const *)(uintptr_t)positionsAddress;
    float const *radii = (float const *)(uintptr_t)radiiAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct meshopt_Bounds*)(uintptr_t)__result) = meshopt_computeSphereBounds(positions, (size_t)count, (size_t)positions_stride, radii, (size_t)radii_stride);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1partitionClusters(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong cluster_indicesAddress, jlong total_index_count, jlong cluster_index_countsAddress, jlong cluster_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong target_partition_size) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *cluster_indices = (unsigned int const *)(uintptr_t)cluster_indicesAddress;
    unsigned int const *cluster_index_counts = (unsigned int const *)(uintptr_t)cluster_index_countsAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)meshopt_partitionClusters(destination, cluster_indices, (size_t)total_index_count, cluster_index_counts, (size_t)cluster_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, (size_t)target_partition_size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1spatialSortRemap(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_spatialSortRemap(destination, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1spatialSortTriangles(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong indicesAddress, jlong index_count, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    unsigned int const *indices = (unsigned int const *)(uintptr_t)indicesAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_spatialSortTriangles(destination, indices, (size_t)index_count, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1spatialClusterPoints(JNIEnv *__env, jclass clazz, jlong destinationAddress, jlong vertex_positionsAddress, jlong vertex_count, jlong vertex_positions_stride, jlong cluster_size) {
    unsigned int *destination = (unsigned int *)(uintptr_t)destinationAddress;
    float const *vertex_positions = (float const *)(uintptr_t)vertex_positionsAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_spatialClusterPoints(destination, vertex_positions, (size_t)vertex_count, (size_t)vertex_positions_stride, (size_t)cluster_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1quantizeUnorm_1ref(JNIEnv *__env, jclass clazz, jfloat v, jint N) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)meshopt_quantizeUnorm(v, N);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1quantizeSnorm_1ref(JNIEnv *__env, jclass clazz, jfloat v, jint N) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)meshopt_quantizeSnorm(v, N);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1quantizeHalf_1ref(JNIEnv *__env, jclass clazz, jfloat v) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)meshopt_quantizeHalf(v);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1quantizeFloat_1ref(JNIEnv *__env, jclass clazz, jfloat v, jint N) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)meshopt_quantizeFloat(v, N);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1dequantizeHalf_1ref(JNIEnv *__env, jclass clazz, jshort h) {
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)meshopt_dequantizeHalf((unsigned short)h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meshoptimizer_MeshOptimizer_nmeshopt_1setAllocator(JNIEnv *__env, jclass clazz, jlong allocateAddress, jlong deallocateAddress) {
    void * (*allocate) (size_t) = (void * (*) (size_t))(uintptr_t)allocateAddress;
    void (*deallocate) (void *) = (void (*) (void *))(uintptr_t)deallocateAddress;
    UNUSED_PARAMS(__env, clazz)
    meshopt_setAllocator(allocate, deallocate);
}

EXTERN_C_EXIT

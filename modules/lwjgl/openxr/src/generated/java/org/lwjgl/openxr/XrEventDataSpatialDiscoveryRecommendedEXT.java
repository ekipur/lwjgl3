/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrEventDataSpatialDiscoveryRecommendedEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialContextEXT spatialContext;
 * }}</pre>
 */
public class XrEventDataSpatialDiscoveryRecommendedEXT extends Struct<XrEventDataSpatialDiscoveryRecommendedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPATIALCONTEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPATIALCONTEXT = layout.offsetof(2);
    }

    protected XrEventDataSpatialDiscoveryRecommendedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpatialDiscoveryRecommendedEXT create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpatialDiscoveryRecommendedEXT(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpatialDiscoveryRecommendedEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code spatialContext} field. */
    @NativeType("XrSpatialContextEXT")
    public long spatialContext() { return nspatialContext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSpatialDiscoveryRecommendedEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT} value to the {@code type} field. */
    public XrEventDataSpatialDiscoveryRecommendedEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSpatialDiscoveryRecommendedEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpatialDiscoveryRecommendedEXT set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataSpatialDiscoveryRecommendedEXT set(XrEventDataSpatialDiscoveryRecommendedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpatialDiscoveryRecommendedEXT malloc() {
        return new XrEventDataSpatialDiscoveryRecommendedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpatialDiscoveryRecommendedEXT calloc() {
        return new XrEventDataSpatialDiscoveryRecommendedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpatialDiscoveryRecommendedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpatialDiscoveryRecommendedEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance for the specified memory address. */
    public static XrEventDataSpatialDiscoveryRecommendedEXT create(long address) {
        return new XrEventDataSpatialDiscoveryRecommendedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSpatialDiscoveryRecommendedEXT createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpatialDiscoveryRecommendedEXT(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpatialDiscoveryRecommendedEXT}. */
    public static XrEventDataSpatialDiscoveryRecommendedEXT create(XrEventDataBaseHeader value) {
        return new XrEventDataSpatialDiscoveryRecommendedEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpatialDiscoveryRecommendedEXT.Buffer}. */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpatialDiscoveryRecommendedEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT malloc(MemoryStack stack) {
        return new XrEventDataSpatialDiscoveryRecommendedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT calloc(MemoryStack stack) {
        return new XrEventDataSpatialDiscoveryRecommendedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialDiscoveryRecommendedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSpatialDiscoveryRecommendedEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpatialDiscoveryRecommendedEXT.NEXT); }
    /** Unsafe version of {@link #spatialContext}. */
    public static long nspatialContext(long struct) { return memGetAddress(struct + XrEventDataSpatialDiscoveryRecommendedEXT.SPATIALCONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSpatialDiscoveryRecommendedEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpatialDiscoveryRecommendedEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpatialDiscoveryRecommendedEXT} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpatialDiscoveryRecommendedEXT, Buffer> implements NativeResource {

        private static final XrEventDataSpatialDiscoveryRecommendedEXT ELEMENT_FACTORY = XrEventDataSpatialDiscoveryRecommendedEXT.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpatialDiscoveryRecommendedEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrEventDataSpatialDiscoveryRecommendedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpatialDiscoveryRecommendedEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpatialDiscoveryRecommendedEXT.nnext(address()); }
        /** @return the value of the {@code spatialContext} field. */
        @NativeType("XrSpatialContextEXT")
        public long spatialContext() { return XrEventDataSpatialDiscoveryRecommendedEXT.nspatialContext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSpatialDiscoveryRecommendedEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpatialDiscoveryRecommendedEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT} value to the {@code type} field. */
        public XrEventDataSpatialDiscoveryRecommendedEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSpatialDiscoveryRecommendedEXT.Buffer next(@NativeType("void const *") long value) { XrEventDataSpatialDiscoveryRecommendedEXT.nnext(address(), value); return this; }

    }

}
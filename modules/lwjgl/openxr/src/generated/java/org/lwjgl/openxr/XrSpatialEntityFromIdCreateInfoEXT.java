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
 * struct XrSpatialEntityFromIdCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialEntityIdEXT entityId;
 * }}</pre>
 */
public class XrSpatialEntityFromIdCreateInfoEXT extends Struct<XrSpatialEntityFromIdCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENTITYID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENTITYID = layout.offsetof(2);
    }

    protected XrSpatialEntityFromIdCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityFromIdCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityFromIdCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityFromIdCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityFromIdCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code entityId} field. */
    @NativeType("XrSpatialEntityIdEXT")
    public long entityId() { return nentityId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityFromIdCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrSpatialEntityFromIdCreateInfoEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityFromIdCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code entityId} field. */
    public XrSpatialEntityFromIdCreateInfoEXT entityId(@NativeType("XrSpatialEntityIdEXT") long value) { nentityId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityFromIdCreateInfoEXT set(
        int type,
        long next,
        long entityId
    ) {
        type(type);
        next(next);
        entityId(entityId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityFromIdCreateInfoEXT set(XrSpatialEntityFromIdCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityFromIdCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityFromIdCreateInfoEXT malloc() {
        return new XrSpatialEntityFromIdCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityFromIdCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityFromIdCreateInfoEXT calloc() {
        return new XrSpatialEntityFromIdCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityFromIdCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityFromIdCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityFromIdCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityFromIdCreateInfoEXT} instance for the specified memory address. */
    public static XrSpatialEntityFromIdCreateInfoEXT create(long address) {
        return new XrSpatialEntityFromIdCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityFromIdCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityFromIdCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityFromIdCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityFromIdCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityFromIdCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityFromIdCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityFromIdCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityFromIdCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityFromIdCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityFromIdCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityFromIdCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityFromIdCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityFromIdCreateInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialEntityFromIdCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityFromIdCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityFromIdCreateInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialEntityFromIdCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityFromIdCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityFromIdCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityFromIdCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityFromIdCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityFromIdCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityFromIdCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #entityId}. */
    public static long nentityId(long struct) { return memGetLong(struct + XrSpatialEntityFromIdCreateInfoEXT.ENTITYID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityFromIdCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityFromIdCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #entityId(long) entityId}. */
    public static void nentityId(long struct, long value) { memPutLong(struct + XrSpatialEntityFromIdCreateInfoEXT.ENTITYID, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityFromIdCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityFromIdCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialEntityFromIdCreateInfoEXT ELEMENT_FACTORY = XrSpatialEntityFromIdCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityFromIdCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityFromIdCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityFromIdCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityFromIdCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialEntityFromIdCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code entityId} field. */
        @NativeType("XrSpatialEntityIdEXT")
        public long entityId() { return XrSpatialEntityFromIdCreateInfoEXT.nentityId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityFromIdCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityFromIdCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrSpatialEntityFromIdCreateInfoEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityFromIdCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialEntityFromIdCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code entityId} field. */
        public XrSpatialEntityFromIdCreateInfoEXT.Buffer entityId(@NativeType("XrSpatialEntityIdEXT") long value) { XrSpatialEntityFromIdCreateInfoEXT.nentityId(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct nk_list_view {
 *     int begin;
 *     int end;
 *     int count;
 *     int total_height;
 *     {@link NkContext struct nk_context} * ctx;
 *     nk_uint * scroll_pointer;
 *     nk_uint scroll_value;
 * }}</pre>
 */
@NativeType("struct nk_list_view")
public class NkListView extends Struct<NkListView> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BEGIN,
        END,
        COUNT,
        TOTAL_HEIGHT,
        CTX,
        SCROLL_POINTER,
        SCROLL_VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BEGIN = layout.offsetof(0);
        END = layout.offsetof(1);
        COUNT = layout.offsetof(2);
        TOTAL_HEIGHT = layout.offsetof(3);
        CTX = layout.offsetof(4);
        SCROLL_POINTER = layout.offsetof(5);
        SCROLL_VALUE = layout.offsetof(6);
    }

    protected NkListView(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkListView create(long address, @Nullable ByteBuffer container) {
        return new NkListView(address, container);
    }

    /**
     * Creates a {@code NkListView} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkListView(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code begin} field. */
    public int begin() { return nbegin(address()); }
    /** @return the value of the {@code end} field. */
    public int end() { return nend(address()); }
    /** @return the value of the {@code count} field. */
    public int count() { return ncount(address()); }

    // -----------------------------------

    /** Returns a new {@code NkListView} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkListView malloc() {
        return new NkListView(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkListView} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkListView calloc() {
        return new NkListView(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkListView} instance allocated with {@link BufferUtils}. */
    public static NkListView create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkListView(memAddress(container), container);
    }

    /** Returns a new {@code NkListView} instance for the specified memory address. */
    public static NkListView create(long address) {
        return new NkListView(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkListView createSafe(long address) {
        return address == NULL ? null : new NkListView(address, null);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkListView.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkListView.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkListView.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkListView.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkListView.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkListView.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkListView mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkListView callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkListView mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkListView callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkListView.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkListView.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkListView.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkListView.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkListView} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkListView malloc(MemoryStack stack) {
        return new NkListView(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkListView} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkListView calloc(MemoryStack stack) {
        return new NkListView(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkListView.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkListView.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkListView.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #begin}. */
    public static int nbegin(long struct) { return memGetInt(struct + NkListView.BEGIN); }
    /** Unsafe version of {@link #end}. */
    public static int nend(long struct) { return memGetInt(struct + NkListView.END); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return memGetInt(struct + NkListView.COUNT); }
    public static int ntotal_height(long struct) { return memGetInt(struct + NkListView.TOTAL_HEIGHT); }
    public static NkContext nctx(long struct) { return NkContext.create(memGetAddress(struct + NkListView.CTX)); }
    public static IntBuffer nscroll_pointer(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + NkListView.SCROLL_POINTER), capacity); }
    public static int nscroll_value(long struct) { return memGetInt(struct + NkListView.SCROLL_VALUE); }

    // -----------------------------------

    /** An array of {@link NkListView} structs. */
    public static class Buffer extends StructBuffer<NkListView, Buffer> implements NativeResource {

        private static final NkListView ELEMENT_FACTORY = NkListView.create(-1L);

        /**
         * Creates a new {@code NkListView.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkListView#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkListView getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code begin} field. */
        public int begin() { return NkListView.nbegin(address()); }
        /** @return the value of the {@code end} field. */
        public int end() { return NkListView.nend(address()); }
        /** @return the value of the {@code count} field. */
        public int count() { return NkListView.ncount(address()); }

    }

}
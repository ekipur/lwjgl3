/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoVP9SegmentationFlags {
 *     uint32_t segmentation_update_map : 1;
 *     uint32_t segmentation_temporal_update : 1;
 *     uint32_t segmentation_update_data : 1;
 *     uint32_t segmentation_abs_or_delta_update : 1;
 *     uint32_t reserved : 28;
 * }}</pre>
 */
public class StdVideoVP9SegmentationFlags extends Struct<StdVideoVP9SegmentationFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        BITFIELD1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoVP9SegmentationFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoVP9SegmentationFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoVP9SegmentationFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoVP9SegmentationFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoVP9SegmentationFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code segmentation_update_map} field. */
    @NativeType("uint32_t")
    public boolean segmentation_update_map() { return nsegmentation_update_map(address()) != 0; }
    /** @return the value of the {@code segmentation_temporal_update} field. */
    @NativeType("uint32_t")
    public boolean segmentation_temporal_update() { return nsegmentation_temporal_update(address()) != 0; }
    /** @return the value of the {@code segmentation_update_data} field. */
    @NativeType("uint32_t")
    public boolean segmentation_update_data() { return nsegmentation_update_data(address()) != 0; }
    /** @return the value of the {@code segmentation_abs_or_delta_update} field. */
    @NativeType("uint32_t")
    public boolean segmentation_abs_or_delta_update() { return nsegmentation_abs_or_delta_update(address()) != 0; }

    /** Sets the specified value to the {@code segmentation_update_map} field. */
    public StdVideoVP9SegmentationFlags segmentation_update_map(@NativeType("uint32_t") boolean value) { nsegmentation_update_map(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_temporal_update} field. */
    public StdVideoVP9SegmentationFlags segmentation_temporal_update(@NativeType("uint32_t") boolean value) { nsegmentation_temporal_update(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_update_data} field. */
    public StdVideoVP9SegmentationFlags segmentation_update_data(@NativeType("uint32_t") boolean value) { nsegmentation_update_data(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_abs_or_delta_update} field. */
    public StdVideoVP9SegmentationFlags segmentation_abs_or_delta_update(@NativeType("uint32_t") boolean value) { nsegmentation_abs_or_delta_update(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoVP9SegmentationFlags set(
        boolean segmentation_update_map,
        boolean segmentation_temporal_update,
        boolean segmentation_update_data,
        boolean segmentation_abs_or_delta_update
    ) {
        segmentation_update_map(segmentation_update_map);
        segmentation_temporal_update(segmentation_temporal_update);
        segmentation_update_data(segmentation_update_data);
        segmentation_abs_or_delta_update(segmentation_abs_or_delta_update);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoVP9SegmentationFlags set(StdVideoVP9SegmentationFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoVP9SegmentationFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoVP9SegmentationFlags malloc() {
        return new StdVideoVP9SegmentationFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9SegmentationFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoVP9SegmentationFlags calloc() {
        return new StdVideoVP9SegmentationFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoVP9SegmentationFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoVP9SegmentationFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoVP9SegmentationFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoVP9SegmentationFlags} instance for the specified memory address. */
    public static StdVideoVP9SegmentationFlags create(long address) {
        return new StdVideoVP9SegmentationFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoVP9SegmentationFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoVP9SegmentationFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoVP9SegmentationFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9SegmentationFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9SegmentationFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9SegmentationFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9SegmentationFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9SegmentationFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoVP9SegmentationFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9SegmentationFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoVP9SegmentationFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoVP9SegmentationFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9SegmentationFlags malloc(MemoryStack stack) {
        return new StdVideoVP9SegmentationFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoVP9SegmentationFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoVP9SegmentationFlags calloc(MemoryStack stack) {
        return new StdVideoVP9SegmentationFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoVP9SegmentationFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9SegmentationFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoVP9SegmentationFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoVP9SegmentationFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoVP9SegmentationFlags.BITFIELD0); }
    /** Unsafe version of {@link #segmentation_update_map}. */
    public static int nsegmentation_update_map(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #segmentation_temporal_update}. */
    public static int nsegmentation_temporal_update(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #segmentation_update_data}. */
    public static int nsegmentation_update_data(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #segmentation_abs_or_delta_update}. */
    public static int nsegmentation_abs_or_delta_update(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoVP9SegmentationFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x0F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoVP9SegmentationFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #segmentation_update_map(boolean) segmentation_update_map}. */
    public static void nsegmentation_update_map(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #segmentation_temporal_update(boolean) segmentation_temporal_update}. */
    public static void nsegmentation_temporal_update(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #segmentation_update_data(boolean) segmentation_update_data}. */
    public static void nsegmentation_update_data(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #segmentation_abs_or_delta_update(boolean) segmentation_abs_or_delta_update}. */
    public static void nsegmentation_abs_or_delta_update(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoVP9SegmentationFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xF0_00_00_00) | (value & 0x0F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoVP9SegmentationFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoVP9SegmentationFlags, Buffer> implements NativeResource {

        private static final StdVideoVP9SegmentationFlags ELEMENT_FACTORY = StdVideoVP9SegmentationFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoVP9SegmentationFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoVP9SegmentationFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoVP9SegmentationFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code segmentation_update_map} field. */
        @NativeType("uint32_t")
        public boolean segmentation_update_map() { return StdVideoVP9SegmentationFlags.nsegmentation_update_map(address()) != 0; }
        /** @return the value of the {@code segmentation_temporal_update} field. */
        @NativeType("uint32_t")
        public boolean segmentation_temporal_update() { return StdVideoVP9SegmentationFlags.nsegmentation_temporal_update(address()) != 0; }
        /** @return the value of the {@code segmentation_update_data} field. */
        @NativeType("uint32_t")
        public boolean segmentation_update_data() { return StdVideoVP9SegmentationFlags.nsegmentation_update_data(address()) != 0; }
        /** @return the value of the {@code segmentation_abs_or_delta_update} field. */
        @NativeType("uint32_t")
        public boolean segmentation_abs_or_delta_update() { return StdVideoVP9SegmentationFlags.nsegmentation_abs_or_delta_update(address()) != 0; }

        /** Sets the specified value to the {@code segmentation_update_map} field. */
        public StdVideoVP9SegmentationFlags.Buffer segmentation_update_map(@NativeType("uint32_t") boolean value) { StdVideoVP9SegmentationFlags.nsegmentation_update_map(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_temporal_update} field. */
        public StdVideoVP9SegmentationFlags.Buffer segmentation_temporal_update(@NativeType("uint32_t") boolean value) { StdVideoVP9SegmentationFlags.nsegmentation_temporal_update(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_update_data} field. */
        public StdVideoVP9SegmentationFlags.Buffer segmentation_update_data(@NativeType("uint32_t") boolean value) { StdVideoVP9SegmentationFlags.nsegmentation_update_data(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_abs_or_delta_update} field. */
        public StdVideoVP9SegmentationFlags.Buffer segmentation_abs_or_delta_update(@NativeType("uint32_t") boolean value) { StdVideoVP9SegmentationFlags.nsegmentation_abs_or_delta_update(address(), value ? 1 : 0); return this; }

    }

}
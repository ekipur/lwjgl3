/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSurfaceCapabilitiesPresentWait2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentWait2Supported;
 * }}</pre>
 */
public class VkSurfaceCapabilitiesPresentWait2KHR extends Struct<VkSurfaceCapabilitiesPresentWait2KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTWAIT2SUPPORTED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTWAIT2SUPPORTED = layout.offsetof(2);
    }

    protected VkSurfaceCapabilitiesPresentWait2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfaceCapabilitiesPresentWait2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(address, container);
    }

    /**
     * Creates a {@code VkSurfaceCapabilitiesPresentWait2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilitiesPresentWait2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code presentWait2Supported} field. */
    @NativeType("VkBool32")
    public boolean presentWait2Supported() { return npresentWait2Supported(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfaceCapabilitiesPresentWait2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentWait2#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR} value to the {@code sType} field. */
    public VkSurfaceCapabilitiesPresentWait2KHR sType$Default() { return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfaceCapabilitiesPresentWait2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentWait2Supported} field. */
    public VkSurfaceCapabilitiesPresentWait2KHR presentWait2Supported(@NativeType("VkBool32") boolean value) { npresentWait2Supported(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceCapabilitiesPresentWait2KHR set(
        int sType,
        long pNext,
        boolean presentWait2Supported
    ) {
        sType(sType);
        pNext(pNext);
        presentWait2Supported(presentWait2Supported);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfaceCapabilitiesPresentWait2KHR set(VkSurfaceCapabilitiesPresentWait2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilitiesPresentWait2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesPresentWait2KHR malloc() {
        return new VkSurfaceCapabilitiesPresentWait2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesPresentWait2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesPresentWait2KHR calloc() {
        return new VkSurfaceCapabilitiesPresentWait2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesPresentWait2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilitiesPresentWait2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilitiesPresentWait2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesPresentWait2KHR} instance for the specified memory address. */
    public static VkSurfaceCapabilitiesPresentWait2KHR create(long address) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfaceCapabilitiesPresentWait2KHR createSafe(long address) {
        return address == NULL ? null : new VkSurfaceCapabilitiesPresentWait2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentWait2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentWait2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentWait2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfaceCapabilitiesPresentWait2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfaceCapabilitiesPresentWait2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesPresentWait2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR malloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesPresentWait2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR calloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentWait2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesPresentWait2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesPresentWait2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesPresentWait2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceCapabilitiesPresentWait2KHR.PNEXT); }
    /** Unsafe version of {@link #presentWait2Supported}. */
    public static int npresentWait2Supported(long struct) { return memGetInt(struct + VkSurfaceCapabilitiesPresentWait2KHR.PRESENTWAIT2SUPPORTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfaceCapabilitiesPresentWait2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceCapabilitiesPresentWait2KHR.PNEXT, value); }
    /** Unsafe version of {@link #presentWait2Supported(boolean) presentWait2Supported}. */
    public static void npresentWait2Supported(long struct, int value) { memPutInt(struct + VkSurfaceCapabilitiesPresentWait2KHR.PRESENTWAIT2SUPPORTED, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilitiesPresentWait2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesPresentWait2KHR, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilitiesPresentWait2KHR ELEMENT_FACTORY = VkSurfaceCapabilitiesPresentWait2KHR.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilitiesPresentWait2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilitiesPresentWait2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfaceCapabilitiesPresentWait2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceCapabilitiesPresentWait2KHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfaceCapabilitiesPresentWait2KHR.npNext(address()); }
        /** @return the value of the {@code presentWait2Supported} field. */
        @NativeType("VkBool32")
        public boolean presentWait2Supported() { return VkSurfaceCapabilitiesPresentWait2KHR.npresentWait2Supported(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfaceCapabilitiesPresentWait2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceCapabilitiesPresentWait2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentWait2#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR} value to the {@code sType} field. */
        public VkSurfaceCapabilitiesPresentWait2KHR.Buffer sType$Default() { return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfaceCapabilitiesPresentWait2KHR.Buffer pNext(@NativeType("void *") long value) { VkSurfaceCapabilitiesPresentWait2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentWait2Supported} field. */
        public VkSurfaceCapabilitiesPresentWait2KHR.Buffer presentWait2Supported(@NativeType("VkBool32") boolean value) { VkSurfaceCapabilitiesPresentWait2KHR.npresentWait2Supported(address(), value ? 1 : 0); return this; }

    }

}
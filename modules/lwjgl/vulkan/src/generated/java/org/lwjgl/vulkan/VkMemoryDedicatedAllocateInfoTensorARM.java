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
 * struct VkMemoryDedicatedAllocateInfoTensorARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorARM tensor;
 * }}</pre>
 */
public class VkMemoryDedicatedAllocateInfoTensorARM extends Struct<VkMemoryDedicatedAllocateInfoTensorARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSOR = layout.offsetof(2);
    }

    protected VkMemoryDedicatedAllocateInfoTensorARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryDedicatedAllocateInfoTensorARM create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryDedicatedAllocateInfoTensorARM(address, container);
    }

    /**
     * Creates a {@code VkMemoryDedicatedAllocateInfoTensorARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryDedicatedAllocateInfoTensorARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code tensor} field. */
    @NativeType("VkTensorARM")
    public long tensor() { return ntensor(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryDedicatedAllocateInfoTensorARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM} value to the {@code sType} field. */
    public VkMemoryDedicatedAllocateInfoTensorARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryDedicatedAllocateInfoTensorARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensor} field. */
    public VkMemoryDedicatedAllocateInfoTensorARM tensor(@NativeType("VkTensorARM") long value) { ntensor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryDedicatedAllocateInfoTensorARM set(
        int sType,
        long pNext,
        long tensor
    ) {
        sType(sType);
        pNext(pNext);
        tensor(tensor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryDedicatedAllocateInfoTensorARM set(VkMemoryDedicatedAllocateInfoTensorARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoTensorARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedAllocateInfoTensorARM malloc() {
        return new VkMemoryDedicatedAllocateInfoTensorARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoTensorARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedAllocateInfoTensorARM calloc() {
        return new VkMemoryDedicatedAllocateInfoTensorARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoTensorARM} instance allocated with {@link BufferUtils}. */
    public static VkMemoryDedicatedAllocateInfoTensorARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryDedicatedAllocateInfoTensorARM(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfoTensorARM} instance for the specified memory address. */
    public static VkMemoryDedicatedAllocateInfoTensorARM create(long address) {
        return new VkMemoryDedicatedAllocateInfoTensorARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryDedicatedAllocateInfoTensorARM createSafe(long address) {
        return address == NULL ? null : new VkMemoryDedicatedAllocateInfoTensorARM(address, null);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoTensorARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoTensorARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoTensorARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryDedicatedAllocateInfoTensorARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryDedicatedAllocateInfoTensorARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryDedicatedAllocateInfoTensorARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM malloc(MemoryStack stack) {
        return new VkMemoryDedicatedAllocateInfoTensorARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryDedicatedAllocateInfoTensorARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM calloc(MemoryStack stack) {
        return new VkMemoryDedicatedAllocateInfoTensorARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoTensorARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfoTensorARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfoTensorARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryDedicatedAllocateInfoTensorARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryDedicatedAllocateInfoTensorARM.PNEXT); }
    /** Unsafe version of {@link #tensor}. */
    public static long ntensor(long struct) { return memGetLong(struct + VkMemoryDedicatedAllocateInfoTensorARM.TENSOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryDedicatedAllocateInfoTensorARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryDedicatedAllocateInfoTensorARM.PNEXT, value); }
    /** Unsafe version of {@link #tensor(long) tensor}. */
    public static void ntensor(long struct, long value) { memPutLong(struct + VkMemoryDedicatedAllocateInfoTensorARM.TENSOR, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryDedicatedAllocateInfoTensorARM} structs. */
    public static class Buffer extends StructBuffer<VkMemoryDedicatedAllocateInfoTensorARM, Buffer> implements NativeResource {

        private static final VkMemoryDedicatedAllocateInfoTensorARM ELEMENT_FACTORY = VkMemoryDedicatedAllocateInfoTensorARM.create(-1L);

        /**
         * Creates a new {@code VkMemoryDedicatedAllocateInfoTensorARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryDedicatedAllocateInfoTensorARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryDedicatedAllocateInfoTensorARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryDedicatedAllocateInfoTensorARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryDedicatedAllocateInfoTensorARM.npNext(address()); }
        /** @return the value of the {@code tensor} field. */
        @NativeType("VkTensorARM")
        public long tensor() { return VkMemoryDedicatedAllocateInfoTensorARM.ntensor(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryDedicatedAllocateInfoTensorARM.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryDedicatedAllocateInfoTensorARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM} value to the {@code sType} field. */
        public VkMemoryDedicatedAllocateInfoTensorARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryDedicatedAllocateInfoTensorARM.Buffer pNext(@NativeType("void const *") long value) { VkMemoryDedicatedAllocateInfoTensorARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensor} field. */
        public VkMemoryDedicatedAllocateInfoTensorARM.Buffer tensor(@NativeType("VkTensorARM") long value) { VkMemoryDedicatedAllocateInfoTensorARM.ntensor(address(), value); return this; }

    }

}
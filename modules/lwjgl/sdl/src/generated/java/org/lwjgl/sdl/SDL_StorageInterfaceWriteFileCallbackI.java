/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("bool (*) (void *, char const *, void const *, Uint64)")
public interface SDL_StorageInterfaceWriteFileCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_uint8,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint64
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (*) (void * userdata, char const * path, void const * source, Uint64 length)} */
    @NativeType("bool") boolean invoke(@NativeType("void *") long userdata, @NativeType("char const *") long path, @NativeType("void const *") long source, @NativeType("Uint64") long length);

}
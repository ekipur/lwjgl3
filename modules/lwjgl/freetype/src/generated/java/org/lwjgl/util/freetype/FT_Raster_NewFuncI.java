/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FT_Raster_NewFunc} */
@FunctionalInterface
@NativeType("FT_Raster_NewFunc")
public interface FT_Raster_NewFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code int (* FT_Raster_NewFunc) (void * memory, FT_Raster * raster)} */
    int invoke(@NativeType("void *") long memory, @NativeType("FT_Raster *") long raster);

}
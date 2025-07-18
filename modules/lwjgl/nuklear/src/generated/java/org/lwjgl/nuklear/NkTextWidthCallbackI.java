/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke nk_text_width_f} */
@FunctionalInterface
@NativeType("nk_text_width_f")
public interface NkTextWidthCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_float,
        ffi_type_pointer, ffi_type_float, ffi_type_pointer, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        float __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetFloat(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code float (* nk_text_width_f) (nk_handle handle, float h, char const * text, int len)} */
    float invoke(@NativeType("nk_handle") long handle, float h, @NativeType("char const *") long text, int len);

}
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
@NativeType("bool (*) (void *, bool)")
public interface SDL_VirtualJoystickDescSetSensorsEnabledCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_uint8,
        ffi_type_pointer, ffi_type_uint8
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetByte(memGetAddress(args + POINTER_SIZE)) != 0
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (*) (void * userdata, bool enabled)} */
    @NativeType("bool") boolean invoke(@NativeType("void *") long userdata, @NativeType("bool") boolean enabled);

}
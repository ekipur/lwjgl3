/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("LLVMOrcObjectLayerRef (*) (void *, LLVMOrcExecutionSessionRef, char const *)")
public interface LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code LLVMOrcObjectLayerRef (*) (void * Ctx, LLVMOrcExecutionSessionRef ES, char const * Triple)} */
    @NativeType("LLVMOrcObjectLayerRef") long invoke(@NativeType("void *") long Ctx, @NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") long Triple);

}
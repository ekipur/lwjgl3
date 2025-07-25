/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke hb_font_get_glyph_advances_func_t} */
@FunctionalInterface
@NativeType("hb_font_get_glyph_advances_func_t")
public interface hb_font_get_glyph_advances_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
    }

    /** {@code void (* hb_font_get_glyph_advances_func_t) (hb_font_t * font, void * font_data, unsigned int count, hb_codepoint_t const * first_glyph, unsigned int glyph_stride, hb_position_t * first_advance, unsigned int advance_stride, void * user_data)} */
    void invoke(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") long first_glyph, @NativeType("unsigned int") int glyph_stride, @NativeType("hb_position_t *") long first_advance, @NativeType("unsigned int") int advance_stride, @NativeType("void *") long user_data);

}
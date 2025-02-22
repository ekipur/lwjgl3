/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLES31 extends GLES30 {

    static { GLES.initialize(); }

    public static final int
        GL_COMPUTE_SHADER                             = 0x91B9,
        GL_MAX_COMPUTE_UNIFORM_BLOCKS                 = 0x91BB,
        GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS            = 0x91BC,
        GL_MAX_COMPUTE_IMAGE_UNIFORMS                 = 0x91BD,
        GL_MAX_COMPUTE_SHARED_MEMORY_SIZE             = 0x8262,
        GL_MAX_COMPUTE_UNIFORM_COMPONENTS             = 0x8263,
        GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS         = 0x8264,
        GL_MAX_COMPUTE_ATOMIC_COUNTERS                = 0x8265,
        GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS    = 0x8266,
        GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS         = 0x90EB,
        GL_MAX_COMPUTE_WORK_GROUP_COUNT               = 0x91BE,
        GL_MAX_COMPUTE_WORK_GROUP_SIZE                = 0x91BF,
        GL_COMPUTE_WORK_GROUP_SIZE                    = 0x8267,
        GL_DISPATCH_INDIRECT_BUFFER                   = 0x90EE,
        GL_DISPATCH_INDIRECT_BUFFER_BINDING           = 0x90EF,
        GL_COMPUTE_SHADER_BIT                         = 0x20,
        GL_DRAW_INDIRECT_BUFFER                       = 0x8F3F,
        GL_DRAW_INDIRECT_BUFFER_BINDING               = 0x8F43,
        GL_MAX_UNIFORM_LOCATIONS                      = 0x826E,
        GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
        GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
        GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
        GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314,
        GL_MAX_FRAMEBUFFER_WIDTH                      = 0x9315,
        GL_MAX_FRAMEBUFFER_HEIGHT                     = 0x9316,
        GL_MAX_FRAMEBUFFER_SAMPLES                    = 0x9318,
        GL_UNIFORM                                    = 0x92E1,
        GL_UNIFORM_BLOCK                              = 0x92E2,
        GL_PROGRAM_INPUT                              = 0x92E3,
        GL_PROGRAM_OUTPUT                             = 0x92E4,
        GL_BUFFER_VARIABLE                            = 0x92E5,
        GL_SHADER_STORAGE_BLOCK                       = 0x92E6,
        GL_ATOMIC_COUNTER_BUFFER                      = 0x92C0,
        GL_TRANSFORM_FEEDBACK_VARYING                 = 0x92F4,
        GL_ACTIVE_RESOURCES                           = 0x92F5,
        GL_MAX_NAME_LENGTH                            = 0x92F6,
        GL_MAX_NUM_ACTIVE_VARIABLES                   = 0x92F7,
        GL_NAME_LENGTH                                = 0x92F9,
        GL_TYPE                                       = 0x92FA,
        GL_ARRAY_SIZE                                 = 0x92FB,
        GL_OFFSET                                     = 0x92FC,
        GL_BLOCK_INDEX                                = 0x92FD,
        GL_ARRAY_STRIDE                               = 0x92FE,
        GL_MATRIX_STRIDE                              = 0x92FF,
        GL_IS_ROW_MAJOR                               = 0x9300,
        GL_ATOMIC_COUNTER_BUFFER_INDEX                = 0x9301,
        GL_BUFFER_BINDING                             = 0x9302,
        GL_BUFFER_DATA_SIZE                           = 0x9303,
        GL_NUM_ACTIVE_VARIABLES                       = 0x9304,
        GL_ACTIVE_VARIABLES                           = 0x9305,
        GL_REFERENCED_BY_VERTEX_SHADER                = 0x9306,
        GL_REFERENCED_BY_FRAGMENT_SHADER              = 0x930A,
        GL_REFERENCED_BY_COMPUTE_SHADER               = 0x930B,
        GL_TOP_LEVEL_ARRAY_SIZE                       = 0x930C,
        GL_TOP_LEVEL_ARRAY_STRIDE                     = 0x930D,
        GL_LOCATION                                   = 0x930E,
        GL_VERTEX_SHADER_BIT                          = 0x1,
        GL_FRAGMENT_SHADER_BIT                        = 0x2,
        GL_ALL_SHADER_BITS                            = 0xFFFFFFFF,
        GL_PROGRAM_SEPARABLE                          = 0x8258,
        GL_ACTIVE_PROGRAM                             = 0x8259,
        GL_PROGRAM_PIPELINE_BINDING                   = 0x825A,
        GL_ATOMIC_COUNTER_BUFFER_BINDING              = 0x92C1,
        GL_ATOMIC_COUNTER_BUFFER_START                = 0x92C2,
        GL_ATOMIC_COUNTER_BUFFER_SIZE                 = 0x92C3,
        GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
        GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
        GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
        GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
        GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
        GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
        GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
        GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC,
        GL_ACTIVE_ATOMIC_COUNTER_BUFFERS              = 0x92D9,
        GL_UNSIGNED_INT_ATOMIC_COUNTER                = 0x92DB,
        GL_MAX_IMAGE_UNITS                            = 0x8F38,
        GL_MAX_VERTEX_IMAGE_UNIFORMS                  = 0x90CA,
        GL_MAX_FRAGMENT_IMAGE_UNIFORMS                = 0x90CE,
        GL_MAX_COMBINED_IMAGE_UNIFORMS                = 0x90CF,
        GL_IMAGE_BINDING_NAME                         = 0x8F3A,
        GL_IMAGE_BINDING_LEVEL                        = 0x8F3B,
        GL_IMAGE_BINDING_LAYERED                      = 0x8F3C,
        GL_IMAGE_BINDING_LAYER                        = 0x8F3D,
        GL_IMAGE_BINDING_ACCESS                       = 0x8F3E,
        GL_IMAGE_BINDING_FORMAT                       = 0x906E,
        GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT            = 0x1,
        GL_ELEMENT_ARRAY_BARRIER_BIT                  = 0x2,
        GL_UNIFORM_BARRIER_BIT                        = 0x4,
        GL_TEXTURE_FETCH_BARRIER_BIT                  = 0x8,
        GL_SHADER_IMAGE_ACCESS_BARRIER_BIT            = 0x20,
        GL_COMMAND_BARRIER_BIT                        = 0x40,
        GL_PIXEL_BUFFER_BARRIER_BIT                   = 0x80,
        GL_TEXTURE_UPDATE_BARRIER_BIT                 = 0x100,
        GL_BUFFER_UPDATE_BARRIER_BIT                  = 0x200,
        GL_FRAMEBUFFER_BARRIER_BIT                    = 0x400,
        GL_TRANSFORM_FEEDBACK_BARRIER_BIT             = 0x800,
        GL_ATOMIC_COUNTER_BARRIER_BIT                 = 0x1000,
        GL_ALL_BARRIER_BITS                           = 0xFFFFFFFF,
        GL_IMAGE_2D                                   = 0x904D,
        GL_IMAGE_3D                                   = 0x904E,
        GL_IMAGE_CUBE                                 = 0x9050,
        GL_IMAGE_2D_ARRAY                             = 0x9053,
        GL_INT_IMAGE_2D                               = 0x9058,
        GL_INT_IMAGE_3D                               = 0x9059,
        GL_INT_IMAGE_CUBE                             = 0x905B,
        GL_INT_IMAGE_2D_ARRAY                         = 0x905E,
        GL_UNSIGNED_INT_IMAGE_2D                      = 0x9063,
        GL_UNSIGNED_INT_IMAGE_3D                      = 0x9064,
        GL_UNSIGNED_INT_IMAGE_CUBE                    = 0x9066,
        GL_UNSIGNED_INT_IMAGE_2D_ARRAY                = 0x9069,
        GL_IMAGE_FORMAT_COMPATIBILITY_TYPE            = 0x90C7,
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE         = 0x90C8,
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS        = 0x90C9,
        GL_READ_ONLY                                  = 0x88B8,
        GL_WRITE_ONLY                                 = 0x88B9,
        GL_READ_WRITE                                 = 0x88BA,
        GL_SHADER_STORAGE_BUFFER                      = 0x90D2,
        GL_SHADER_STORAGE_BUFFER_BINDING              = 0x90D3,
        GL_SHADER_STORAGE_BUFFER_START                = 0x90D4,
        GL_SHADER_STORAGE_BUFFER_SIZE                 = 0x90D5,
        GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS           = 0x90D6,
        GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS         = 0x90DA,
        GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS          = 0x90DB,
        GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS         = 0x90DC,
        GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS         = 0x90DD,
        GL_MAX_SHADER_STORAGE_BLOCK_SIZE              = 0x90DE,
        GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT     = 0x90DF,
        GL_SHADER_STORAGE_BARRIER_BIT                 = 0x2000,
        GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES       = 0x8F39,
        GL_DEPTH_STENCIL_TEXTURE_MODE                 = 0x90EA,
        GL_STENCIL_INDEX                              = 0x1901,
        GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET          = 0x8E5E,
        GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET          = 0x8E5F,
        GL_SAMPLE_POSITION                            = 0x8E50,
        GL_SAMPLE_MASK                                = 0x8E51,
        GL_SAMPLE_MASK_VALUE                          = 0x8E52,
        GL_TEXTURE_2D_MULTISAMPLE                     = 0x9100,
        GL_MAX_SAMPLE_MASK_WORDS                      = 0x8E59,
        GL_MAX_COLOR_TEXTURE_SAMPLES                  = 0x910E,
        GL_MAX_DEPTH_TEXTURE_SAMPLES                  = 0x910F,
        GL_MAX_INTEGER_SAMPLES                        = 0x9110,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE             = 0x9104,
        GL_TEXTURE_SAMPLES                            = 0x9106,
        GL_TEXTURE_FIXED_SAMPLE_LOCATIONS             = 0x9107,
        GL_TEXTURE_WIDTH                              = 0x1000,
        GL_TEXTURE_HEIGHT                             = 0x1001,
        GL_TEXTURE_DEPTH                              = 0x8071,
        GL_TEXTURE_INTERNAL_FORMAT                    = 0x1003,
        GL_TEXTURE_RED_SIZE                           = 0x805C,
        GL_TEXTURE_GREEN_SIZE                         = 0x805D,
        GL_TEXTURE_BLUE_SIZE                          = 0x805E,
        GL_TEXTURE_ALPHA_SIZE                         = 0x805F,
        GL_TEXTURE_DEPTH_SIZE                         = 0x884A,
        GL_TEXTURE_STENCIL_SIZE                       = 0x88F1,
        GL_TEXTURE_SHARED_SIZE                        = 0x8C3F,
        GL_TEXTURE_RED_TYPE                           = 0x8C10,
        GL_TEXTURE_GREEN_TYPE                         = 0x8C11,
        GL_TEXTURE_BLUE_TYPE                          = 0x8C12,
        GL_TEXTURE_ALPHA_TYPE                         = 0x8C13,
        GL_TEXTURE_DEPTH_TYPE                         = 0x8C16,
        GL_TEXTURE_COMPRESSED                         = 0x86A1,
        GL_SAMPLER_2D_MULTISAMPLE                     = 0x9108,
        GL_INT_SAMPLER_2D_MULTISAMPLE                 = 0x9109,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE        = 0x910A,
        GL_VERTEX_ATTRIB_BINDING                      = 0x82D4,
        GL_VERTEX_ATTRIB_RELATIVE_OFFSET              = 0x82D5,
        GL_VERTEX_BINDING_DIVISOR                     = 0x82D6,
        GL_VERTEX_BINDING_OFFSET                      = 0x82D7,
        GL_VERTEX_BINDING_STRIDE                      = 0x82D8,
        GL_VERTEX_BINDING_BUFFER                      = 0x8F4F,
        GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET          = 0x82D9,
        GL_MAX_VERTEX_ATTRIB_BINDINGS                 = 0x82DA,
        GL_MAX_VERTEX_ATTRIB_STRIDE                   = 0x82E5;

    protected GLES31() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDispatchCompute ] ---

    /** {@code void glDispatchCompute(GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z)} */
    public static native void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z);

    // --- [ glDispatchComputeIndirect ] ---

    /** {@code void glDispatchComputeIndirect(GLintptr indirect)} */
    public static native void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect);

    // --- [ glDrawArraysIndirect ] ---

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static native void nglDrawArraysIndirect(int mode, long indirect);

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 4 * 4);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        nglDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (4 * 4) >> 2);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    // --- [ glDrawElementsIndirect ] ---

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static native void nglDrawElementsIndirect(int mode, int type, long indirect);

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 5 * 4);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        nglDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (5 * 4) >> 2);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    // --- [ glFramebufferParameteri ] ---

    /** {@code void glFramebufferParameteri(GLenum target, GLenum pname, GLint param)} */
    public static native void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glGetFramebufferParameteriv ] ---

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetFramebufferParameteriv(int target, int pname, long params);

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFramebufferParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramInterfaceiv ] ---

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static native void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params);

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramInterfacei(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceIndex ] ---

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static native int nglGetProgramResourceIndex(int program, int programInterface, long name);

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
    }

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetProgramResourceIndex(program, programInterface, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceName ] ---

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static native void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name);

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetProgramResourceName(program, programInterface, index, bufSize, memAddress(length), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return glGetProgramResourceName(program, programInterface, index, glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH));
    }

    // --- [ glGetProgramResourceiv ] ---

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static native void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params);

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
    }

    // --- [ glGetProgramResourceLocation ] ---

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static native int nglGetProgramResourceLocation(int program, int programInterface, long name);

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
    }

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetProgramResourceLocation(program, programInterface, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUseProgramStages ] ---

    /** {@code void glUseProgramStages(GLuint pipeline, GLbitfield stages, GLuint program)} */
    public static native void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program);

    // --- [ glActiveShaderProgram ] ---

    /** {@code void glActiveShaderProgram(GLuint pipeline, GLuint program)} */
    public static native void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program);

    // --- [ glCreateShaderProgramv ] ---

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    public static native int nglCreateShaderProgramv(int type, int count, long strings);

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return nglCreateShaderProgramv(type, strings.remaining(), memAddress(strings));
    }

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, strings);
            int __result = nglCreateShaderProgramv(type, strings.length, stringsAddress);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, string);
            int __result = nglCreateShaderProgramv(type, 1, stringsAddress);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindProgramPipeline ] ---

    /** {@code void glBindProgramPipeline(GLuint pipeline)} */
    public static native void glBindProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glDeleteProgramPipelines ] ---

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static native void nglDeleteProgramPipelines(int n, long pipelines);

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") IntBuffer pipelines) {
        nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int pipeline) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.ints(pipeline);
            nglDeleteProgramPipelines(1, memAddress(pipelines));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenProgramPipelines ] ---

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static native void nglGenProgramPipelines(int n, long pipelines);

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    @NativeType("void")
    public static int glGenProgramPipelines() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.callocInt(1);
            nglGenProgramPipelines(1, memAddress(pipelines));
            return pipelines.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsProgramPipeline ] ---

    /** {@code GLboolean glIsProgramPipeline(GLuint pipeline)} */
    @NativeType("GLboolean")
    public static native boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glGetProgramPipelineiv ] ---

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static native void nglGetProgramPipelineiv(int pipeline, int pname, long params);

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
    }

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramPipelinei(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniform1i ] ---

    /** {@code void glProgramUniform1i(GLuint program, GLint location, GLint v0)} */
    public static native void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glProgramUniform2i ] ---

    /** {@code void glProgramUniform2i(GLuint program, GLint location, GLint v0, GLint v1)} */
    public static native void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glProgramUniform3i ] ---

    /** {@code void glProgramUniform3i(GLuint program, GLint location, GLint v0, GLint v1, GLint v2)} */
    public static native void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glProgramUniform4i ] ---

    /** {@code void glProgramUniform4i(GLuint program, GLint location, GLint v0, GLint v1, GLint v2, GLint v3)} */
    public static native void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glProgramUniform1ui ] ---

    /** {@code void glProgramUniform1ui(GLuint program, GLint location, GLuint v0)} */
    public static native void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glProgramUniform2ui ] ---

    /** {@code void glProgramUniform2ui(GLuint program, GLint location, GLuint v0, GLuint v1)} */
    public static native void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glProgramUniform3ui ] ---

    /** {@code void glProgramUniform3ui(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2)} */
    public static native void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glProgramUniform4ui ] ---

    /** {@code void glProgramUniform4ui(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3)} */
    public static native void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glProgramUniform1f ] ---

    /** {@code void glProgramUniform1f(GLuint program, GLint location, GLfloat v0)} */
    public static native void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glProgramUniform2f ] ---

    /** {@code void glProgramUniform2f(GLuint program, GLint location, GLfloat v0, GLfloat v1)} */
    public static native void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glProgramUniform3f ] ---

    /** {@code void glProgramUniform3f(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glProgramUniform4f ] ---

    /** {@code void glProgramUniform4f(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glProgramUniform1iv ] ---

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform1iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform1iv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2iv ] ---

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform2iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3iv ] ---

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform3iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform3iv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4iv ] ---

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform4iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1uiv ] ---

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform1uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uiv ] ---

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform2uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uiv ] ---

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform3uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform3uiv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uiv ] ---

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform4uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1fv ] ---

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform1fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform1fv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fv ] ---

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform2fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fv ] ---

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform3fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform3fv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fv ] ---

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform4fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fv ] ---

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fv ] ---

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fv ] ---

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fv ] ---

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fv ] ---

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fv ] ---

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fv ] ---

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fv ] ---

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fv ] ---

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glValidateProgramPipeline ] ---

    /** {@code void glValidateProgramPipeline(GLuint pipeline)} */
    public static native void glValidateProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glGetProgramPipelineInfoLog ] ---

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static native void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog);

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(bufSize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline) {
        return glGetProgramPipelineInfoLog(pipeline, glGetProgramPipelinei(pipeline, GLES20.GL_INFO_LOG_LENGTH));
    }

    // --- [ glBindImageTexture ] ---

    /** {@code void glBindImageTexture(GLuint unit, GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum access, GLenum format)} */
    public static native void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format);

    // --- [ glGetBooleani_v ] ---

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    public static native void nglGetBooleani_v(int target, int index, long data);

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    public static void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetBooleani_v(target, index, memAddress(data));
    }

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    @NativeType("void")
    public static boolean glGetBooleani(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer data = stack.calloc(1);
            nglGetBooleani_v(target, index, memAddress(data));
            return data.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMemoryBarrier ] ---

    /** {@code void glMemoryBarrier(GLbitfield barriers)} */
    public static native void glMemoryBarrier(@NativeType("GLbitfield") int barriers);

    // --- [ glMemoryBarrierByRegion ] ---

    /** {@code void glMemoryBarrierByRegion(GLbitfield barriers)} */
    public static native void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers);

    // --- [ glTexStorage2DMultisample ] ---

    /** {@code void glTexStorage2DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static native void glTexStorage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glGetMultisamplefv ] ---

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static native void nglGetMultisamplefv(int pname, int index, long val);

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        if (CHECKS) {
            check(val, 1);
        }
        nglGetMultisamplefv(pname, index, memAddress(val));
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    @NativeType("void")
    public static float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer val = stack.callocFloat(1);
            nglGetMultisamplefv(pname, index, memAddress(val));
            return val.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSampleMaski ] ---

    /** {@code void glSampleMaski(GLuint maskNumber, GLbitfield mask)} */
    public static native void glSampleMaski(@NativeType("GLuint") int maskNumber, @NativeType("GLbitfield") int mask);

    // --- [ glGetTexLevelParameteriv ] ---

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static native void nglGetTexLevelParameteriv(int target, int level, int pname, long params);

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
    }

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexLevelParameteri(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexLevelParameterfv ] ---

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static native void nglGetTexLevelParameterfv(int target, int level, int pname, long params);

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
    }

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTexLevelParameterf(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindVertexBuffer ] ---

    /** {@code void glBindVertexBuffer(GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride)} */
    public static native void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride);

    // --- [ glVertexAttribFormat ] ---

    /** {@code void glVertexAttribFormat(GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset)} */
    public static native void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexAttribIFormat ] ---

    /** {@code void glVertexAttribIFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static native void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexAttribBinding ] ---

    /** {@code void glVertexAttribBinding(GLuint attribindex, GLuint bindingindex)} */
    public static native void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex);

    // --- [ glVertexBindingDivisor ] ---

    /** {@code void glVertexBindingDivisor(GLuint bindingindex, GLuint divisor)} */
    public static native void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor);

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GLES.getICD().glDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (4 * 4) >> 2);
        }
        callPV(mode, indirect, __functionAddress);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GLES.getICD().glDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (5 * 4) >> 2);
        }
        callPV(mode, type, indirect, __functionAddress);
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetFramebufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramInterfaceiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, programInterface, pname, params, __functionAddress);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GLES.getICD().glGetProgramResourceName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, programInterface, index, name.remaining(), length, memAddress(name), __functionAddress);
    }

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramResourceiv;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPPV(program, programInterface, index, props.length, props, params.length, length, params, __functionAddress);
    }

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glDeleteProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glGenProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pipeline, pname, params, __functionAddress);
    }

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineInfoLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(pipeline, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        long __functionAddress = GLES.getICD().glGetMultisamplefv;
        if (CHECKS) {
            check(__functionAddress);
            check(val, 1);
        }
        callPV(pname, index, val, __functionAddress);
    }

    /** {@code void glGetTexLevelParameteriv(GLenum target, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexLevelParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, level, pname, params, __functionAddress);
    }

    /** {@code void glGetTexLevelParameterfv(GLenum target, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetTexLevelParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, level, pname, params, __functionAddress);
    }

}
package com.github.otya128;

public enum Register {
    /**
     * Primary accumulator
     */
    AX,
    /**
     * counter
     */
    CX,
    /**
     * accumulator other functions
     */
    DX,
    /**
     * base
     */
    BX,
    /**
     * Stack Pointer
     */
    SP,
    /**
     * Base Pointer
     */
    BP,
    /**
     * Source Index
     */
    SI,
    /**
     * Destination Index
     */
    DI,
    /**
     * Instruction Pointer
     */
    IP;
    final public static int Length = 0x08;
}

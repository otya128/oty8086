package com.github.otya128;

/**
 * Decode Binary
 */
public class Decoder {
    static Decoder dummy = null;
    static Object[][] table = new Object[][]
            {
                    {0x88, 0x8B, dummy},
                    {0xC6, 0xC7, dummy},
                    {0xB0, 0xBF, dummy},
                    {0xA0, 0xA1, dummy},
                    {0xA2, 0xA3, dummy},
                    {0x8E, dummy},
                    {Bin.b10001100,dummy},
                    {Bin.b11111111,dummy},
            };
    Machine8086 machine8086;
    public Decoder(Machine8086 machine80861)
    {
        this.machine8086 = machine80861;
    }
    public void Decode()
    {

    }
}

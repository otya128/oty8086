package com.github.otya128;

/**
 * Decode Binary
 */
public class Decoder {
    static Decoder dummy = null;
    /**
     * table array
     * format:
     * {int min,int ,max,dec}
     * create table from min to max
     * {int x,dec}
     * x
     * {O min,O max,dec}
     * {O x,dec}
     * //
     * {String format, dec}
     */
    static Object[][] table = new Object[][]
            {
                    {0x88, 0x8B, dummy},
                    {0xC6, 0xC7, dummy},
                    {0xB0, 0xBF, dummy},
                    {0xA0, 0xA1, dummy},
                    {0xA2, 0xA3, dummy},
                    {0x8E, dummy},
                    {O.b10001100,dummy},
                    {O.b11111111,dummy},
                    {O.b1010000,O.b1010111,dummy},
                    {"000reg110",dummy},
                    {"10001111",dummy},
                    {"01011reg",dummy},
                    {"000reg111",dummy},
                    {"1000011w",dummy},
                    {"10010reg",dummy},
                    {"1110010w",dummy},
                    {"1110110w",dummy},
                    {"1110011w",dummy},
                    {"1110111w",dummy},
                    //XLAT
                    {"11010111",dummy},
                    //LEA
                    {"10001101",dummy},
                    //LDS
                    {"11000101",dummy},
                    //LES
                    {"11000100",dummy},
                    //LAHF
                    {"10011111",dummy},
                    //SAHF
                    {"10011110",dummy},
                    //PUSHF
                    {"10011100",dummy},
                    //POPF
                    {"10011101", dummy},

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

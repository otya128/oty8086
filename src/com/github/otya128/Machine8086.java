package com.github.otya128;
import java.io.IOException;
import java.io.Reader;
public class Machine8086 {
    final static int MaxMemory = 1048576;
    protected byte[] Memory;
    protected short[] Registers;
    protected short[] Segments;
    public short GetRegister(Register register)
    {
        return Registers[register.ordinal()];
    }
    public void SetRegister(Register register, short value)
    {
        Registers[register.ordinal()] = value;
    }
    public void IncRegister(Register register)
    {
        Registers[register.ordinal()]++;
    }
    public void DecRegister(Register register)
    {
        Registers[register.ordinal()]--;
    }
    public short GetSegment(Segment segment)
    {
        return Segments[segment.ordinal()];
    }
    public void SetSegment(Segment segment, short value)
    {
        Segments[segment.ordinal()] = value;
    }
    public void IncSegment(Segment segment)
    {
        Segments[segment.ordinal()]++;
    }
    public void DecSegment(Segment segment)
    {
        Segments[segment.ordinal()]--;
    }
    public Machine8086()
    {
        this.Registers = new short[Register.Length];
        this.Segments = new short[Segment.Length];
        this.Memory = new byte[MaxMemory];
    }
    public void Run()
    {
        while(true)
        {
            IncRegister(Register.IP);
        }
    }
    public void LoadBin(Reader reader) throws IOException
    {
        int bin = 0;
        int pc = 0;
        while(reader.ready()) {
            bin = reader.read();
            this.Memory[pc] = (byte)bin;
            pc++;
        }
    }
}

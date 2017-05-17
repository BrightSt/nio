package ibmdw.nio.buffer;// $Id$

import java.nio.ByteBuffer;

public class TypesInByteBuffer {
    static public void main(String args[]) throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(64);

        buffer.putInt(30); //4字节
        buffer.putLong(7000000000000L); //8字节
        buffer.putDouble(Math.PI); //8字节

        buffer.flip();

        System.out.println(buffer.getInt());//4
        System.out.println(buffer.getLong());//8
        System.out.println(buffer.getDouble());//8
    }
}

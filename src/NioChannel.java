import java.nio.ByteBuffer;

public interface NioChannel
{
    public int read(ByteBuffer byteBuffer);

    public int write(ByteBuffer byteBuffer);
}

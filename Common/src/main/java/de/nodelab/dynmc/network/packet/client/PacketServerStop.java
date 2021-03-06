package de.nodelab.dynmc.network.packet.client;

import de.nodelab.dynmc.network.packet.Packet;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import lombok.Data;

import java.io.IOException;

@Data
public class PacketServerStop implements Packet {

    private String id;

    @Override
    public void readFrom(ByteBufInputStream stream) throws IOException {
        this.id = stream.readUTF();
    }

    @Override
    public void writeTo(ByteBufOutputStream stream) throws IOException {
        stream.writeUTF(this.id);
    }

}
